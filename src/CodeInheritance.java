public class CodeInheritance  {
    static {
        System.out.println("A ");
    }
    static {
        System.out.println("B ");
    }
}

class Child extends CodeInheritance{
    static {
        System.out.println("C ");
    }
    static {
        System.out.println("D ");
    }

    public static void main(String[] args) {
        Child child = new Child();

        //correction here
        int[]y = new int[5];
        float d[] = {1,2,3};
        //int x[] = int[10];   //wrong
        int a[] = {1,2,3}; int b[]; b=a;
    }
}
