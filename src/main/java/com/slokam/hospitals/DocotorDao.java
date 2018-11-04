package com.slokam.hospitals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DocotorDao extends JpaRepository<Doctors, Long> {

}
