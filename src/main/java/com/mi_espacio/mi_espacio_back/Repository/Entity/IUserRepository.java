package com.mi_espacio.mi_espacio_back.Repository.Entity;

import com.mi_espacio.mi_espacio_back.models.Entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<Users, Long> {
}
