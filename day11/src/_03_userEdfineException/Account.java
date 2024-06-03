package _03_userEdfineException;

public class Account {

	private int balance;
	
	// 입금
	void deposit(int money) {      
		balance += money;
	}
	
	// 출금
	void witdraw(int money) throws UserException {       
		if(balance < money) {
			throw new UserException("잔고부족 : " + (money-balance) + "모자람");
		}
		else {
			balance -= money;			
		}
	}
	
	// 잔액 조회
	int getBalance() {              
		return balance;
	}
	
	
	
}