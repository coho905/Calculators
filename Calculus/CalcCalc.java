import java.util.Scanner;


public class CalcCalc {

	public static void main(String[] args) {
		Print("Integral or Derivative Calculator: ");
		Scanner scan = new Scanner(System.in); 
		String b = scan.nextLine();
		if(b.contains("d")) {
			Print("How many terms?");
			int c = (int)scan.nextInt();
			String opipo = scan.nextLine(); //throw away the \n not consumed by nextInt()
			String[] var = new String [c];
			for(int y = 0; y<c;y++) {
				Print("Poly or Trig Term: ");
				String u = scan.nextLine();
				if(u.contains("p")) {
					Print("enter the coefficient: ");
					int q = (int)scan.nextInt();
				    opipo = scan.nextLine(); //throw away the \n not consumed by nextInt()
					Print("enter the power: ");
					int p = (int)scan.nextInt();
					opipo = scan.nextLine(); //throw away the \n not consumed by nextInt()
					var[y] = polyD(q, p);
				}
				else if(u.contains("t")){
					Trig();
					int tr = (int) scan.nextInt();
					opipo = scan.nextLine(); //throw away the \n not consumed by nextInt()
					if(tr == 1) {
						var[y] = "cos(x)";
					}
					else if(tr==2) {
						var[y] = "-sin(x)";
					}
					else if(tr == 3) {
						var[y] = "sec^2(x)";				
					}
					else if(tr==4) {
						var[y] = "sec(x)tan(x)";
					}
					else if(tr==5) {
						var[y] = "-csc(x)cot(x)";
					}
					else if(tr==6) {
						var[y] = "-csc^2(x)";
					}
				}
				
			}
			Print("-----------------------");
			Print(" ");
			Print(" ");
			Print(" ");
			for(int s=0;s<c;s++) {
				if(s==c-1) {
					System.out.print(var[s]);
				}
				else {
					System.out.print(var[s] + " + ");
				}
			}
		}
		else if(b.contains("i")) {
			Print("How many terms?");
			int c = (int)scan.nextInt();
			String opipo = scan.nextLine(); //throw away the \n not consumed by nextInt()
			String[] var = new String [c];
			for(int y = 0; y<c;y++) {
				Print("Poly or Trig Term: ");
				String u = scan.nextLine();
				if(u.contains("p")) {
					Print("enter the coefficient: ");
					int q = (int)scan.nextInt();
				    opipo = scan.nextLine(); //throw away the \n not consumed by nextInt()
					Print("enter the power: ");
					int p = (int)scan.nextInt();
					opipo = scan.nextLine(); //throw away the \n not consumed by nextInt()
					p = p+1;
					if(q%p==0) {
						q = q/p;
						var[y] = (q+"x^"+ p);
					}
					else {
						var[y] = q +"/" + p + "x^" + (p) + " + ";
					}
				}
				else if(u.contains("t")){
					System.out.println("1.) -sin(x)");
					System.out.println("2.) cos(x)");
					System.out.println("3.) sec(x)tan(x)");
					System.out.println("4.) sec^2(x)");
					System.out.println("5.) -csc(x)cot(x)");
					System.out.println("6.) -csc^2(x)");
					int tr = (int) scan.nextInt();
					opipo = scan.nextLine(); //throw away the \n not consumed by nextInt()
					if(tr == 1) {
						var[y] = "cos(x)";
					}
					else if(tr==2) {
						var[y] = "sin(x)";
					}
					else if(tr == 3) {
						var[y] = "sec(x)";				
					}
					else if(tr==4) {
						var[y] = "tan(x)";
					}
					else if(tr==5) {
						var[y] = "csc(x)";
					}
					else if(tr==6) {
						var[y] = "cot(x)";
					}
				}
			}
			for(int v = 0; v<c; v++) {
					System.out.print(var[v] + " + ");
		}	
			System.out.print("C");

		}
		}


	public static String polyD(int f, int h) {
		f = f*h;
		h = h-1;
		return f+"x^"+h;
	}
	
	public static void Print(String l) {
		System.out.println(l);
	}
	public static void Trig() {
		Print("1.)  sin(x)");
		Print("2.)  cos(x)");
		Print("3.)  tan(x)");
		Print("4.)  sec(x)");
		Print("5.)  csc(x)");
		Print("6.)  cot(x)");
	}
}
