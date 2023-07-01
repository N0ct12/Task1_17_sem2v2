import java.util.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(new Rectangle.Point(1,1), new Rectangle.Point(1,202),new Rectangle.Point(202,1));
        Paind p = new Paind();
        p.drawRect(rec);
    }
}