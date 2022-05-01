public class Program2 {
    public static class Student {
        int age;
        String name;

        void announceYourSelf() {
            System.out.println(this.name + "[ " + this.age + " ].");
        }
    }

    public static void swap(Student s1, Student s2) {
        // Student temp = s1;
        // s1 = s2;
        // s2 = temp;
        // --> No swapping is done by above code because swapping done only at swap
        // function level;

        int tage = s1.age;
        s1.age = s2.age;
        s2.age = tage;

        String tname = s1.name;
        s1.name = s2.name;
        s2.name = tname;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";

        Student s2 = new Student();
        s2.age = 20;
        s2.name = "B";

        s1.announceYourSelf();
        s2.announceYourSelf();
        swap(s1, s2);
        s1.announceYourSelf();
        s2.announceYourSelf();
    }
}
