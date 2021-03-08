package question1;

public class Broker implements Observer {
    private boolean etat;
    public broker(){
        this.etat=false;
    }
    public void update(){
        this.etat=!this.etat;
    }
    public boolean isChangeDetected(){
        return this.etat;
    }
}