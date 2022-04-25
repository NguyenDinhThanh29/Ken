public class Student {
    private int RollNo;
    private String name;
    private Classroom myClass;
    public Student(int RollNo,String name,Classroom myClass){
        this.RollNo = RollNo;
        this.name = name;
        this.myClass = myClass;
    }
    public int getRollNo() {
        return RollNo;
    }
    public String getName() {
        return name;
    }

    public Classroom getMyClass() {
        return myClass;
    }

    @Override
    public String toString() {
        return "'" + name + "' by id " + myClass;
    }
    public static void main(String[] args) {
        Student a1 = new Student(1,"Thanh",new Classroom(192,"IT"));
        System.out.println(a1);
        System.out.println("RollNo: " + a1.getRollNo());
        System.out.println("Name: " + a1.getName());
        System.out.println("Student : " + a1.getMyClass());
    }
}