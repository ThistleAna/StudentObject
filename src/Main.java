public class Main {
    public static void main(String[] args) {
    // create s1
        Student s1 = new Student("Ada", 23 , true);
        System.out.println("Name = " + s1.getName() + ", Age = " + s1.getAge());
        System.out.println("Register as a student = " + s1.getStudent());
    // create s2
        Student s2 = new Student("Bob", 25, true);
        System.out.println("Name = " + s2.getName() + ", Age = " + s2.getAge());
        System.out.println("Register as a student = " + s2.getStudent());
        // create s3, "Charlie", 30
        Student s3 = new Student("Charlie", 30, false);
        System.out.println("Name = " + s3.getName() + ", Age = " + s3.getAge());
        System.out.println("Register as a student = " + s3.getStudent());
    }
}
