import java.util.Scanner;
public class Grade2{
	public static void main(String[] args){
		//使用switch来实现grade现实的功能
		int grade,gradeLevel;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入成绩:!");
		grade=Integer.parseInt(sc.nextLine());
		gradeLevel=grade/10;
		if(grade==100){
			System.out.println("优秀!");
		}
		switch(gradeLevel){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:System.out.println("不及格!");break;
			case 6: System.out.println("及格!");break;
			case 7: System.out.println("中!");break;
			case 8:System.out.println("良!");break;
			case 9:System.out.println("优!");break;
			default:System.out.println("成绩输入错误!!");break;
		}
	}
}