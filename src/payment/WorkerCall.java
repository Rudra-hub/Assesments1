package payment;

public class WorkerCall{
	public static void main(String args[])
	{
		DailyWorker d=new DailyWorker("kafil",500,72);
		System.out.println("salary of dailyworkers is: ");
		d.pay();
		
		SalariedWorker s=new SalariedWorker("rahman",5000,80);
		System.out.println("salary of salaried worker is: ");
		s.pay();
	}

}
