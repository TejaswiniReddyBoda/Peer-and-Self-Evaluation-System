import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionFrame  extends JFrame{

    private JLabel label;	
    private JButton button1;
    private JButton button2;

    public QuestionFrame(int num) {
  
    	//define label
        label = new JLabel("Did you previously take the survey?");
        
        //define button1
        button1 = new JButton("yes");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            	//########need rewrite#########
                new TableFrame(num,true);
            	//########need rewrite#########
            }
        });
		
        //define button2
        button2 = new JButton("no");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            	//########need rewrite#########
            	new TableFrame(num,false);
            	//########need rewrite#########
            }
        });

        //define panel
		JPanel panel = new JPanel();
		add(panel);

		panel.add(label);
        panel.add(button1);		        
        panel.add(button2);

        //Output the frame
        this.setTitle("QuestionFrame");
        this.setSize(400, 300);        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    	
    }    
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//QuestionFrame frame = new QuestionFrame();
        
	}

}
