package com.mi_espacio.mi_espacio_back.Services.IEntity;

import com.mi_espacio.mi_espacio_back.models.Entity.Users;

import java.util.List;

public interface IUserService {

    public List<Users> findAll();
    public Users findById(Long id);
    public Users save(Users users);
    public void delete(Long id);
}
