import java.util.Stack;

public class staticvariable {
    public static void main(String[] args) {
        sstudent s1 = new sstudent();
        s1.schoolname = "ssm";

        sstudent s2 = new sstudent();
        System.out.println(s2.schoolname);

        sstudent s3 = new sstudent();
        s3.schoolname = "excellence"; //agr iske bad me ab koi value change kru to vo changed hi print hogi



    }
}
class sstudent{
    String name;
    int roll;

    static String schoolname;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}