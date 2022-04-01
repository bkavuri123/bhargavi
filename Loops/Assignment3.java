package Loops;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=36;i++)
		{
			if (i%3==0 && i%5!=0)
				System.out.println(i + " is Divisible by 3");
			else if (i%5==0 && i%3!=0)
				System.out.println(i + " is Divisible by 5");
			else if (i%3==0 && i%5==0)
				System.out.println(i + " is Divisible by 3 and 5");
			
		}
	}

}
