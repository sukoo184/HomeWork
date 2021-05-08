package eTicaretÖdev.business.concretes;

import java.util.List;

import eTicaretÖdev.business.abstracts.UserService;
import eTicaretÖdev.core.EmailService;
import eTicaretÖdev.dataAccess.abstracts.UserDao;
import eTicaretÖdev.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private EmailService emailService;
	

	public UserManager(UserDao userDao,EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService= emailService;
	}
	
	

	@Override
	public void add(User user) {
		
		if(userValidate(user)) {
			userDao.add(user);
			
			emailService.send(user.geteMail(), " Kayıt olundu.");
		}
	
	}

	@Override
	public void update(User user) {
		if(userValidate(user)) {
			userDao.updatae(user);
		}
		
	}

	@Override
	public void delete(int userId) {
		userDao.delete(userId);
		
	}

	@Override
	public User get(String eMail) {
		
		return userDao.get(eMail);
	}

	@Override
	public List<User> getAll() {
		for (User user : userDao.getAll()) {
			System.out.println(user.getFirstName()+ " "+ user.getLastName()+" "+user.geteMail());
			
		}
		return userDao.getAll();
	}
	public boolean userValidate(User user) {
		if(user.getFirstName().length()>2 && user.getLastName().length()>2) {
			return true;
		}
		System.out.println("Ad ve Soyad 2 karakterden fazla olmalıdır.");
		return false;
	}

}
