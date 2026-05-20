package ex10;

public class FriendTest {

	public static void main(String[] args) {
		
		/*
		 * Friend 클래스 타입의 배열을 생성한다. (원소 5 개)  Friend 타입의 객체들을 저장
 		   5개의 Friend 객체를 생성한다. (객체 생성시 입력되는 정보는 임의로 정한다.)
          각 Firend 객체의 정보를 getInfo() 라는 메서드를 호출하여 실행 결과 예와 같이 출력 한다
		 */
		
		Friend[] arr = new Friend[5];
		arr[0] = new Friend("까미", "010", "test@test.com");
		arr[1] = new Friend("로이", "111", "test2@test.com");
		arr[2] = new Friend("강산", "222", "abc@test.com");
		arr[3] = new Friend("뽀양", "333", "abc2@test.com");
		arr[4] = new Friend("야옹", "444", "test3@test.com");
		
		for(int i=0; i<arr.length; ++i) {
			System.out.println(arr[i].getInfo());
		}

	}

}
