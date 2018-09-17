import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class FinalFrame  extends JFrame{

	Object[][] tData;
	public FinalFrame(Object[][] tData)
	    {
	        //headers for the table
		   this.tData=tData;
	        String[] columns = new String[] {
	            "Group Members","Normalized Score"
	        };
	         
	       
	        //create table with data
	        JTable table;
	       
	        	table = new JTable(tData, columns);
	       
	        JPanel panel = new JPanel();
	        panel.add(new JScrollPane(table));
	        this.add(panel);
	        this.setTitle("Table Example");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
	        this.pack();
	        this.setVisible(true);
	    }

	public static void main(String[] args) {
		/*SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TableFrame();
			}
		});*/
	}

}
