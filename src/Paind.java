import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Paind extends JFrame{
    Rectangle rec;
    public Paind(){
        super("Rectangle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,100,1200,900);
        setVisible(true);
    }
    class MyCum extends JComponent{

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            Rectangle2D rect = new Rectangle2D.Double(500,100, rec.getWidth().getLength(), rec.getLength().getLength());
            g2.draw(rect);
        }
    }

    public void drawRect(Rectangle rec){
        this.rec = rec;
        add(new MyCum());
    }
}
