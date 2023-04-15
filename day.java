class data{
    //encapsulation

    private String name;

    public void namein(String input){
        this.name=input;
    }

    public void print(){
        System.out.println(name);
    }
}


class Container{
//Access Modifiers

    public int x=5;
    protected int y=6;
    private int z=10;


    public void printmethod(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public void running(){
        System.out.println("Running");
    }

}


class Container1 extends Container{
    //inheritance
    //polymorphism
    public void method1(){
        System.out.println("Sum : "+ x+y);
    }


    public void running(int s){
        System.out.println("He is running "+s+" times");
    }
}


abstract class Container2{
    //abstraction
    protected int k=5;
    public abstract void jump();
    public void jumpn(){
        System.out.println("He is jumping "+k);
    }
}



class Container3 extends Container2{

   public void jump(){
    System.out.println("He is jumping");
   }
    
}





public class day{
    public static void main(String[] args) {
     
        //access
        Container1 o1=new Container1();
        o1.printmethod();
        o1.method1();
        o1.running();
        o1.running(2);

        Container3 o2=new Container3();
        o2.jump();
        o2.jumpn();

        data o3=new data();
        o3.namein("rahul");
        o3.print();



        //

    }
}