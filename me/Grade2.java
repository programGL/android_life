import java.util.Scanner;
public class Grade2{
	public static void main(String[] args){
		//ʹ��switch��ʵ��grade��ʵ�Ĺ���
		int grade,gradeLevel;
		Scanner sc=new Scanner(System.in);
		System.out.println("������ɼ�:!");
		grade=Integer.parseInt(sc.nextLine());
		gradeLevel=grade/10;
		if(grade==100){
			System.out.println("����!");
		}
		switch(gradeLevel){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:System.out.println("������!");break;
			case 6: System.out.println("����!");break;
			case 7: System.out.println("��!");break;
			case 8:System.out.println("��!");break;
			case 9:System.out.println("��!");break;
			default:System.out.println("�ɼ��������!!");break;
		}
	}
}