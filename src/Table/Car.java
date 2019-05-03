
package Table;

import java.sql.Date;


public class Car {
    
    private int id;
    private Date date;
    private String model_id;
    private String color;
    private String year;
    private String Price;
    
    public Car(){
        
    }
    
    public Car(int id, Date date, String model_id, String color, String year, String price){
      this.id=id;
      this.date=date;
      this.model_id=model_id;
      this.color=color;
      this.year=year;
      this.Price=price;
    }
    
    public Car(String model_id, String color, String year, String price){
      this.model_id=model_id;
      this.color=color;
      this.year=year;
      this.Price=price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getModel_id() {
        return model_id;
    }

    public void setModel_id(String model_id) {
        this.model_id = model_id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

     @Override
    public String toString() {
        return String
                .format("Car [id=%s, date=%s, model_id=%s, color=%s ,year=%s, Price=%s]",
                        id,date,model_id,color,year,Price);
    }
   
} //end class
