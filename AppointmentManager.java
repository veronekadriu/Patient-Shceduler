public class AppointmentManager {
  
   public static void main(String[] args) {
      AppointmentReader r = new AppointmentReader();
      AppointmentController obj = new AppointmentController(r);
      obj.run();
   }
}