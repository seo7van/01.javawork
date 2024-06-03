package _03_bank;

public class T01_api_bank {

	private int balance;
	
	// 입금
	void deposit(int money) {      
		balance += money;
	}
	
	// 출금
	void witdraw(int money){       
		if(balance < money)
			System.out.println("잔고부족");
		else
			balance -= money;
	}
	
	// 잔액 조회
	int getBalance() {              
		return balance;
	}
}