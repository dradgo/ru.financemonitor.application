package ru.financemonitor.security.model.entity;

import ru.financemonitor.core.model.entity.AbstractUuidEntity;
import ru.financemonitor.core.model.entity.Account;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class SystemUser extends AbstractUuidEntity {
	private String login;
	private String password;
	private String email;

	@ManyToMany
	@JoinTable(name="user_roles",
			joinColumns=@JoinColumn(name="system_user_id"),
			inverseJoinColumns=@JoinColumn(name="user_role_id"))
	private List<UserRole> roles;
	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
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
	public List<UserRole> getRoles() {
		return roles;
	}
	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "SystemUser [email=" + email + ", id=" + id + ", login=" + login
				+ "]";
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
