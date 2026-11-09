class Student {
    String name;
    int marks;
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Umesh";
        s1.marks = 90;

        s2.name = "Rahul";
        s2.marks = 80;

        System.out.println(s1.name + ": " + s1.marks);
        System.out.println(s2.name + ": " + s2.marks);
    }
}
