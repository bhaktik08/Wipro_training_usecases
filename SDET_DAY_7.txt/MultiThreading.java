package day7_Assignment;

 class DeliverySystem {
	synchronized void processTask(String taskName) {
		try {
			System.out.println(taskName + " started");
			Thread.sleep(2000);
			
		    System.out.println(taskName + " completed");
		}
		catch(InterruptedException e) {
			System.out.println(taskName + " interrupted");
		}
	}
}

class FoodDelivery extends Thread {
	
	DeliverySystem ds;
	
	public FoodDelivery(String name, DeliverySystem ds) {
		setName(name);
		this.ds = ds;
	}
	
	public void run() {
		ds.processTask(getName());
	}
}

public class multi1 {

public static void main(String[] args) throws InterruptedException {

	DeliverySystem ds = new DeliverySystem();
	
	FoodDelivery order=new FoodDelivery(" order Processing",ds);
	FoodDelivery kitchen=new FoodDelivery(" order preparing",ds);
	FoodDelivery delivery=new FoodDelivery(" order is ready to deliver",ds);

	order.setPriority(Thread.MAX_PRIORITY);
	kitchen.setPriority(Thread.NORM_PRIORITY);
	delivery.setPriority(Thread.MIN_PRIORITY);

	order.start();
	kitchen.start();

	System.out.println("Is order Alive? " +order.isAlive());

	order.join();
	kitchen.join();

	delivery.start();
	delivery.join();

	System.out.println("All tasks completed.");

	}

}

