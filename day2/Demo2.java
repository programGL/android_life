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
		//两个short类型的数据相加会自动转换为int型。
		System.out.println("s="+s);
	}
}