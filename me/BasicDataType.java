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
		System.out.println("������������:");
		System.out.println("����1:"+i);
		System.out.println("����2:"+iHex);
		System.out.println("����3:"+iOct);
		System.out.println("������:"+s);
		System.out.println("������1:"+l1);
		System.out.println("������2:"+l2);
		System.out.println("�����ȸ�����:"+f);
		System.out.println("˫���ȸ�����1:"+d1);
		System.out.println("˫���ȸ�����2:"+d2);
		System.out.println("�ַ���1:"+c1);
		System.out.println("�ַ���2:"+c2);
		System.out.println("�ַ���3:"+c3+"ת���ַ�");
		System.out.println("�ַ���4:"+c4);
		System.out.println("������:"+b);
	}
}
