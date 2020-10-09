/**
 * 
 */
package com.security.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author sairam
 *
 */
@Entity
@Table(name = "User")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2389028391L;

	@Id
	private int userId;

	@Column(name = "userName")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "roleId")
	private int roleId;

	@OneToMany
	Collection<Role> collectionsRole;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public Collection<Role> getCollectionsRole() {
		return collectionsRole;
	}

	public void setCollectionsRole(Collection<Role> collectionsRole) {
		this.collectionsRole = collectionsRole;
	}

	

}
