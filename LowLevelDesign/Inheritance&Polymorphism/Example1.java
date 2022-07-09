
import java.io.*;
import java.util.*;

public class Example1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Case 1
        P obj = new P();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        // System.out.println(obj.d2); // compile time
        obj.fun();
        obj.fun1();
        // obj.fun2();// compile time error

        // Case 2
        System.out.println("CASE 2 C REF AND C INST");
        C obj1 = new C();
        System.out.println(obj1.d);
        System.out.println(obj1.d1);
        System.out.println(obj1.d2);
        obj1.fun();
        obj1.fun1();
        obj1.fun2();

        // Case 3
        System.out.println("CASE 3 P REF AND C INST");
        P obj2 = new C();
        System.out.println(obj2.d);
        System.out.println(obj2.d1);
        // System.out.println(obj2.d2); //compiler error
        obj2.fun();
        obj2.fun1();
        // obj2.fun2(); //compiler error

        // Case 4
        System.out.println("CASE 4 C REF AND P INST \n Compile error");
        // C obj3 = new P(); //Compile time error
        // System.out.println(obj3.d);
        // System.out.println(obj3.d1);
        // System.out.println(obj3.d2);
        // obj3.fun();
        // obj3.fun1();
        // obj3.fun2();
    }

    static class P {
        int d = 1;
        int d1 = 10;

        void fun1() {
            System.out.println("P's fun1");
        }

        void fun() {
            System.out.println("P's fun");
        }
    }

    static class C extends P {
        int d = 2;
        int d2 = 20;

        void fun2() {
            System.out.println("C's fun2");
        }

        void fun() {
            System.out.println("C's fun");
        }
    }
}
