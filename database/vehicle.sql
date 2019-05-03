-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 04, 2018 at 04:08 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vehicle`
--

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `model_id` int(11) NOT NULL,
  `color` varchar(20) NOT NULL,
  `year` int(11) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`id`, `date`, `model_id`, `color`, `year`, `price`) VALUES
(10, '2015-02-02', 3, 'black', 2014, 30000),
(12, '2013-09-01', 3, 'اسود', 2012, 17200),
(13, '2016-03-21', 4, 'ابيض', 2013, 25400),
(14, '2017-08-23', 4, 'رصاصي', 2016, 45000),
(16, '2016-05-18', 5, 'ابيض', 2015, 54000);

--
-- Triggers `car`
--
DELIMITER $$
CREATE TRIGGER `copyDeleted` AFTER DELETE ON `car` FOR EACH ROW INSERT INTO car_del (id,date,model_id,color,year,price) VALUES (old.id,old.date,old.model_id,old.color,old.year,old.price)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `create_date` BEFORE INSERT ON `car` FOR EACH ROW SET NEW.date = NOW()
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `car_del`
--

CREATE TABLE `car_del` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `model_id` int(11) NOT NULL,
  `color` varchar(20) NOT NULL,
  `year` int(11) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `car_del`
--

INSERT INTO `car_del` (`id`, `date`, `model_id`, `color`, `year`, `price`) VALUES
(17, '2018-02-07', 5, 'blue', 2008, 2000),
(18, '2017-12-03', 5, 'اسود', 2017, 76500),
(23, '2016-03-03', 3, 'red', 2008, 20000),
(26, '2018-02-24', 3, 'blue', 2007, 30000),
(31, '2018-03-01', 4, 'red', 2009, 30000),
(33, '2018-03-04', 12, 'black', 2016, 25000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `email` varchar(32) DEFAULT NULL,
  `is_admin` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `name`, `password`, `email`, `is_admin`) VALUES
(4, 'assil', '4321', 'assil@gmail.com', 1),
(111, 'ahmed', '1234', NULL, 0),
(222, 'shomos', '2345', NULL, 0),
(333, 'walid', '3456', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `model`
--

CREATE TABLE `model` (
  `id` int(11) NOT NULL,
  `make` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `class` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `model`
--

INSERT INTO `model` (`id`, `make`, `name`, `class`) VALUES
(3, 'Hyundai', 'Verna', 'SEDAN'),
(4, 'Hyundai', 'Avante', 'SEDAN'),
(5, 'Hyundai', 'SantaFi', 'SUV'),
(12, 'Kia', 'rio', 'SEDAN'),
(32, 'kia', 'sport', 'AUV');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `id` int(11) NOT NULL,
  `model_id` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `Date` date NOT NULL,
  `payment_type` varchar(15) NOT NULL,
  `user_id` int(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`id`, `model_id`, `price`, `year`, `Date`, `payment_type`, `user_id`) VALUES
(1, 3, 30000, 2007, '2018-03-04', 'check', 4),
(2, 4, 30000, 2009, '2018-03-04', 'cash', 222),
(5, 12, 25000, 2017, '2018-03-04', 'cash', 222),
(6, 5, 20000, 2008, '2018-03-04', 'check', 333),
(7, 5, 76500, 2017, '2018-03-04', 'cash', 111);

--
-- Triggers `sales`
--
DELIMITER $$
CREATE TRIGGER `salesdate` BEFORE INSERT ON `sales` FOR EACH ROW SET NEW.date = NOW()
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`id`),
  ADD KEY `model_id` (`model_id`);

--
-- Indexes for table `car_del`
--
ALTER TABLE `car_del`
  ADD PRIMARY KEY (`id`),
  ADD KEY `model_id` (`model_id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `name` (`name`);

--
-- Indexes for table `model`
--
ALTER TABLE `model`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user` (`user_id`) USING BTREE,
  ADD KEY `model_id` (`model_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `car`
--
ALTER TABLE `car`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT for table `car_del`
--
ALTER TABLE `car_del`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT for table `model`
--
ALTER TABLE `model`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;
--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `car`
--
ALTER TABLE `car`
  ADD CONSTRAINT `car_ibfk_1` FOREIGN KEY (`model_id`) REFERENCES `model` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sales`
--
ALTER TABLE `sales`
  ADD CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `login` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sales_ibfk_2` FOREIGN KEY (`model_id`) REFERENCES `car_del` (`model_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
