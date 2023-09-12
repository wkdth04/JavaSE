package section01;
/*
 * 
 */
public class comment {
	public static void main(String[] args) {
		System.out.println("Hello,java");
		
		int r =10;
		area(r);
	
	}
	/**
	 * 
	 * @param r - 반지름
	 * 
	 */
	public static void area(int r) {
		double area = Math.PI * Math.pow(r, 2);
		System.out.println("원의 넓이: "+ area);
		}
}
