package com.tutorialspoint;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/UserService")
public class UserService {
	
	UserDao dao = new UserDao();
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getAllUsers(){
		return dao.getAllUsers();
	}
	

}
