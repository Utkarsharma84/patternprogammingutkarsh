public class oppsinterface {
    public static void main(String[] args) {
        king k1 = new king();
        k1.moves();  // interface
    }
}

interface chess {
    void moves();
}

class queen implements chess{
    public void moves(){
        System.out.println("up,down,left,right,digonal in all directions");
    }
}
class rook implements chess{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class king implements chess{
    public void moves(){
        System.out.println("up,down,left,right,digonal in all directions by 1 step");
    }
}
class pown implements chess{
    public void moves(){
        System.out.println("moves in one direction by one step");
    }
}