class Student{
    int marks = 80;

    void display(){
        int marks = 95;
        System.out.println(marks);
        System.out.println(this.marks);
    }
    public static void main(String args[]){
        Student s1 = new Student();

        s1.display();
    }
}