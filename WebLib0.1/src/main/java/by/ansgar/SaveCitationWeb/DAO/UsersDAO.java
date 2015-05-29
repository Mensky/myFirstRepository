package by.ansgar.SaveCitationWeb.DAO;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.SaveCitationWeb.entity.Users;

public interface UsersDAO {
	public void addUsers(Users users) throws SQLException;

	public void updateUsers(Users users) throws SQLException;

	public Users getUsersById(int id) throws SQLException;

	public List<Users> users() throws SQLException;

	public void deleteUsersById(Users users, int id) throws SQLException;

}
