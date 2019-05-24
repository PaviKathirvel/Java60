import java.util.*;
public class firstRepeating{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int arraysize = s.nextInt();
	int a[]=new int[arraysize];
	int i,j,f=0;
	for(i=0;i<arraysize;i++)
		a[i]=s.nextInt();
	for(i=0;i<arraysize-1;i++){
		for(j=i+1;j<arraysize;j++){
			if(a[i]==a[j]){
				System.out.print("	"+a[i]);
				f=1;
				break;
				}
			else
				continue;
				}
		if(f==1)
			break;
			}
			
			
		if(f==0)
		System.out.println("No element is repeated");
	}
}