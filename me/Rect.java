import java.util.Scanner;
public class Rect{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double height,width,perimeter,area;
		System.out.println("请输入长方形的宽:");
		width=Double.parseDouble(sc.nextLine());
		System.out.println("请输入长方形的高:");
		height=Double.parseDouble(sc.nextLine());
		perimeter=2*(height+width);
		area=width*height;
		System.out.println("长方形的宽:"+width);
		System.out.println("长方形的高:"+height);
		System.out.println("长方形的周长:"+perimeter);
		System.out.println("长方形的面积:"+area);
	}
}