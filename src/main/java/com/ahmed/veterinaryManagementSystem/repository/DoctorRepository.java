package com.ahmed.veterinaryManagementSystem.repository;

import com.ahmed.veterinaryManagementSystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Optional<Object> findByMail(String mail);
    Optional<Object> findByPhone(String mail);
}
