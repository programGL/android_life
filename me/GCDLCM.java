import java.util.Scanner;
public class GCDLCM{
	public static void main(String[] args){
		int m,n;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("��������m:");
			m=Integer.parseInt(sc.nextLine());
			System.out.println("��������n:");
			n=Integer.parseInt(sc.nextLine());
		}while(n<=0||m<=0);
		//�����Լ��
		int temp=m>n?n:m;
		for(int i=temp;i>0;i--){
			if(m%i==0&&n%i==0){
				System.out.println(m+"��"+n+"�����Լ����:"+i);
				break;
			}
		}
		temp=m>n?m:n;
		for(int i=temp;i<=m*n;i++){
			if(i%m==0&&i%n==0){
				System.out.println(m+"��"+n+"����С��������:"+i);
				break;
			}
		}
	}
}