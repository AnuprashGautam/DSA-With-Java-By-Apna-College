class Student
{
    String name;
    int rollNo;
    int[] marks= new int[3];

    Student()
    {
        // Non-parameterized constructor
    }

    Student(Student s2)     // Copy constructor
    {
        this.name=s2.name;
        this.rollNo=s2.rollNo;
        this.marks=s2.marks;
    }
    public static void main (String[] args)
    {
        Student s1=new Student();    
        s1.name="Anuprash";
        s1.rollNo=22;
        s1.marks[0]=100;
        s1.marks[1]=100;
        s1.marks[2]=90;

        Student s2=new Student(s1);         // Creating object by using the copy constructor
        s2.marks[2]=100;

        System.out.println("\nPrinting the s1 marks:");
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.print(s1.marks[i]+" ");
        }

        System.out.println("\nPrinting the s2 marks:");
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.print(s2.marks[i]+" ");
        }
    }
}