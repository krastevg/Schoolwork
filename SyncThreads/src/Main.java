import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int j=0;
	String[] queue = new String[20];

		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				queue[i]="Man";
			} else {
				queue[i]="Woman";
			}
		}

		System.out.println(Arrays.toString(queue));
		
		Main ob1=new Main();
	     while(j<2) {
	    	 ob1.TakingABath(queue);
	    	 j++;
	     }
		

	}

	public void TakingABath(String[] queue) {
		int mCounter = 0;
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
                for(int i=0;i<3;i++) {
				MTakeBath(queue, mCounter);}

			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				 for(int i=0;i<3;i++) {
				WTakeBath(queue, mCounter);}

			}

		});
		
		
		
			t1.start();
		
			t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(Arrays.toString(queue));
		

	}

	public synchronized void MTakeBath(String[] queue, int mCounter) {
		if(!this.QueueCheck(queue).equals("Men`s turn!")) {
			return;
		}
		for (int i = 0; i < queue.length; i++) {
			if (queue[i] == "Man") {
				queue[i]=null;
				mCounter++;

				if (mCounter == 5) {
					System.out.println("Ready! Men");
					mCounter = 0;
					
					break;

				}
			}
		}
	}

	public synchronized void WTakeBath(String[] queue, int mCounter) {

		if(!this.QueueCheck(queue).equals("Woman`s turn!")) {
			return;
		}
		for (int i = 0; i < queue.length; i++) {
			if (queue[i]=="Woman") {
				queue[i]=null;
				mCounter++;

				if (mCounter == 5) {
					System.out.println("Ready! Women");
					mCounter = 0;
					break;

				}
			}
		}

	}

	public String QueueCheck(String[] queue) {
		int mcounter = 0;
		int fcounter = 0;
		for (int i = 0; i < queue.length; i++) {
			if (queue[i] == "Man") {
				mcounter++;

				if (mcounter == 5) {

					mcounter = 0;

					return "Men`s turn!";

				}

			} else if (queue[i] == "Woman") {
				fcounter++;

				if (fcounter == 5) {

					fcounter = 0;
					return "Woman`s turn!";

				}
			}

		}

		return "Not good my boy";

	}
}
