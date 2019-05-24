import java.util.*;
public class ReverseArray{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int arraysize=s.nextInt();
	int i,j,temp=0;
	int a[]=new int[arraysize];
	for(i=0;i<arraysize;i++)
		a[i]=s.nextInt();
	i=0;
	j=arraysize-1;
	while(i<=j){
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
		}
	for(i=0;i<arraysize;i++)
		System.out.print(a[i]+" ");
	}
}
	