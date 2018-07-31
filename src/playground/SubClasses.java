package playground;

public class SubClasses {

    public static void main(String[] args) {

        new A().new InnerClass().print();
        new A.NestedClass().print();

    }

}

class A {

    static class NestedClass {
        static int a = 10; //Allowed

        public void print() {
            System.out.println("Nested Class");
        }
    }

    class InnerClass {
        //  static int a = 10;  --  Not allowed in an Inner Class
        public void print() {
            System.out.println("Inner Class");
        }
    }

}



