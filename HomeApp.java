public class HomeApp{
    public static void main(String[] args){
        Lights lights = new Lights();
        Tv tv = new Tv();
        AirConditioning airConditioning = new AirConditioning();

        HomeInterface homeInterface = new HomeInterface(lights, tv, airConditioning);
       
        System.out.println("Turn on all---------------");
        homeInterface.turnOnAll();
        System.out.println("");
        System.out.println("Turn off all---------------");
        homeInterface.turnOffAll();
        
        System.out.println("");
        System.out.println("Turn on/off indivudually---------------");
        homeInterface.turnOnAirConditioning();
        homeInterface.turnOnLights();
        homeInterface.turnOffLights();
    }
}