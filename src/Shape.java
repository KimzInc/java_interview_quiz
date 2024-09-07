import java.util.ArrayList;
import java.util.List;

 class Shape{
    private String name;
    private double diameter;

    
    public String getName(){
        return name;
    }
    public double getDiameter(){return diameter;}

    public void setName(String name) {
        this.name = name;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return String.format("%s [%.2f]", getName(), getDiameter());
    }

    public Shape(String name, double diameter) {
        this.name = name;
        this.diameter = diameter;
    }
}

 class Entry2 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape("s1", 286));
        shapes.add(new Shape("s2", 512));
        shapes.add(new Shape("s3", 268));
        shapes.add(new Shape("s4", 258));
        shapes.add(new Shape("s5", 431));
        shapes.add(new Shape("s6", 289));

        Shape s =shapes.stream().reduce(shapes.get(0), (a,b)
        -> a.getDiameter()>b.getDiameter() ?a:b);
        System.out.println(s);

    }
}

