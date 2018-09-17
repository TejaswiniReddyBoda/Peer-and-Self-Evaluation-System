import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartFrame extends JFrame{

	private JLabel label;
	private JTextField textfield;
    private JButton button;
	
    public StartFrame() {

        
        //define label
        label = new JLabel("Enter the number of members in your team");

        //define JTextField
        textfield= new JTextField();
       
        
        
        //define button
        button = new JButton("ok");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            	int teammember = Integer.parseInt(textfield.getText());
            	
            	if(2<=teammember && teammember<=7) {                	
                    new QuestionFrame(teammember);
            	}
            }
        });
        
        
        //define panel
		JComponent panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));		
        this.setContentPane(panel);
		
		panel.add(label);
		panel.add(textfield);
        panel.add(button);

        //Output the frame
        this.setTitle("StartFrame");
        this.setSize(400, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }

    public static void main(String[] args) {
        StartFrame frame = new StartFrame();

    }	
	
	
}
