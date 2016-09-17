import java.util.Scanner;
public class GCDLCM{
	public static void main(String[] args){
		int m,n;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("输入数字m:");
			m=Integer.parseInt(sc.nextLine());
			System.out.println("输入数字n:");
			n=Integer.parseInt(sc.nextLine());
		}while(n<=0||m<=0);
		//求最大公约数
		int temp=m>n?n:m;
		for(int i=temp;i>0;i--){
			if(m%i==0&&n%i==0){
				System.out.println(m+"和"+n+"的最大公约数是:"+i);
				break;
			}
		}
		temp=m>n?m:n;
		for(int i=temp;i<=m*n;i++){
			if(i%m==0&&i%n==0){
				System.out.println(m+"和"+n+"的最小公倍数是:"+i);
				break;
			}
		}
	}
}