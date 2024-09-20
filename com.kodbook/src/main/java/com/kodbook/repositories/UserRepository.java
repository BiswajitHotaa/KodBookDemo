package com.kodbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodbook.entities.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>
{
	public User findByUsername(String username);

	public User findByEmail(String email);
}
