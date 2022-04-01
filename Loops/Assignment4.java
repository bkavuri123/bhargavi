package Loops;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {34,56746,123,5467,87689,4653};
		int min = a[0];
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(min>a[i]) 
			{
				min = a[i];
			}
			if(max<a[i])
			{
				max = a[i];
			}
		}
		System.out.println("min value in an array::"+min);
		System.out.println("max value in an array::"+max);
	}

}
