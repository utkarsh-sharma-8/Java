package OOPS.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(double side, double weight){
        super(side);// call the parent constructor
        //use to initialise values of parent class
        this.weight=weight;
    }
}
