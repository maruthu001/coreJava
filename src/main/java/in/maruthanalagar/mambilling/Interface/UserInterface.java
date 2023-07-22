package in.maruthanalagar.mambilling.Interface;

import in.maruthanalagar.mambilling.model.User;

public interface UserInterface extends Base<User>{
	
	public abstract User findByEmail(String email);
	
	public abstract int count();
	 
	
	
	
	

}
