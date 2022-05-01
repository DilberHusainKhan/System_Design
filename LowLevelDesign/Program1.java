public class Program1 {
    public static class Student {
        int age;
        String name;

        void announceYourSelf() {
            System.out.println(this.name + "[ " + this.age + " ].");
        }
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

        Student s3 = s2;  //in this line object is not created S3 simply refrence the object of s2.
        s3.age = 30;
        s3.name = "C";
        s3.announceYourSelf();
        s2.announceYourSelf();
    }
}
