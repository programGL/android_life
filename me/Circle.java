import java.util.Scanner;
public class Circle{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double r,perimeter,area;
		System.out.println("������뾶:");
		r=Double.parseDouble(sc.nextLine());
		perimeter=2*Math.PI*r;
		area=Math.PI*r*r;
		System.out.printf("�뾶=%.2f\n",r);
		System.out.printf("�ܳ�=%.2f\n",perimeter);
		System.out.printf("���=%.2f\n",area);
	}
}
