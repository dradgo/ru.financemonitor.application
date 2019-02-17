package ru.financemonitor.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.financemonitor.security.model.entity.SystemUser;

import java.util.Optional;

public interface SystemUserRepository extends JpaRepository<SystemUser, String> {
    Optional<SystemUser> findByEmail(String email);
}
