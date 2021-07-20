package payment;

abstract class Worker{
	String workerName;
	int salaryrate;
	public Worker(String workerName, int salaryrate) {
		super();
		this.workerName = workerName;
		this.salaryrate = salaryrate;
	}
	abstract void pay();
}
	
class DailyWorker extends Worker{
	private int hours;

	public DailyWorker(String workerName, int salary ,int hours) {
		super(workerName, salary);
		this.hours=hours;
		
	}

	@Override
	void pay() {
		int days=hours/24;
		System.out.println(salaryrate*days);
		
	}
	
}

class SalariedWorker extends Worker{
	private int hours;

	public SalariedWorker(String workerName, int salaryarte,int hours) {
		super(workerName, salaryarte);
		this.hours=hours;
		// TODO Auto-generated constructor stub
	}

	@Override
	void pay() {
		int weeks=hours/40;
		System.out.println(salaryrate*weeks);
	}
	
}