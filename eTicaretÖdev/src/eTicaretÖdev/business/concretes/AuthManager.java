package eTicaret�dev.business.concretes;

import eTicaret�dev.business.abstracts.AuthService;
import eTicaret�dev.business.abstracts.UserService;
import eTicaret�dev.core.utils.utils;
import eTicaret�dev.entities.concretes.LoginDto;
import eTicaret�dev.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if (userValidate(user) && passwordValidate(user.getPassword()) && userExists(user.geteMail()) == false
				&& utils.emailValidate(user.geteMail())) {
			userService.add(user);
		}
		System.out.println("Kay�t Ba�ar�s�z.");

	}

	@Override
	public void verify(User user,String token) {
		if(user!=null && token.length()>20) {
			User exitsUser =userService.get(user.geteMail());
			exitsUser.setVerify(true);
			
			userService.update(exitsUser);

		System.out.println("Dogruland�");
		
		}
		
		System.out.println("Dogr�lanamad�!!");

	}
	
	

	@Override
	public boolean userExists(String eMail) {
		User user =userService.get(eMail);
		if(user==null) {
			return false;
		}else {

			System.out.println("EMail Mevcut : "+ eMail);
			return false;
		}
	}

	@Override
	public void login(LoginDto dto) {
		User user = userService.get(dto.geteMail());
		if(user!=null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("Giri� yap�ld�.");
		}
		else {
			System.out.println("Kullan�cu adi ve ya �ifre yanl��.");

		}

	}

	public boolean userValidate(User user) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getPassword().isEmpty()) {
			return true;

		}
		return false;

	}

	public boolean passwordValidate(String password) {

		if (password.length() >= 6) {
			return true;
		} else {
			System.out.println("�ifre an az 6 karakter olmal�d�r");
			return false;
		}
	}

}
