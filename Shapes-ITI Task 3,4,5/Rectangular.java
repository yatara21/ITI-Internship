public class Rectangular extends Shape{
		
		public Rectangular(){}
		public Rectangular(double L ,double W){
		this.L=L;
		this.W=W;
		}
			public void setLength(double L){
			
			this.L=L;
			
			}
			public void setWidth(double W){
			this.W=W;
			
			}
			public double getLength(){
			return L;
	
			}
			public double getWidth(){
			return W;
	
			}
			public double getArea(){
			return L*W;
	
			}
			public double getPermieter(){
			return (L+W)*2;
	
			}


}