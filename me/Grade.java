import java.util.Scanner;
public class Grade{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int grade;
		System.out.println("������ѧ���ɼ�:");
		grade=Integer.parseInt(sc.nextLine());
		if(grade>100){
			System.out.println("�ɼ��������!");
		}else  if(grade>=90){
			System.out.println("����!\t"+"�ɼ�Ϊ:"+grade);
		}else if(grade>=80){
			System.out.println("����\t"+"�ɼ�Ϊ:"+grade);
		}else if(grade>=70){
			System.out.println("��!\t"+"�ɼ�Ϊ:"+grade);
		}else if(grade>=60){
			System.out.println("����!\t"+"�ɼ�Ϊ:"+grade);
		}else if(grade>=0){
			System.out.println("������!\t"+"�ɼ�Ϊ:"+grade);
		}else{
			System.out.println("�ɼ��������");
		}
	}
}