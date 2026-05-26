package ex03;

interface ButtonClick{
	void click();   //버튼이 클릭이 되었요!    
}


class ButtonClass implements ButtonClick{

	@Override
	public void click() {
		System.out.println("버튼이 클릭이 되었요!");
	}
}

public class Main {

	public static void main(String[] args) {
		
		ButtonClick bc = new ButtonClass();
		bc.click();
	}

}
