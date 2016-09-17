//求n!
import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		//分别使用while、for、do-while 实现求n的阶乘
		Scanner sc=new Scanner(System.in);
		int n,temp,fac=1;
		do{
			System.out.println("请输入大于或者等于0的正数:");
			n=Integer.parseInt(sc.nextLine());
		}while(n<0);
		temp=n;
		//使用while循环实现
		while(n>0){
			fac*=n;
			n--;
		}
		System.out.println("使用while循环求n!是:"+fac);
		fac=1;
		n=temp;
		for(int i=1;i<=n;i++){
			fac=fac*i;
		}
		System.out.println("使用for循环求n!是:"+fac);
		fac=1;
		n=temp;
		do{
			fac*=n;
			n--;
		}while(n>0);
		System.out.println("使用do-while循环求n!是:"+fac);
		
	}
}