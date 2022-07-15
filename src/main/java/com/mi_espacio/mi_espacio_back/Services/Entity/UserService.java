package com.mi_espacio.mi_espacio_back.Services.Entity;

import com.mi_espacio.mi_espacio_back.Repository.Entity.IUserRepository;
import com.mi_espacio.mi_espacio_back.Services.IEntity.IUserService;
import com.mi_espacio.mi_espacio_back.models.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    @Transactional(readOnly = true)
    public List<Users> findAll() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Users save(Users users) {
        return userRepository.save(users);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
