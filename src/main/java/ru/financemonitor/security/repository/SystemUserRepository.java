package ru.financemonitor.security.repository;


import org.springframework.data.repository.CrudRepository;
import ru.financemonitor.security.model.entity.SystemUser;

import java.util.Optional;

public interface SystemUserRepository extends CrudRepository<SystemUser, String> {

    SystemUser save (SystemUser user);

    Optional<SystemUser> findByEmail(String email);
}
