/*Program 5: Write 2 classes as Pune, Mumbai. Add the following things:
class Pune :
	static variable : int covidActiveCases
	instance variable : int totalCases
	static method : noCorona
	instance method : lockdown
					  noLockdown
class Mumbai :
	static variable : int covidActiveCases
	instance variable : int totalCases
	static method : noCorona
	instance method : lockdown
				      noLockdown
Increment both the variables in non-static method. Call non-static methods twice,
display the output and observe the changes. Draw JVM architecture for the same.

*/


class Pune {
	
	static int covidActiveCases = 4000;
	int totalCases = 10000;

	static void noCorona() {
		System.out.println("Go Corona");
	}

	void lockdown() {
		covidActiveCases++;
		totalCases++;
		System.out.println("Covid Active Cases = " + covidActiveCases);
		System.out.println("Total Cases = " + totalCases);
	}

	void noLockdown() {
		covidActiveCases++;
		totalCases++;
		System.out.println("Covid Active Cases = " + covidActiveCases);
		System.out.println("Total Cases = " + totalCases);
	}
}

class Mumbai {
	
	static int covidActiveCases = 15000;
	int totalCases = 80000;

	static void noCorona() {
		System.out.println("Go Corona");
	}

	void lockdown() {
		covidActiveCases++;
		totalCases++;
		System.out.println("Covid Active Cases = " + covidActiveCases);
		System.out.println("Total Cases = " + totalCases);
	}

	void noLockdown() {
		covidActiveCases++;
		totalCases++;
		System.out.println("Covid Active Cases = " + covidActiveCases);
		System.out.println("Total Cases = " + totalCases);
	}
}

class CoronaCases {
	public static void main (String[] args) {
		
		Pune jul10 = new Pune();
		jul10.lockdown();
		jul10.lockdown();
		jul10.noLockdown();
		jul10.noLockdown();

		Mumbai jul12 = new Mumbai();
		jul12.lockdown();
		jul12.lockdown();
		jul12.noLockdown();
		jul12.noLockdown();


	
	}	
}
