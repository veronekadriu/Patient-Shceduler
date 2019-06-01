public class Appointment {
   public int day;
   public int hour;
   
   public Appointment(int day, int hour) {
      this.day = day;
      this.hour = hour;
   }
  
   
    public String getDay() {
    String dita= "";
      if(day == 0){
         dita= "Monday";
         
      }
      else if(day == 1){
         dita = "Tuesday";
      }
       else if(day == 2){
         dita = "Wednesday";
      }
       else if(day == 3){
         dita = "Thursday";
      }
       else if(day == 4){
         dita = "Friday";
      }
       else if(day == 5){
         dita = "Saturday";
      }
       else if(day == 6){
         dita = "Sunday";
      }
      
      return dita;
   }
   
    public int getHour() {
      return hour;
   }
 }