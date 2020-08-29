
import java.io.*;

class Test {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int sumEven = 0;
		int sumOdd = 0;
		float avg1 = 0;
		float avg2 = 0;
		int ecnt = 0;
		int ocnt = 0;

		if(n < 0){
		
			for(int i=0;i>=n;i--){
			
				if(i % 2 == 0){
				
					sumEven = sumEven + i;
					ecnt++;
				} else {
				
					sumOdd = sumOdd + i;
					ocnt++;
				}
			}
			
			avg1 = (float)(sumEven/ecnt);
			avg2 = (float)(sumOdd/ocnt);
			
			if(avg1 == avg2) {
				System.out.println(avg1);
			} else {
                if(avg1 < avg2){
                    System.out.print(avg1 + " ");
                    System.out.print(avg2);
					System.out.println();
                } else {
                    System.out.print(avg2 + " ");
                    System.out.print(avg1);
   					System.out.println();                 
                }
            }
			
			if(sumEven < sumOdd){
				System.out.print(sumEven + " ");
				System.out.print(sumOdd);
			} else if(sumOdd < sumEven) {
			
				System.out.print(sumOdd + " ");
				System.out.print(sumEven);

			}

		

		} else {
		
			for(int i=0;i<=n;i++){
			
				if(i % 2 == 0){
				
					sumEven = sumEven + i;
					ecnt++;
				} else {
				
					sumOdd = sumOdd + i;
					ocnt++;
				}
			}
			
			avg1 = (float)(sumEven/ecnt);
			avg2 = (float)(sumOdd/ocnt);
			
			if(avg1 == avg2) {
				System.out.println(avg1);
			} else {
                if(avg1 < avg2){
                    System.out.print(avg1 + " ");
                    System.out.print(avg2);
					System.out.println();
                } else {
                    System.out.print(avg2 + " ");
                    System.out.print(avg1);
					System.out.println();
                    
                }
            }

			if(sumEven < sumOdd){
				System.out.print(sumEven + " ");
				System.out.print(sumOdd);
			} else if(sumOdd < sumEven) {
			
				System.out.print(sumOdd + " ");
				System.out.print(sumEven);

			}
		

		}
	}
}
