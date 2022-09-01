public class HexaToDecimal {
	private static int hextoDecimal(String hexa) {
		// TODO Auto-generated method stub
		String A ="0123456789ABCDEF";
		hexa=hexa.toUpperCase();
		System.out.println(hexa);
		int num= 0;  
		for (int i = 0; i <hexa.length(); i++)  
		{  
			char ch = hexa.charAt(i);  
			int n = A.indexOf(ch);  
			num = 16*num + n;  
		}  
		return num;  
	}
	public static void main(String[]args) {
		System.out.println("Decimal Equivalent of 7A is:"+hextoDecimal("7A"));
	}
}