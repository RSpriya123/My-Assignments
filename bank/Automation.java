package bank;

public class Automation extends MultipleLanguage {

	

	public void Java() {
		System.out.println("Java Programming");
		
	}

	public void Selenium() {
		System.out.println("Testing Selenium");
		
	}


	public void Ruby() {
		System.out.println("Ruby");
		
	}

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.Java();
		obj.Selenium();
		obj.Ruby();
		obj.python();

	}
}
