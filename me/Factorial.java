//��n!
import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		//�ֱ�ʹ��while��for��do-while ʵ����n�Ľ׳�
		Scanner sc=new Scanner(System.in);
		int n,temp,fac=1;
		do{
			System.out.println("��������ڻ��ߵ���0������:");
			n=Integer.parseInt(sc.nextLine());
		}while(n<0);
		temp=n;
		//ʹ��whileѭ��ʵ��
		while(n>0){
			fac*=n;
			n--;
		}
		System.out.println("ʹ��whileѭ����n!��:"+fac);
		fac=1;
		n=temp;
		for(int i=1;i<=n;i++){
			fac=fac*i;
		}
		System.out.println("ʹ��forѭ����n!��:"+fac);
		fac=1;
		n=temp;
		do{
			fac*=n;
			n--;
		}while(n>0);
		System.out.println("ʹ��do-whileѭ����n!��:"+fac);
		
	}
}