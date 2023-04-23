package week1.day1;

public class Mobile{
	
public void makeCall() {
	
	String mobileModel = "Samsung";
	float mobileWeight = 0.25f;
	
	System.out.println("This is my samsung mobile with 0.25kg of weight");
}

public void sendMsg() {
	
	Boolean fullCharged = true;
	int mobileCost = 1000;
	
	System.out.println("This is my mobile cost 1000 and full charged!");
}


public static void main(String[] args)
{
	Mobile obj=new Mobile();
	obj.makeCall();
	obj.sendMsg();
	
}
}
