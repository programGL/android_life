/*
	java�еĻ�����������
	1.����
		1.byte 1���ֽ� ռ8bit
		2.short 2���ֽ� 
		3.int 4���ֽ�
		4.long 8���ֽڣ���������ʱҪ��L��
	2.������
		1.float 4���ֽڣ���������ʱҪ��F;
		2.double 8���ֽ� ����������ʱҪ��D;
	3.������
		1.boolean 1���ֽ�  ��true|false��
	4.�ַ���
		char�� ռ2���ֽ�
	ע��char�ͺ�int���ܹ��Զ�ת����
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
		System.out.println("c��ASCII����:"+num);
		int b=98;
		char x=(char)b;
		System.out.println("98��Ӧ���ַ���:"+c);
	}
}