class Student
{
    String name;
    int rollNo;

    // Student()   // Non-parameterized constructor
    // {
    //     System.out.println("Object created without any parameters.");
    // }

    Student(String name)
    {
        System.out.println("This is parameterized constructor.");
        this.name=name;
    }

    Student(int rollNo)
    {
        System.out.println("This is parameterized constructor.");
        this.rollNo=rollNo;
    }
    Student(String name, int rollNo)
    {
        System.out.println("This is parameterized constructor.");
        this.name=name;
        this.rollNo=rollNo;
    }

    public static void main (String[] args)
    {
        // Student s1=new Student();    // Non-parameterized constructor is not present.
        Student s2=new Student("Anuprash");
        Student s3=new Student(22);
        Student s4=new Student("Anuprash", 22);
    }
}