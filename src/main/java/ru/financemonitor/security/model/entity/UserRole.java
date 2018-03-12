package ru.financemonitor.security.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * User roles
 * @author Alexander Petrenko, Polina Petrenko
 *
 */
@Entity
@Table(name="UserRole")
public class UserRole implements Serializable {
	@Id
	@Column(name="user_role_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String name;
	private String code;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
