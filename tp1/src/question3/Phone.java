package question3;

public class Phone extends Device implements MobileNetwork{
    private int batteryLevel;

    public Phone(int hauteur, int largeur){
        this.setHeight(hauteur);
        this.setWidth(largeur);
    }

    public Phone(String operatingSystem){
        this.setOperatingSystem(operatingSystem);
    }

    public boolean isTactile() { return true; }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) { this.batteryLevel = batteryLevel; }

    public String networkType(){
        return "4G";
    }
}
