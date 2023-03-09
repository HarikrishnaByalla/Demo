package Association;

class phone {
	String phoneName;
	Battery battery;

	public phone(String phoneName, Battery battery) {
		this.phoneName = phoneName;
		this.battery = battery;
	}

	public void call(Sim s) {
		s.calingtpe();
	}
}

class Sim {
	String simtype;

	public Sim(String simtype) {
		this.simtype = simtype;
	}

	public void calingtpe() {
		System.out.println(simtype + " allows using of internet over calling ");
	}
}

class Battery {
	String batteryName;

	public Battery(String batteryName) {
		this.batteryName = batteryName;
	}
}

public class PhoneCall {

	public static void main(String[] args) {
		Battery b = new Battery("Li ion");
		phone p = new phone("redmi", b);
		Sim s = new Sim("airtel");
		p.call(s);
		// Or
		// p.call(new Sim("airtel"));

	}

}
