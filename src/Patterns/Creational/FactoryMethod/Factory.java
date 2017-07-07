package Patterns.Creational.FactoryMethod;

public class Factory {
    public static IThing factoryMethod(String name){
        if(name.equals("car")){
            return new Car();
        }
        else if(name.equals("pen")){
            return new Pen();
        }
        return null;
    }

    public static void main(String[] args) {
        IThing item= Factory.factoryMethod("pen");
        item.buy();
        System.out.println(item.getPrice());
    }

}
