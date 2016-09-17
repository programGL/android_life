public class BasicDataType{
	public static void main(String[] args){
		int i=100;
		int iHex=0xae;
		int iOct=070;
		
		short s=1;
		long l1=1234567890L;
		long l2=1234567890;
		float f=3.14f;
		double d1=3.1415926D;

		double d2=3.1415926;
		char c1='a';
		char c2=97;
		char c3='\t';
		char c4='\u0061';
		boolean b=true;
		System.out.println("基本数据类型:");
		System.out.println("整型1:"+i);
		System.out.println("整型2:"+iHex);
		System.out.println("整型3:"+iOct);
		System.out.println("短整型:"+s);
		System.out.println("长整型1:"+l1);
		System.out.println("长整型2:"+l2);
		System.out.println("单精度浮点型:"+f);
		System.out.println("双精度浮点型1:"+d1);
		System.out.println("双精度浮点型2:"+d2);
		System.out.println("字符型1:"+c1);
		System.out.println("字符型2:"+c2);
		System.out.println("字符型3:"+c3+"转义字符");
		System.out.println("字符型4:"+c4);
		System.out.println("布尔型:"+b);
	}
}
