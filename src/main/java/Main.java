


public class Main {
  public static void main(String[] args) {

    boolean pineapple;
    boolean mayo;
    boolean pizza, burger;

    pineapple = true;
    mayo = false;
    pizza = true;
    burger = false;

    if(!pineapple && pizza) {
      System.out.println("I hate pineapple on pizza");
    
    }
    
      
    else {
      System.out.println("I love pizza without the hated pineapple");
      
      if (!(mayo && burger)) {
        System.out.println("I love mayo on burgers");
      }
        
      else if (!burger){
        System.out.println("Where is my burger?");
      }
      
    }
    ///////////////////////////////////////



    
    
  }
}