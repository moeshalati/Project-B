class Student{
    private int id;
    private String name;
    private int passMark = 65;

    public Student(int id) throws Exception {
        if(id < 0)
            throw new Exception("id cannot ve -ve");
        this.id = id;
    }
}

public class ex18 {

    public static void main(String[] args) throws Exception {
        Student student = new Student(-1);

    }
}
