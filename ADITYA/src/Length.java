import java.util.Scanner;
class Length {
	static int Length(char[]a){
	int n=0;
	for(char i:a) {
		n++;
	}
	return    n;
}
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scan=new Scanner(System.in);
		char[]a=scan.nextLine().toCharArray();
		int n;
		n=Length(a);
		System.out.println("Length="+n);
	}

}
