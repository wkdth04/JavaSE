package section02;

/*
 * 1. 논리형(boolean)
 *  true 또는 false 두가지 값을 가지는 기본 자료형
 *  1byte 
 *  
 *  선언방법
 *  boolean 변수명;
 *  ---------------------------
 *  1024byte -> 1kb
 *  
 *  
 */
public class Variable01 {
	public static void main(String[] args) {

		// 논리형 변수 선언하기
		boolean isBool;
		isBool = true;

		System.out.println("논리형 변수에 저장된 값 : " + isBool);

		// 조건문에 논리형 변수 사용하기
		if (isBool) {
			System.out.println("isBool값은 true입니다.");
		} else {
			System.out.println("isBool값은 false입니다");
		}
	}
}