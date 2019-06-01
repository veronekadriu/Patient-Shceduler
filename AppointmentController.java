import javax.swing.*;
public class AppointmentController{

   public Appointment[][] appointments;
   private AppointmentReader app; 
   private int key=0;
   
   private String name ="";
  
   public AppointmentController(AppointmentReader app){
    this.app = app;
    // this.w = w;
    appointments = new Appointment[7][25];
   }
   
   public void run(){
    

   
   String input = JOptionPane.showInputDialog("Shtyp 1 per te shtuar nje termin, 2 per te nderruar," + '\n' +"3 per te fshire, 4 per te paraqitur te gjitha terminet dhe " + '\n' + " 5 per te mbyllur programin.");
   
   if(input == null || (input != null && ("".equals(input))))   {
     run();
   }
   else{
   int action = new Integer(input).intValue();
   
   switch(action){
      case 1:
         newApp();
         break;
      case 2:
         updateApp();
         break;
      case 3:
         deleteApp();
         break;
      case 4:
         listApp();
         break;
      case 5:
         System.exit(0);
         break;
      default: 
         JOptionPane.showMessageDialog(null,"Gabim ne komande. Provoni perseri.");
     
      }
     run();
      }
     } 
      
      
      public void newApp(){

         int day = app.readDay("Shkruani diten ne Formatin: Monday ose Mon ose mo");
         int hour = app.readHour("Shruani oren ne Formatin: 0-24");
         
         Appointment newAppointment = new Appointment(day, hour);
         
        
         if(appointments[day][hour] != null){
            JOptionPane.showMessageDialog(null, "Ju keni termin ne kete kohe zgjidhni nje tjeter!");
            
         }
         else{
         
         
         appointments[day][hour] =  newAppointment; 
         JOptionPane.showMessageDialog(null, "Keni krijuar nje termin me sukses!"); 
             
         
         }
             
      }
      
      public void updateApp(){
         int dita = app.readDay("Shkruani cilen dite deshironi ta nderroni terminin");
         int ora = app.readHour("Shkruani cilen ore deshironi ta nderroni terminin ");
         
         if(appointments[dita][ora] == null){
         
            JOptionPane.showMessageDialog(null, "Ju nuk keni termin ne kete orar!");
         }
         else{
         appointments[dita][ora] =  null;
         int day = app.readDay("Shkruani diten e re per termin");
         int hour = app.readHour("Shkruani oren e re per termin");
        
         

         
         
         Appointment newAppointment = new Appointment(day, hour);
         
         appointments[day][hour] =  newAppointment;   
         
         }
      
      }
      
      
      public void deleteApp(){
         
         int day = app.readDay("Shkruani diten ne te cilen deshironi ta fshnini terminin");
         int hour = app.readHour("Shkruani oren ne te cilen deshironi ta fshini terminin");
         
         if( appointments[day][hour] == null){ JOptionPane.showMessageDialog(null, "Ju nuk keni termin ne kete dite!");}
         else{int ans = JOptionPane.showConfirmDialog(null, "A je te sigurt qe deshirni te fshini terminin?");
         if(ans == 0){
         
         appointments[day][hour] = null;}
       }  
         
      
      }
      
      public void listApp(){
      
      for(int i = 0 ; i <= 24; i++){
         for(int j=0; j<7; j++){
         if(appointments[j][i] != null){
            
           JOptionPane.showMessageDialog(null, "Day: " + appointments[j][i].getDay() + " Hour: "+ appointments[j][i].getHour() + "\n");
           System.out.println( "Day: " + appointments[j][i].getDay() + " Hour: "+ appointments[j][i].getHour() + "\n");
           System.out.println( "--------------------------------------");
         }
       }          }
      }
      
         
      
      
      
      
      
      
    }
      
      
      
   
   
   
   
  







