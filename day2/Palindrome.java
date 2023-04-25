package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num = 34343;
		int temp , rev;
		int s=0;
 	    temp=num;
for(;num>0;num/=10)
{
rev = num%10;
s=(s*10)+rev;
}

if(s==temp)
System.out.println("34343 is a palindrome number ");
      else
System.out.println("34343 is not a palindrome number ");


	}

}
