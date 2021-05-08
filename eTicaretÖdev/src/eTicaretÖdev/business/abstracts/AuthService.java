package eTicaretÖdev.business.abstracts;

import eTicaretÖdev.entities.concretes.LoginDto;
import eTicaretÖdev.entities.concretes.User;

public interface AuthService {
	
	void register(User user);
	void verify(User user,String token);
	boolean userExists(String eMail);
	void login(LoginDto dto);
	
	

}
