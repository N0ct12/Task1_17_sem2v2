public class Rectangle {

    public double getSquare() {
        return square;
    }

    public double getPerim() {
        return perim;
    }

    private double square = 0;
    private double perim = 0;

    public Side getWidth() {
        return width;
    }

    public Side getLength() {
        return length;
    }

    private Side width;
    private Side length;

    static class Point{
        private double x;

        private double y;

        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
    }

    static class Side{
        public Side(Point p1, Point p2){
            this.p1 = p1;
            this.p2 = p2;
            this.length = Math.sqrt(Math.pow((p1.getX()- p2.getX()),2)+Math.pow((p1.getY()- p2.getY()),2));
        }
        private Point p1,p2;

        public double getLength() {
            return length;
        }

        private double length = 0;

    }

    public Rectangle(Point p1, Point p2, Point p3){
        if (((p3.y-p1.y)/(p2.y-p1.y))==((p3.x-p1.x)/(p2.x-p1.x))){
            throw new RuntimeException("Точки лежат на одной прямой!");
        }
        this.width = new Side(p1,p2);
        this.length = new Side(p2,p3);
        this.square = width.length * length.length;
        this.perim = width.length * 2 + length.length * 2;
    }
}
