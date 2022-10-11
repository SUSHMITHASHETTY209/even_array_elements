import java.util.*;
public class evenarray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int l;
		System.out.println("Enter number of elements in the array:");
		l=sc.nextInt();
		int[] a=new int[l];
		int[] b=new int[l];
		int j=0;
		System.out.println("Enter the array elements:");
		for(int i=0;i<l;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<l;i++){
			if(a[i] % 2==0){
				b[j]=a[i];
				j++;
			}
		}
		if(j==0){
			System.out.println("the given array doesnt contain even elements");
		}
		else{
			System.out.println("even array elements:");
			for(int i=0;i<j;i++){
				System.out.println(b[i]);
			}
		}
	}
}