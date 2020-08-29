/* Program 5 - Write one real time example in which instanceof operator is used.
* Draw JVM architecture of it
*/

class SolarSystem {
	public static void main(String[] args) {
		
		SolarSystem earth = new SolarSystem();
		SolarSystem moon = new SolarSystem();
		SolarSystem mars = new SolarSystem();
		SolarSystem jupyter = new SolarSystem();
		SolarSystem pluto = null;

		System.out.println(earth instanceof SolarSystem);       //true
		System.out.println(moon instanceof SolarSystem);        //true
		System.out.println(mars instanceof SolarSystem);        //true
		System.out.println(jupyter instanceof SolarSystem);     //true
		System.out.println(pluto instanceof SolarSystem);       //false
	}
}
