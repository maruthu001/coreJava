package in.maruthanalagar.mambilling.dao;

import in.maruthanalagar.mambilling.model.User;

public class UserDAO {

	public User[] findAll() {
		User[] userList = UserList.ListOfUsers;
		return userList;
	}

	/**
	 * 
	 * @param newUser
	 */
	public void create(User newUser) {

		User[] userList1 = UserList.ListOfUsers;

		for (int i = 0; i < userList1.length; i++) {
			User user1 = UserList.ListOfUsers[i];
			if (user1 == null) {
				UserList.ListOfUsers[i] = newUser;
				break;
			}

		}

//		UserList.ListOfUsers[1] = newUser;
	}

	public void update(User updatedUser) {

		User[] userList2 = UserList.ListOfUsers;

		for (int i = 0; i < userList2.length; i++) {
			User user1 = userList2[i];

			if (user1 == null) {
				continue;
			}
			if (user1.getId() == updatedUser.getId()) {
				user1 = updatedUser;

			}

		}

	}
	
	public void delete(int id) {

		User[] userList2 = UserList.ListOfUsers;

		for (int i = 0; i < userList2.length; i++) {
			User user1 = userList2[i];

			if (user1 == null) {
				continue;
			}
			if (user1.getId() == id) {
				user1.setActive(false);

			}

		}

	}
	
	
	
		public User findById(int userId) {
			User[] userList3 = UserList.ListOfUsers;
			User matchedUser = null;

			for (int i = 0; i < userList3.length; i++) {
				User user = userList3[i];
				if (user.getId() == userId) {
					matchedUser = user;
					break;
				}
			}
			System.out.println(matchedUser);
			return matchedUser;
		}
		
		
		public User findByEmail(String userEmail) {
			User[] userList4 = UserList.ListOfUsers;
			User userMatch = null;

			for (int i = 0; i < userList4.length; i++) {
				User user = userList4[i];
				
				if(user==null) {
					System.out.println("User Details is Not There");
					break;
				}
				if (user.getEmail().equals(userEmail)) {
					userMatch = user;
					break;
				}
			}
			System.out.println(userMatch);
			return userMatch;
		}
		
	
	

}
