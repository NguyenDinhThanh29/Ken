public class Classroom {
    private int classid;
    private  String className;

    public Classroom(int id, String name){
        this.classid = id;
        this.className = name;
    }
    public int getClassid() {
        return classid;
    }
    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return className + " (" + classid + ")";
    }
    public static void main(String[] args) {
        Classroom a1 = new Classroom(192,"IT");
        System.out.println("Class Id: " + a1.getClassid());
        System.out.println("Class Name is: " + a1.getClassName());
    }
}
