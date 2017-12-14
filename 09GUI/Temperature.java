import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Temperature extends JFrame implements ActionListener{
    public static void main(String[] args){
        Temperature w = new Temperature();
	w.setVisible(true);
    }
    private Container c;
    private JTextField t;
    private JButton b,f;
    
    public Temperature(){
	this.setTitle("Temperature Converter 9001");
	this.setSize(280,60);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setResizable(false);
	
	c = this.getContentPane();	
	c.setLayout(new FlowLayout());
	t = new JTextField(20);
	b = new JButton("CtoF");
	f = new JButton("FtoC");
	
	t.addActionListener(this);
        b.addActionListener(this);
        f.addActionListener(this);
	
	c.add(t);
	c.add(b);
	c.add(f);
    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
	double temp = Double.parseDouble(t.getText());
	if (s.equals("CtoF")){
	    t.setText("" + CtoF(temp));
	}
	if (s.equals("FtoC")){
	    t.setText("" + FtoC(temp));
	}
    }
    public static double CtoF(double t){
	return t * 9 / 5 + 32;
    }
    public static double FtoC(double t){
	return (t - 32) * 5 / 9;
    }
}
