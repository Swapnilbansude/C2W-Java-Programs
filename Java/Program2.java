

class IndianArmy {
	static String chief = "Lt Gen Manoj Naravane";
	int noOfEquipments = 0;

	static void chiefDetails() {
		System.out.println("The chief of Indian Army is " + chief);
	}

	void equipmentDetails() {
		System.out.println("The no of equipments in army = " + noOfEquipments);
	}
}

class IndianAirForce {
	static String chief = "Marshal Rakesh Kumar Singh Bhadauria";
	int noOfEquipments = 0;

	static void chiefDetails() {
		System.out.println("The chief of Indian Air Force is " + chief);
	}

	void equipmentDetails() {
		System.out.println("The no of equipments in air force = " + noOfEquipments);
	}
}

class IndianNavy {
	static String chief = "Admiral Karambir Singh";
	int noOfEquipments = 0;

	static void chiefDetails() {
		System.out.println("The chief of Indian Navy is " + chief);
	}

	void equipmentDetails() {
		System.out.println("The no of equipments in navy = " + noOfEquipments);
	}
}

class India {
	public static void main (String[] args) {
		
		IndianArmy dec31 = new IndianArmy();
		dec31.chiefDetails();
		dec31.noOfEquipments = 10000;
		dec31.equipmentDetails();

		IndianAirForce sept30 = new IndianAirForce();
		sept30.chiefDetails();
		sept30.noOfEquipments = 20000;
		sept30.equipmentDetails();

		IndianNavy may31 = new IndianNavy();	
		may31.chiefDetails();
		may31.noOfEquipments = 30000;
		may31.equipmentDetails();
	}

}
	
