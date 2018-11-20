package pak1;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Bank Bank1=new Bank("Dsk","Sofia",1211);
		Customer Customer1=new Customer("9912313","Pesho");
		VipAccount Acc1=new VipAccount("1223111452",Bank1);
		
		Customer1.CreateNewAccount(Acc1);
		Acc1.reduceMoney(5000);
		System.out.println(Acc1.getBalance());
		
	}

}
