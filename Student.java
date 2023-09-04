public class Student {
    private String name;
    private int age;
    private double grades;

    public Student(String s, int a, double b) {
        this.name = s;
        this.age = a;
        this.grades = b;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrades() {
        return grades;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    // displaying info
    public void showInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Grades : " + grades);
    }

    public static void main(String args[]) {
         Student s1=new Student("ajay", 25, 86);
         System.out.println(s1.getName());
         System.out.println(s1.getAge());
         System.out.println(s1.getGrades());
         s1.setName("sarthak");
         s1.setAge(22);
         s1.setGrades(88);
         System.out.println(s1.getName());
         System.out.println(s1.getAge());
         System.out.println(s1.getGrades());

    }
}
