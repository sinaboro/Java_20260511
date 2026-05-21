package ex03;

public class Company {

	public static void main(String[] args) {
	// Employee 배열에 객체들을 생성하여 저장한다.
		Employee[] emp = new Employee[2];
		emp[0] = new Secretary("Duke", 1, "secretary", 800);
		emp[1] = new Sales("Tuxi", 2, "sales", 1200);
		
	// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보를 출력한다.
	// 이 때는 세금을 출력하지 않는다.
		printEmployee(emp, false);
	// 모든 직원에게 인센티브로 100씩 지급한다.(직원에 따라 적용되는 인센티브 금액은 다르다.
	// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보 와 세금을 출력한다. 
	}

	public static void printEmployee(Employee[] emp, boolean isTax){
		// 객체의 정보를 출력한다.(실행 결과를 참조)
		// isTax 의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다
		
	}
}
