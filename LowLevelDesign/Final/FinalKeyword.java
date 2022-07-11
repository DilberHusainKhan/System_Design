public class FinalKeyword {
    public static void main(String[] args) {
        P obj = new C();
        obj.fun();

    }

    static class P {
        final int maxScore = 100;
        int age = 10;// data-mamber

        void fun() { // if we make it final then it can't be override
            int height = 5; // variable
            System.out.println("Age = " + age);
            System.out.println("MaxScore = " + maxScore);
        }
    }

    static class C extends P {
        void fun() {
            System.out.println("This is c Max" + maxScore);
            age = 20;// can be reassign because we can't use final 
            System.out.println("This is c Age" + age);
        }
    }
}