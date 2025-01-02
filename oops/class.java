class Pen{
    String color;
    String type;
    
    public void Write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
public class Main{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "gel";
        
        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "ball";
        
        pen1.Write();
        pen1.printColor();
        pen2.printColor();
    }
}
