public class BridgePatternDemo {

   public static void main (String args[]) {
      int x = 2;
      int y = 4;
      int r = 5;

      RedCircle rc = new RedCircle();
      GreenCircle gc = new GreenCircle();
      Shape sh = new Circle(x, y, r, rc);
      
      System.out.println(sh.draw());
      
   
   }

}