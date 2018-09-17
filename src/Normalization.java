
public class Normalization {

	
	 Object[][] tData;
	 int row;
	 int col;
	 float totalScore=0;
	
	 Object[][] normalizedData;
	 
	void performNormalization(Object [][] tData,int row,int col) {
		
		this.tData = tData;
		this.row=row;
		this.col=col;
		this.normalizedData = new Object[row][2];
         for(int i = 0;i<row;i++) {
			
			for(int j = 0 ; j<col;j++) {
						
				if(j==0) continue;
				
				tData[i][j]=Float.parseFloat(Integer.toString((int)tData[i][j]));
				//System.out.pratintln("each row val here "+tData[i][j]);
						
			}
	     }
		
	    findTotalScore();
	    
	    for(int i = 0;i<row;i++) {
			
	    	float sum = 0;
	    	normalizedData[i][0]=tData[i][0];
			for(int j = 0 ; j<col;j++) {
						
				if(j==0) continue;
				
				sum+=(float)tData[i][j];
				//System.out.println("each row val "+tData[i][j]);
						
			}
			
			float normalized = sum/totalScore;
			
			normalizedData[i][1]= normalized;
	     }
	   
	}
	
	void findTotalScore() {
		float totalScore =0;
		for(int i = 0;i<row;i++) {
					
			for(int j = 0 ; j<col;j++) {
						
				if(j == 1 || j ==2 || j ==3) {
					
					totalScore+=(float)tData[i][j];
				}
						
			}
	     }
		
		
		this.totalScore=totalScore;
		System.out.println("totalScore "+this.totalScore);
	}
	
	
	Object[][] getNormalizedData(){
		
		return this.normalizedData;
	}
	
}
