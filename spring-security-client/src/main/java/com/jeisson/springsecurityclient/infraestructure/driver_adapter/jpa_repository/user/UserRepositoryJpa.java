package com.jeisson.springsecurityclient.infraestructure.driver_adapter.jpa_repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJpa extends JpaRepository<User,Long> {
}
