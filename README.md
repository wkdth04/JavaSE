# JavaSE 수업자료 day2

```
/**
 * 
 */
package section02;

/**
 * 자바 클래스명 규칙
 * 1. 클래스명 통상 대문자로 시작
 * 2. 유효한 식별자(예:문자, 숫자, 밑줄(_)의 조합)으로 이루어져야 한다.
 * 3. 공백 포함해서는 안된다.
 * 4. 예약어를 사용해서는 안된다.
 * 
 * 낙타표기법 ConsolePrint
 * 스네이크 표기법 console_print
 * 
 * 출력문
 * System.out.println()
 * system.out.print()
 * system.out.printf()
 * 
 * 서식문자
 * %d : 정수(10진수)
 * %o : 정수(8진수)
 * %x : 정수(16진수)
 * %f : 실수
 * %s : 문자열 
 * %c : 문자
 */
public class ConsolePrint {
	//자바 프로그램 시작 메인 메소드
	public static void main(String[] args) {
		System.out.print("Welcome.");
		System.out.println("Java, World");
		System.out.println("Java, World soyeon world");
		System.out.printf("제 생일은 %d월 %d일 입니다. \n", 10, 4);
		//f는 format의 약자로 해당 형식에 맞춰 대입을해서 문자열 출력해준다는 것
		System.out.printf("%d는 첫번째 %f 두번째, %s 세번째 입니다. 그렇다면 s는 %s입니다 \n", 1, 2.0,"셋", "문자열");
		System.out.println("오늘은 "+9+ "월 " + 12 + "일 입니다");	
	
	}
```
