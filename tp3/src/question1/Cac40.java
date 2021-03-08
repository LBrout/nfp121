package question1;

import java.util.ArrayList;
public class Cac40 extends Observable{

    private ArrayList<Observer> listBroker;
    private int value;
    public Cac40(){
        listBroker=new ArrayList<Broker>();
        value=0;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value=value;
        notifyObserver();
    }
    @Override
    public void add(Observer observer){
        listBroker.add(observer);
    }
    @Override
    public void remove(Observer observer){
        listBroker.remove(observer);
    }
    @Override
    public int getObserverCount(){
        return listBroker.size();
    }
    @Override
    private void notifyObserver(){
        for(Observer broker : this.listBroker){
            broker.update();
        }
    }
}
