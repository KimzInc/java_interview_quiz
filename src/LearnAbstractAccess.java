//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Animal{
    public abstract void makeNoise();
    public abstract void move();
}
abstract class Canine extends Animal{
    public void wagTail(){
        System.out.println("Wagging");
    }

    @Override
    public void move(){
        System.out.println("Run");
    }
}
class Dog extends Canine{
    public void fetch(){
        System.out.println("fetch");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}


class Entry1
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.makeNoise();
        d.move();

        d.fetch();

       Canine c = new Dog();
       c.makeNoise();
       c.move();
       c.wagTail();
       //c.fetch();

        Animal a = new Dog();
        a.makeNoise();
        a.move();
        //a.wagTail();
        //a.fetch();

        /*
        c.fetch(), a.wagTail(), and a.fetch()
        raises compile time errors
         */
    }
}
