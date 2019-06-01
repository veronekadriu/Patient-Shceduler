import javax.swing.*;
public class AppointmentReader{
   private String inputDay="";
   private String inputHour = "";
   private int day;
   private int hour;
   private String input="";

   
  
   
   
   public int readDay(String message){
     inputDay = JOptionPane.showInputDialog(message).trim().toUpperCase();
    if((inputDay != null && ("".equals(inputDay))))   {
     readDay("Shkruani diten perseri.  Formati: Monday, mon, mo...");
   }
   
   
   
    
    else{
   
   
   switch(inputDay){
         case "MONDAY": day=0;
                        break;
         
         case "TUESDAY": day=1;
                        break;
         case "WEDNESDAY": day=2;
                        break;                
        case "THURSDAY": day=3;
                        break;
         case "FRIDAY": day=4;
                        break;
         case "SATURDAY": day=5;
                        break;
         case "SUNDAY": day=6;
                        break;
               default: day=-1;
                        
            
        
        }
        
        if(day ==-1){
        switch(inputDay.charAt(0)){
         case 'M': day=0;
                        break;
         
         case 'T': if(inputDay.charAt(1)== 'U'){day=1;}
         else{day=3;}
                     break;
         case 'W': day=2;
                        break;                
        
         case 'F': day=4;
                        break;
         case 'S': 
         if(inputDay.charAt(1)== 'A'){day=5;}
         else{day=6;}
                        break;
         
               default: day=-2;
                        JOptionPane.showMessageDialog(null, "Dita gabim");
                        readDay("Provoni diten perseri.  Formati: Monday, mon, mo...");
                        
            
        
        }}
}
        return day;
        
        
}

 public String getDay(){
   
   return inputDay;
   }

  public int readHour(String message){
    inputHour = JOptionPane.showInputDialog(message);
    if((inputHour != null && ("".equals(inputHour))))   {
     readHour("Provoni oren perseri. Formati: 0-24");
   }
   
  
   else{
   hour = new Integer(inputHour).intValue();
   if(hour <0 || hour>24){
   JOptionPane.showMessageDialog(null, "Ora gabim");
      
      hour = -1;
      readHour("Provoni oren perseri. Formati: 0-24");
   }
        }  
   return hour;
}
}