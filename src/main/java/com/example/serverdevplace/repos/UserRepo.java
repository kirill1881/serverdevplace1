package com.example.serverdevplace.repos;


import com.example.serverdevplace.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, Long> {
}
