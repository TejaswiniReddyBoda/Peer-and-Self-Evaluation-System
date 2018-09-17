import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class TableFrame  extends JFrame{

	Object[][] tData;
	public TableFrame(int num, boolean noDataExists)
	    {
	        //headers for the table
	        String[] columns = new String[] {
	            "Group Members","Professionalism", "Meeting Participation", "Work Evaluation"
	        };
	         
	        tData = new Object[num][4] ;
	        
	        
	        //actual data for the table in a 2d array
	        Object[][] data = new Object[][] {
	            {1, "John", 40.0, false },
	            {2, "Rambo", 70.0, false },
	            {3, "Zorro", 60.0, true },
	        };
	        //create table with data
	        JTable table;
	        if(noDataExists) {
	        	
	        	String namePref="Teju";
		        int max=5;
		        int min=0;
		        Random rand = new Random();

		        
		        for (int i=0 ; i<num;i++) {
		        	for ( int j=0 ; j<4;j++) {
		        		
		        		if(j==0) {
		        			
		        			tData[i][j]=namePref+i;
		        			
		        		}
		        		if(j==1) {
		        			
		        			tData[i][j]=rand.nextInt((max - min) + 1) + min;
		        			
		        		}
		        		
		        		if(j==2) {
		        			
		        			tData[i][j]=rand.nextInt((max - min) + 1) + min;;
		        		}
		        		if(j==3) {
		        			
		        			tData[i][j]=rand.nextInt((max - min) + 1) + min;;
		        		}
		        		
		        		
		        		
		        	}
		        	
		        	
		        }
	          table = new JTable(tData, columns);
	        }else {
	        	table = new JTable(tData, columns);
	        }
	         
	         
	        //add the table to the frame
	        //this.add(new JScrollPane(table));
	         
	        //define button2
	        JButton button2 = new JButton("Submit");
	        button2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	            	Normalization normalizer =new Normalization();
	            	
	            	normalizer.performNormalization(tData, num, 4);
	            	
	            	new FinalFrame(normalizer.getNormalizedData());
	     	        
	            	
	            	
	            }
	        });
	        
	        JPanel panel = new JPanel();
	        panel.add(button2);
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
