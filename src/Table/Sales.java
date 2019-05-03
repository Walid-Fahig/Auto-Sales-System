
package Table;

import java.sql.Date;


public class Sales {
    
    private String car_id;
    private String price;
    private Date date;
    private String payment_type;
    private String user_id;
    
    public Sales(){
        
    }
    
    public Sales(String car_id,String price,Date date,String payment_type,String user_id){
        this.car_id=car_id;
       // this.model_id=model_id;
        this.price=price;
       // this.year=year;
        this.date=date;
        this.payment_type=payment_type;
        this.user_id=user_id;   
    }
    
     public Sales(String car_id,String model_id,String price,String year,String payment_type,String user_id){
        this.car_id=car_id;
       // this.model_id=model_id;
        this.price=price;
       // this.year=year;
        this.payment_type=payment_type;
        this.user_id=user_id;   
    }
    
    public Sales(String price,String payment_type,String user_id){
      //  this.model_id=model_id;
        this.price=price;
      //  this.year=year;
        this.payment_type=payment_type;
        this.user_id=user_id; 
    }

  

    public String getId() {
        return car_id;
    }

    public void setId(String car_id) {
        this.car_id = car_id;
    }
    
   /* public String getModel_id() {
        return model_id;
    }*/

   /* public void setModel_id(String car_id) {
        this.model_id = car_id;
    }*/

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

   /* public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }*/

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    
     @Override
    public String toString() {
        return String
                .format("Sales [car_id=%s , price=%s, date=%s,payment_type=%s,user_id=%s]",
                        car_id,price,date,payment_type,user_id);
    }
}//End class
