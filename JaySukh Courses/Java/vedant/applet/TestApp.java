import java.awt.*;
import java.awt.event.*;

class first extends Frame implements ActionListener
{
	TextField t1;
	TextField t2;
	TextField t3;
	first()
	{
		setLayout(new FlowLayout());
		Button b=new Button("Add");
		t1=new TextField();
		t2=new TextField();
		 t3=new TextField();
		add(t1);
		add(t2);
		add(t3);
		add(b);
		b.addActionListener(this);
		//pack();
		setVisible(true);
		setSize(400,400);
	}
	public void actionPerformed(ActionEvent e)
	{
		int r=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
		System.out.println(r);
		t3.setText(String.valueOf(r));
	}
}
public class TestApp
{


  static public void main(String args[])
  {
    	first f1=new first();


    }
}
