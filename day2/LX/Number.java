/*
	java中的基本数据类型
	1.整型
		1.byte 1个字节 占8bit
		2.short 2个字节 
		3.int 4个字节
		4.long 8个字节，声明变量时要加L；
	2.浮点型
		1.float 4个字节，声明变量时要加F;
		2.double 8个字节 ，声明变量时要加D;
	3.布尔型
		1.boolean 1个字节  （true|false）
	4.字符型
		char型 占2个字节
	注意char型和int型能够自动转换。
*/
public class Number{
	public static void main(String[] args){
		byte myByte=123;
		int myInt=23;
		short myShort=12;
		long myLong=234L;
		System.out.println("myByte:"+myByte+"myInt"+myInt+"myShort"+myShort+"myLong"+myLong);
		char c='c';
		int num=c;
		System.out.println("c的ASCII码是:"+num);
		int b=98;
		char x=(char)b;
		System.out.println("98对应的字符是:"+c);
	}
}