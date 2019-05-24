import java.util.*;
public class ElementAtItsPlace{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int arraySize = s.nextInt();
	int i,j,max=0;
	int a[]=new int[arraySize];
	for(i=0;i<arraySize;i++){
		a[i]=s.nextInt();
		if(max<a[i])
			max=a[i];
		}
	System.out.print(" "+max);
	int b[]=new int[max+1];
	for(i=0;i<=max;i++)
		b[i]=-1;
	for(i=0;i<arraySize;i++){
		j=a[i];
		b[j]=j;
		}
		System.out.println();

	for(i=0;i<=max;i++)
		System.out.print(b[i]+" ");
	}
	
}
			
		