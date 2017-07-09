package Patterns.Structural.Facade;

public class Main {
    public static void main(String[] args) {
        SkiResortFacade skiResortFacade=new SkiResortFacade();
        System.out.println("All price for good rest: "+skiResortFacade.haveGoodRest(1,1,37,1,2));
    }
}
