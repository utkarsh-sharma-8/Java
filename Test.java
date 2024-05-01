public class Test{
    public static void main(String[] args) {
        rectangle a=new rectangle();
        System.out.println(a.area(5,10));
    }
}

abstract class Shape {
    abstract double area(int a,int b);
}

class rectangle extends Shape{
    public double area(int a,int b){
        return a*b;
    }
}
class circle extends Shape{
    public double area(int a,int b){
        return Math.PI*a*a;
    }
}