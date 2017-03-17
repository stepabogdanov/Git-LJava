import javax.swing.*;

class Window extends JFrame {
    JPanel pn1 = new JPanel();
    ImageIcon im1 = new ImageIcon ("ok.png");
    JButton but =new JButton("Hello", im1);
       
        Window() {
            super ("Swing window");
            setSize(500, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            add (pn1);
            setVisible(true);
            pn1.add(but);
        }
        public static void main (String args[]) {
        
        Window gui = new Window();
    }
}
