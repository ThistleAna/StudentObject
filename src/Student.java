public class Student {
    // list all attributes
    // shortcut to create getter and setter : Alt+insert or in mac CMD + N
    private String name;
    private int age;
    private Boolean isStudent;

    public Boolean getStudent() {
        return isStudent;
    }

    public void setStudent(Boolean student) {
        isStudent = student;
    }

    // create method constructor
    public Student(String name, int age, Boolean isStudent){
        setName(name);
        setAge(age);
        setStudent(isStudent);
    }
    // getter and setter methods for attribute name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
