public class Computer {
	public enum Trademark {
		Samsung,
		HP,
		Lenovo,
		Sony,
		Asus
	}

	Memory memory;
	Monitor monitor;
	Processor processor;
	private boolean isTurnedOn;

	Computer() {

		this.isTurnedOn = false;
	}


	public void run() {
		if (!this.isTurnedOn) {
			this.memory = new Memory();
			this.monitor = new Monitor();
			this.processor = new Processor();
			this.processor.run();
			this.memory.run();
			this.isTurnedOn = true;
			System.out.println("Computer is running: " + this.isTurnedOn);
		} else System.out.println("COMPUTER TURNED ON");
	}

	public void shutdown() {
		if (this.isTurnedOn) {
		this.processor.shutdown();
		this.memory.shutdown();
		this.isTurnedOn = false;
		System.out.println("Computer is running: " + this.isTurnedOn);
		} else System.out.println("COMPUTER TURNED OFF");
	}

	public static void main(String [] args) {
		Computer a = new Computer();
		a.run();
		a.monitor.run();
		a.shutdown();
		a.monitor.shutdown();
	}
	
}