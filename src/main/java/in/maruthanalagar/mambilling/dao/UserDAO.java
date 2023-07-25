package in.maruthanalagar.mambilling.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import in.maruthanalagar.mambilling.Interface.UserInterface;
import in.maruthanalagar.mambilling.model.User;
import in.maruthanalagar.mambilling.util.ConnectionUtil;

public class UserDAO implements UserInterface {

	public List<User> findAll() throws RuntimeException {
		// return UserList.ListOfUsers;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<User> userList = new ArrayList<User>();
		try {
			String query = "SELECT * FROM users Where is_active = 1";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				User newUser = new User();
				newUser.setId(rs.getInt("id"));
				newUser.setFirstname(rs.getString("first_name"));
				newUser.setLastname(rs.getString("last_name"));
				newUser.setEmail(rs.getString("email"));
				newUser.setActive(rs.getBoolean("is_active"));
				userList.add(newUser);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		} finally {
			ConnectionUtil.close(con, ps, rs);
		}
		return userList;

	}

	@Override
	public void create(User user) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			String query = "INSERT into users ( first_name, last_name, email, password) VALUES ( ?, ?, ?, ? );";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, user.getFirstname());
			ps.setString(2, user.getLastname());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());

			ps.executeUpdate();

			System.out.println("User Successfully Created :)");

		} catch (SQLException e) {
			// e.printStackTrace();
			if (e.getMessage().contains("Duplicate entry")) {
				throw new RuntimeException("Duplicate constraint");
			} else {
				System.out.println(e.getMessage());
				throw new RuntimeException(e);
			}

		} finally {
			ConnectionUtil.close(con, ps);
		}

	}

	public User findById(int userId) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		User user = null;

		try {
			String query = "SELECT * FROM users  WHERE is_active = 1 and id = ? ";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, userId);
			rs = ps.executeQuery();

			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstname(rs.getString("first_name"));
				user.setLastname(rs.getString("last_name"));
				user.setEmail(rs.getString("email"));
				user.setActive(rs.getBoolean("is_active"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		} finally {
			ConnectionUtil.close(con, ps, rs);
		}

		return user;
	}

	public User findByEmail(String userEmail) {
		List<User> userList = UserList.ListOfUsers;
		User userMatch = null;

		for (User newUser : userList) {
			User user = newUser;

			if (user == null) {
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

	@Override
	public void delete(int newId) {
		List<User> userList2 = UserList.ListOfUsers;
		for (User newUser : userList2) {
			User user1 = newUser;

			if (user1 == null) {
				continue;
			}
			if (user1.getId() == newId) {
				user1.setActive(false);

			}

		}

	}

	@Override
	public int count() {
		List<User> userList3 = UserList.ListOfUsers;
		int count = 0;
		for (User newUser : userList3) {
			User user1 = newUser;
			count++;
		}
		return count;
	}

	@Override
	public void update(int id, User t) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void update(int id, User newUser) {
//		Connection con = null;
//		PreparedStatement ps = null;
//
//		try {
//			String query = "INSERT into users ( first_name, last_name, email, password) VALUES ( ?, ?, ?, ? );";
//			con = ConnectionUtil.getConnection();
//			ps = con.prepareStatement(query);
//			ps.setString(1, user.getFirstname());
//			ps.setString(2, user.getLastname());
//			ps.setString(3, user.getEmail());
//			ps.setString(4, user.getPassword());
//
//			ps.executeUpdate();
//
//			System.out.println("User Successfully Created :)");
//
//		} catch (SQLException e) {
//			// e.printStackTrace();
//			if (e.getMessage().contains("Duplicate entry")) {
//				throw new RuntimeException("Duplicate constraint");
//			} else {
//				System.out.println(e.getMessage());
//				throw new RuntimeException(e);
//			}
//
//		} finally {
//			ConnectionUtil.close(con, ps);
//		}
//
//		
//	}

}
