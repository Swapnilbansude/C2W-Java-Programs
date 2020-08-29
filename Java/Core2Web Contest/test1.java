
import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		int sumEven = 0;
		int sumOdd = 0;

		if(num1 == num2 || num1 > num2) {
			System.out.println("INVALID RANGE");
		} else if(num2 > num1) {
			//sum of even and odd
			for(int i=num1; i<=num2; i++) {
			
				if(i % 2 == 0) {
					sumEven = sumEven + i;
				} else {
					sumOdd = sumOdd + i;
				}
			}
			System.out.println(sumEven);
			System.out.println(sumOdd);
			
			int even , odd;
			if(sumEven > sumOdd) {
				if(num1 % 2 == 0)
					even = num1;
				else
					even = num1+1;
				for(int i=num1; i<=num2; i++) {
					for(int j=1; j<=5 && even<=num2; j++) {
						System.out.print(even + " ");
						even = even + 2;
					}
					if(even > num2)
						break;

					System.out.println();
				}
			} else if(sumOdd > sumEven) {
				if(num1 % 2 != 0)
					odd = num1;
				else
					odd = num1+1;

				for(int i=num1; i<=num2; i++) {
					for(int j=1; j<=5 && odd<=num2; j++) {
						System.out.print(odd + " ");
						odd = odd + 2;
					}
					if(odd > num2)
						break;

					System.out.println();
				}
			
			} else if(sumEven == sumOdd) {
			
				if(num1 % 2 != 0)
					odd = num1;
				else
					odd = num1+1;

				for(int i=num1; i<=num2; i++) {
					for(int j=1; j<=5 && odd<=num2; j++) {
						System.out.print(odd + " ");
						odd = odd + 2;
					}
					if(odd > num2)
						break;

					System.out.println();
				}

			}

		}

	}
}

