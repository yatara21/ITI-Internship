class MainClass{
	public static void main(String[] args){
	/*Rectangle  */
	Rectangular r1 = new Rectangular();
	r1.setLength(4);
	r1.setWidth(4);
	
	System.out.println("Area of rectangle: " +r1.getArea()); 			
	System.out.println("Perimeter of rectangle: " +r1.getPermieter()); 	
	/*Square */

	Square s1 = new Square();
	s1.setLength(3);
	System.out.println("Area of square: " +s1.getArea()); 			
	System.out.println("Perimeter of Square: " +s1.getPermieter());
	/*Circle */
		
	Circle c1 = new Circle();
	c1.setRaduis(3);
	System.out.println("Area of circle: " +c1.getArea()); 	
	System.out.println("Perimeter of circle: "+c1.getPermieter());
}
	

}