package ru.financemonitor.security.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="SystemUser")
public class SystemUser {
	@Id
	@Column(name="system_user_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String login;
	private String password;
	private String email;

	@ManyToMany
	@JoinTable(name="UserRoles",
			joinColumns=@JoinColumn(name="system_user_id"),
			inverseJoinColumns=@JoinColumn(name="user_role_id"))
	private List<UserRole> roles;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SystemUser other = (SystemUser) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "SystemUser [email=" + email + ", id=" + id + ", login=" + login
				+ "]";
	}
}
