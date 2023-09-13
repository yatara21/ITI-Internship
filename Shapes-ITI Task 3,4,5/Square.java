public class Square extends Shape{
		private double L;
		public Square(){}
		public Square(double L){
		this.L=L;
		}
			public void setLength(double L){
			
			this.L=L;
			
			}
			
			public double getLength(){
			return L;
			
			}
			
			public double getArea(){
			return L*L;
			
			}
			public double getPermieter(){
			return L*4;
			
			}


}