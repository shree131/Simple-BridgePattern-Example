public class GreenCircle implements DrawAPI {
   
   @Override
   public void drawCircle(int x, int y, int r) {
      System.out.println("Drawing Circle[ color: green, radius: " + r + ", x: " + x + ", " + y + "]");
   }

}