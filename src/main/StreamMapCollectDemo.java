package main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class UserDTO {
	private int id;
	private String userName;
	private String email;

	public UserDTO() {
		super();
	}

	public UserDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}

}

class User {
	private int id;
	private String userName;
	private String password;
	private String email;

	public User() {
		super();
	}

	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}

}

public class StreamMapCollectDemo {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Anirudh", "12345", "abc@xyz.com"));
		users.add(new User(2, "Abhishek", "23456", "abcd@xyz.com"));
		users.add(new User(3, "Vikram", "34567", "abce@xyz.com"));
		users.add(new User(4, "Amrish", "45678", "abcf@xyz.com"));

		List<UserDTO> userDTOs = new ArrayList<>();
		for (User user : users) {
			userDTOs.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
		}
		for (UserDTO dto : userDTOs) {
			System.out.println(dto);
		}
		
		System.out.println();

		// using stream map
		users.stream().map((User user) -> new 
				UserDTO(user.getId(), user.getUserName(), user.getEmail())).forEach(System.out::println);;
		
		

	}

}
