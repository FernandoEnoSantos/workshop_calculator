package gui.util;

public class Calculations {
	
	
	public Calculations() {
		
	}
	
	public double midSum = 0.0;
	public double aux = 0.0;
	public double totalSum = 0.0;
	
	public boolean isSum;
	public boolean isSub;
	public boolean isDiv;
	public boolean isTimes;
	private boolean firstTime = true;;
	
	
	public double numberBuilder(double number,double subTotal) {
		
		Double total = 0.0;
		
		if(subTotal == 0.0) {
			total = subTotal + number;
		}	
		else {
			total = (subTotal*10.0)+number;	
		}
		return total;	
	}
	
	public void Equals() {
		
		if (totalSum == 0.0 && firstTime == true) {
			
			if(isSub == true) {
				totalSum -= midSum;
				isSub = false;
			}
			else {
				totalSum = midSum;
			}
			
			firstTime = false;
		}
		if(isSum == true) {
					
			totalSum += midSum;		
		}
		else if(isSub == true) {
					
			totalSum -= midSum;
		}
		else if(isDiv == true) {
			
			totalSum /= midSum;
		}
		else if(isTimes == true) {
			totalSum *= midSum;
		}
		
	}
	
	public void setFirstTime() {
		firstTime = true;
	}
	
	
	public void booleanReset() {
		isSum = false;
		isSub = false;
		isDiv = false;
		isTimes = false;
	}
	
	
	
	

}
