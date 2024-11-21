interface CofeeMachine{

  void prepareCofee();

}
abstract class Cofee implements CofeeMachine{
    private int water;
    private int coffee;
    private int milk;
    public Cofee(int water, int coffee, int milk){
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
    }
    public void skladniki(){
        System.out.println("woda "+water + " kawa " + coffee + " mleko " + milk);
    }

}
class Espresso extends Cofee{
   public Espresso(int water, int coffee, int milk){
       super(water, coffee, milk);

   }
   public void prepareCofee(){
       System.out.println("wydaano 50ml espresso");
   }

}
class  Latte extends Cofee{
   public Latte(int water, int coffee, int milk){
       super(water, coffee, milk);
   }
   public void prepareCofee(){
       System.out.println("wydaano 50ml latte");
   }

}
class  Cappuccino extends Cofee{
   public Cappuccino(int water, int coffee, int milk){
       super(water, coffee, milk);
   }
   public void prepareCofee(){
       System.out.println("wydaano 50ml cappuccino");
   }

}





public class Main {
    public static void main(String[] args) {
    Espresso e = new Espresso(50, 1, 0);
    Latte l = new Latte(50, 1, 200);
    Cappuccino c = new Cappuccino(50, 1, 100);
    e.prepareCofee();
    e.skladniki();

    l.prepareCofee();
    l.skladniki();

    c.prepareCofee();
    c.skladniki();
    }
}