import java.util.*;
public class subArrayZero{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int arraysize = s.nextInt();
	int a[]=new int[arraysize];
	int i,f=2;
	for(i=0;i<arraysize;i++){
		a[i]=s.nextInt();}
		int sum=a[0];
	for(i=1;i<arraysize;i++){
		sum=sum+a[i];
		if(sum==0){
		f=1;
		System.out.println("true");
		break;
		}
		else{
			f=0;
			}
		}
	if(f==0)
		System.out.println("false");
	}
}
		
