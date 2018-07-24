package builder;

public class Client {
    public static void main(String [] args){
        Student A = new Student.StudentBuilder().setAge(13).setName("Lihua").build();
        Student B = new Student.StudentBuilder().setSchool("123").setSex("male").build();
    }
}
