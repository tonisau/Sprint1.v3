package Tasca7.Nivell1ENG.n1exercici2;

public class Exercise {
	public static void main(String[] args) {
		WorkerOnline onlineWorker = new WorkerOnline("Marina", "Rodriguez", 9);
		WorkerInPerson inPersonWorker = new WorkerInPerson("Alejandro", "Gonzalez", 9);

		makePhoneCallPrank(onlineWorker);
		makePrank(inPersonWorker);
	}
	
	@SuppressWarnings("deprecation")
	private static void makePrank(WorkerInPerson worker) {
		worker.prank();
	}
	
	@SuppressWarnings("deprecation")
	private static void makePhoneCallPrank(WorkerOnline worker) {
		worker.phoneCallPrank();
	}
}
