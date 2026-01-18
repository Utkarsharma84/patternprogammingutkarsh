public class oops {



    public static void main(String[] args) {
        Pen p1 = new Pen();// created a pen object
         p1.setColour("blue");
        System.out.println(p1.getcolour());
        p1.setTip(5);
        System.out.println(p1.gettip());
        p1.setColour("yellow");
        System.out.println(p1.getcolour());
//        bankaccount myacc= new bankaccount();
//        myacc.name= "utkarsh sharma";
//        myacc.setpassword("ut84rh");
//        System.out.println(myacc.name);

    }
}


    class Pen {
        // prop + fun
       private String colour;
       private int tip;

       String getcolour(){ //getters
           return this.colour;
       }
       int gettip(){  //getters
           return this.tip;
       }

        void setColour(String newcolour) { //setters
            colour = newcolour;
        }

        void setTip(int newtip) {        //setters
            tip = newtip;

        }
    }
//    class bankaccount{
//       public String name;
//       private String password;
//       public void setpassword(String pwd){
//           password=pwd;
//
//       }
//    }

//    class studentt {
//        String name;
//        int age;
//        float percentage;
//
//        void calcpercentage(int phy, int chem, int math) {
//            percentage = (phy + chem + math) / 3;
//        }
//
//    }


