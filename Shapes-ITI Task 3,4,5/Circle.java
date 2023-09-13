public class Circle extends Shape{
	private double r;
		public Circle(){}
		public Circle(double r){
		this.r=r;
		}
			public void setRaduis(double r){
			
			this.r=r;
			
			}
			
			public double getRaduis(){
			return r;
			
			}
			
			public double getArea(){
			return Math.PI*(r*r);
			}
			
			public double getPermieter(){
			return 2*Math.PI*r;
			}
			

}