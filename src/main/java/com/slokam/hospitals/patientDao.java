package com.slokam.hospitals;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface patientDao extends JpaRepository<patients, Integer> {
	@Query("select d.name,pp.name,di.name from medication m join m.medicine me "
            +"join m.com c "
			+"join c.visiting v "
            +"join v.app a "
			+"join a.p pp "
            +"join v.doctors d "
			+"join c.disease di "
            +"where me.name=?1")
 public List<Object[]>getpatientsBymedicine(String medicineName);
}



