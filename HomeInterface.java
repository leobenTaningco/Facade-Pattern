public class HomeInterface{
    private Lights lights;
    private Tv tv;
    private AirConditioning airConditioning;

    public HomeInterface(Lights lights, Tv tv, AirConditioning airConditioning){
        this.lights = lights;
        this.tv = tv;
        this.airConditioning = airConditioning;

    }

    public void turnOnLights(){
        lights.turnOn();
    }

    public void turnOffLights(){
        lights.turnOff();
    }

    
    public void turnOnTv(){
        tv.turnOn();
    }

    public void turnOffTv(){
        tv.turnOff();
    }

    public void turnOnAirConditioning(){
        airConditioning.turnOn();
    }

    public void turnOffAirConditioning(){
        airConditioning.turnOff();
    }

    public void turnOnAll(){
        lights.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll(){
        lights.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}