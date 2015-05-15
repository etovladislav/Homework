package ru.kpfu.itis.group11408.etovladislav.polynom;


public class Polynom {
	
	private double[] koef;

	public Polynom(double[] a) {
		this.koef = a;
	}
	
	public Polynom(String a){
			// =(
	}
	
	public static void main(String[] args) {
		Polynom p = new Polynom(new double[] { 4, 6,7,8,34 });
		p.multiply(new Polynom(new double[] {4, -3,0,0, 3 }));
		System.out.print(p.toString());
		System.out.println();
	}
	
	public void multiply(Polynom p2){
	        int kol = (this.koef.length - 1) + (p2.koef.length - 1);
	        double[] result = new double[kol + 1];
	 
	        for (int i = 0; i < koef.length; i++)
	            for (int j = 0; j < p2.koef.length; j++)
	                result[i + j] += this.koef[i] * p2.koef[j];
	        
	        this.koef = result;	
	       
	    }
	 

	
	public void plus(Polynom p2) {
		double[] result = new double[Math.max(this.koef.length, p2.koef.length)];
		int minArray = Math.min(this.koef.length, p2.koef.length);
		int maxArray = Math.max(this.koef.length, p2.koef.length);
		
		if(koef.length==p2.koef.length){
			for(int i = 0; i<result.length; i++)
				result[i] = this.koef[i]+p2.koef[i];
		}
		if(koef.length>p2.koef.length){
			for(int i = 0; i<maxArray-minArray; i++)
				result[i] = this.koef[i];
			for(int i = maxArray-minArray ; i<maxArray; i++)
				result[i] = koef[i]+p2.koef[i-(maxArray-minArray)];
		}
		if(koef.length<p2.koef.length){
			for(int i = 0; i<maxArray-minArray; i++)
				result[i] = p2.koef[i];
			for(int i = maxArray-minArray ; i<maxArray; i++)
				result[i] = p2.koef[i]+koef[i-(maxArray-minArray)];
		}
		koef = result;
	}

	public void print() {
		for (double val : koef)
			System.out.print(val+" ");
	}
	
	@Override
	public String toString(){
		String p = "";
		for(int i=0; i<koef.length; i++){
			if(koef[i]==0)
				continue;
			
			if(i==koef.length-1){
				p = p+(int)koef[i];
				return p;
			}
			
			if(koef[i]==1){
				p = p+"x^"+(koef.length-i-1)+"+";
			}else
			p = p+(int)koef[i]+"x^"+(koef.length-i-1)+"+";
		}
		return p;
	}
}
