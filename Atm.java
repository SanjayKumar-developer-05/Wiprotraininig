public class Atm {
    private int pin=54321;
	private double balance = 10_00_000;
	
	public boolean checkPin(int userPin) {
		return userPin == pin;
	}
	
	public void withdraw(double amount,int userPin) {
		if(checkPin(userPin)) {
			if(amount <= balance) {
				balance-= amount;
				System.out.println("₹" + amount +"withdrawn successfully");
			}
			else {
				System.out.println("Not enough balance");
			}
		}
		else {
			System.out.println("wrong password!");
		}

	}
	
	public void showBalance(int userPin) {
		if(checkPin(userPin)) {
			System.out.println("current Balance:₹"+balance);
		}else {
			System.out.println("wrong pin!");
		}
			
		
	}

}
class WithDraw {
    public static void main(String[] args) {
        Atm atm = new Atm();
        
     
        atm.showBalance(54321);     
        atm.withdraw(5000, 54321);  
        atm.showBalance(54321);     
        atm.withdraw(1000, 12345);  
        atm.showBalance(11111);     
    }
}
