package in.maruthanalagar.mambilling.service;

import java.util.List;

import in.maruthanalagar.mambilling.dao.UserDAO;
import in.maruthanalagar.mambilling.exception.ValidationException;
import in.maruthanalagar.mambilling.model.User;
import in.maruthanalagar.mambilling.validation.UserValidator;

public class UserService {
	UserDAO userdao = new UserDAO();

	public void create(User user) throws Exception {

		UserValidator.validate(user);

		userdao.create(user);

	}

	public int count() {
		return userdao.count();

	}

	public void update(int newId, User newUser) throws ValidationException {

		UserValidator.validate(newUser);

		userdao.update(newId, newUser);

	}

	public void delete(int Id) {

		userdao.delete(Id);

	}

	public void findById(int newId) {

		userdao.findById(newId);

	}

	public void findByEmail(String Email) {

		userdao.findByEmail(Email);

	}

	public List<User> getAll() {

		return userdao.findAll();

	}

}
