package com.ptdacntt.WebQuanLyTaiLieu.repository;

import com.ptdacntt.WebQuanLyTaiLieu.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
