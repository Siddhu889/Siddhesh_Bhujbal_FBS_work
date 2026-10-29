package com.phoenix.My_2026_08_01SpringBootHelloWorld;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

	public List<User> findByPassword(String password);
	public List<User> findByPasswordAndUserid(String pass, String user);
	public List<User> findByPasswordLike(String pattern);
	public List<User> findByPasswordBetween(String start, String end);
}
