package eTicaretÖdev.core.amazonEmail;

import eTicaretÖdev.amazonEmail.AmazonMailManager;
import eTicaretÖdev.core.EmailService;

public class AmazonMailManagerAdapter implements EmailService{

	private AmazonMailManager amazonMailManager;
	
	
	
	public AmazonMailManagerAdapter() {
		super();
		this.amazonMailManager = new AmazonMailManager();
	}



	@Override
	public void send(String eMail, String massage) {
		amazonMailManager.send(eMail, massage);
		
	}

}
