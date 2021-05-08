package eTicaretÖdev.core;

import eTicaretÖdev.entities.concretes.LoginDto;

public interface ExternalAuthService {
	void register(String eMail);
	boolean userExists(String eMail);
	void login(LoginDto dto);

}
