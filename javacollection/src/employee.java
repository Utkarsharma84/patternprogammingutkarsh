public class employee implements Comparable<employee>{
    int id ;
    String name ;
    double fees;
    String brance;
    int age;

    public employee(int id,String name,double fees,String brance,int age) {
      this.id=id;
      this.name=name;
      this.fees=fees;
      this.brance= brance;
      this.age=age;

    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                ", brance='" + brance + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(employee o) {
        if (this.fees==o.fees){
            return 0;
        }
        if (this.fees>o.fees){
            return 1;
        }
        else return -1;

    }
}
