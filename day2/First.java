public class First{
	public static void main(String[] args){
		String str1="hello world!";
		System.out.println(str1.length());
		int size=str1.indexOf("world");
		System.out.println(size);
		int size1=str1.lastIndexOf("l");
		System.out.println(size1);
		int size2=str1.lastIndexOf("");
		System.out.println("str1的长度:"+str1.length()+"lastIndexOf:"+size2);
		//lastIndexOf("")得到的结果与length()得到的结果相同
	}
}