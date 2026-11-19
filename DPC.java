class student{
    int id;
    String name;

    student(){
        id = 0;
        name = "unknown";
    }
    student(int i, String n){
        id = 1;
        name = n;
    }
    void show(){
        System.out.println(id+" "+name);
    }
}
public class DPC{
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student(101, "prasad");

        s1.show();
        s2.show();
    }
}