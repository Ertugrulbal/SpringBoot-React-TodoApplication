package com.backend.todolist.auth.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="user_table")
@ApiModel(value="User Api Doc", description="Model")
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@ApiModelProperty(value="User ID")
    @Id
    @GeneratedValue
    private Long id;
    
	@ApiModelProperty(value="Username")
    @NotEmpty(message = "Username is required")
    @Column(unique = true)
    private String username;
    
	@ApiModelProperty(value="User Password")
    @NotEmpty(message = "Password is required")
    private String password;
	
	@ApiModelProperty(value="User Role")
    private String role;
    

    public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.role = "User";
	}



    public List<String> getRoleAsList() {
        return Arrays.asList(this.role);
    }


}