

class Football {

}

class Cricket {
	public static void main(String[] args) {
		
		Cricket test = new Cricket();
		Football fmatch = new Football();

		System.out.println(test instanceof Cricket);          //true
		//System.out.println(Cricket instanceof Cricket);     Error
		System.out.println(test instanceof Object);           //true
		
	        //System.out.println(fmatch instanceof Cricket);        // Error  
		System.out.println(fmatch instanceof Football);       //true
		System.out.println(fmatch instanceof Object);        //true
	}
}
