public class Circle extends Shape {
   private int x;
   private int y;
   private int radius;
   
   private DrawAPI api;
   
   public Circle(int x, int y, int radius, DrawAPI api) {
      this.api = api;
      this.x = x;
      this.y = y;
      this.radius = radius;
      
   }
   
   public String draw() {
      api.drawCircle(x, y, radius);
      return "Circle Drawn";
   }

}