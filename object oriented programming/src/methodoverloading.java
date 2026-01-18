public class methodoverloading {
    public static void main(String[] args) {
  calcuator cal = new calcuator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum((float)1,(float) 2));
        System.out.println(cal.sum(1,2,3));
    }
}
class calcuator{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}