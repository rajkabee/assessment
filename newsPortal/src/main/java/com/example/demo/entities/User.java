package com.example.demo.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userId;
	private String username;
	private String password;
	private String authorities;
	private boolean credentialNotExpired;
	private boolean accountNotLocked;
	private boolean accountNotExpired;
}
