public class Demo2{
	public static void main(String[] args){
		byte a=50;
		byte b=60;
		//a+=b;
		a=(byte)(a+b);
		System.out.println("a="+a);
		short s=1;
		//s+=1;
		s=s+1;
		//����short���͵�������ӻ��Զ�ת��Ϊint�͡�
		System.out.println("s="+s);
	}
}