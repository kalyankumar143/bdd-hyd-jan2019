package org.tektutor;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("bank")
public class AccountController {
	
	AccountService accountService= new AccountService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Account> getAllAccounts() {
		 List<Account> listOfAccounts = accountService.getAllAccounts();
		 return listOfAccounts;
	}
		
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Account getAccountByAccountNo(@PathParam("acc_no") int acc_no) {
	        return accountService.getAccount(id);
	}	 

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public int addAccount(Account account) throws SQLException{
		return accountService.addAccount(account);
	}
		 
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public int updateAccount(Account account) throws SQLException{
		return accountService.updateAccount(account);
	}
		 
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteAccount(@PathParam("id") int id) throws SQLException{
		accountService.deleteAccount(id);
	}
}
