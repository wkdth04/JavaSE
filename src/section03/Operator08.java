package section03;
/*
 * 8. 삼항 연산자
 * 	조건식 ? 조건식이 참일 경우 반환 : 조건식이 거짓일 경우 반환
 * 
 */
public class Operator08 {
	public static void main(String[] args) {
		int num = 32;
		String result = num >= 0 ? "num은 양수" : "num은 음수";
		
		System.out.println(result);
		
		if(num >= 0) {
			result = "num은 양수";
		} else {
			result = "num은 음수";
		}
		System.out.println(result);
		
	}

}





