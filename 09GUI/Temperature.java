import javax.swing.*;
import java.awt.*;
public class Temperature extends JFrame{
    private Container c;
    private JTextField t;
    private JButton b;
    public Temperature(){
	this.setTitle("Temperature Converter 9001");
	this.setSize(800,600);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	c = this.getContentPane();	
	c.setLayout(new FlowLayout());
	t = new JTextField(20);
	b = new JButton("CONVERT!!!");
	c.add(t);
	c.add(b);
    }
    public static void main(String[] args){
        Temperature w = new Temperature();
	w.setVisible(true);

    }
    public static double CtoF(double t){
	return t * 9 / 5 + 32;
    }
    public static double FtoC(double t){
	return (t - 32) * 5 / 9;
    }
}
