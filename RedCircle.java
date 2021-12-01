public class RedCircle implements DrawAPI {
   
   @Override
   public void drawCircle(int x, int y, int r) {
      System.out.println("Drawing Circle[ color: red, radius: " + r + ", x: " + x + ", " + y + "]");
   }

}