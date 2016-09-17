import java.util.Scanner;
public class Grade{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int grade;
		System.out.println("请输入学生成绩:");
		grade=Integer.parseInt(sc.nextLine());
		if(grade>100){
			System.out.println("成绩输入错误!");
		}else  if(grade>=90){
			System.out.println("优秀!\t"+"成绩为:"+grade);
		}else if(grade>=80){
			System.out.println("良！\t"+"成绩为:"+grade);
		}else if(grade>=70){
			System.out.println("中!\t"+"成绩为:"+grade);
		}else if(grade>=60){
			System.out.println("及格!\t"+"成绩为:"+grade);
		}else if(grade>=0){
			System.out.println("不及格!\t"+"成绩为:"+grade);
		}else{
			System.out.println("成绩输入错误");
		}
	}
}