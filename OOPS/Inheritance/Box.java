package OOPS.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    public Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
}
