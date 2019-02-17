package ru.financemonitor.security.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.financemonitor.security.exception.UserNotFoundException;
import ru.financemonitor.security.model.entity.SystemUser;
import ru.financemonitor.security.repository.SystemUserRepository;

/**
 * System User management.
 * Created by Polina Petrenko on 12.03.2018.
 */
@Service
public class SystemUserService {

    private Log logger = LogFactory.getLog(SystemUserService.class);

    @Autowired
    private SystemUserRepository systemUserRepository;

    public SystemUser getUser(String email){

        if(StringUtils.isBlank(email)){
            throw new IllegalArgumentException("Email is null or blank.");
        }

        return systemUserRepository.findByEmail(email)
                .orElseThrow(()-> new UserNotFoundException("No System User with following email is found: " + email));
    }
}
