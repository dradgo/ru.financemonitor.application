package ru.financemonitor.security.model.entity;

import ru.financemonitor.core.model.entity.AbstractUuidEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * User roles
 * @author Alexander Petrenko, Polina Petrenko
 *
 */
@Entity
public class UserRole extends AbstractUuidEntity {
	private String name;
	private String code;

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
