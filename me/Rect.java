import java.util.Scanner;
public class Rect{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double height,width,perimeter,area;
		System.out.println("�����볤���εĿ�:");
		width=Double.parseDouble(sc.nextLine());
		System.out.println("�����볤���εĸ�:");
		height=Double.parseDouble(sc.nextLine());
		perimeter=2*(height+width);
		area=width*height;
		System.out.println("�����εĿ�:"+width);
		System.out.println("�����εĸ�:"+height);
		System.out.println("�����ε��ܳ�:"+perimeter);
		System.out.println("�����ε����:"+area);
	}
}