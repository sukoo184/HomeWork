package eTicaret�dev;

import java.util.List;

import eTicaret�dev.business.concretes.AuthManager;
import eTicaret�dev.business.concretes.UserManager;
import eTicaret�dev.core.amazonEmail.AmazonMailManagerAdapter;
import eTicaret�dev.core.googleEmail.GoogleMailManagerAdapter;
import eTicaret�dev.dataAccess.concretes.InMemoryUserDao;
import eTicaret�dev.entities.abstracts.Dto;
import eTicaret�dev.entities.concretes.LoginDto;
import eTicaret�dev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		InMemoryUserDao inMemoryUserDao=new InMemoryUserDao();
		AuthManager authManager=new AuthManager(new UserManager(inMemoryUserDao, 
				new AmazonMailManagerAdapter()));
			
		User burcu=new User(2,"Burcu","kaplan","burcu@gmail.com","123456",true);
		User f�l�z=new User(3,"filiz","y�lmaz","f�l�z@gmail.com","123456",true);
		
		
		authManager.register(burcu);
		
		
		UserManager userManager=new UserManager(inMemoryUserDao, new GoogleMailManagerAdapter());
		//userManager.update(enes);
		//userManager.delete(3);
		//userManager.getAll();
		
		LoginDto userDto=new LoginDto();
		userDto.seteMail("suko@gmail.com");
		userDto.setPassword("123456");
		
		//authManager.login(userDto);
		
	}

}
