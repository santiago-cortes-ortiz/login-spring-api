package com.jeisson.springsecurityclient.infraestructure.driver_adapter.jpa_repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
