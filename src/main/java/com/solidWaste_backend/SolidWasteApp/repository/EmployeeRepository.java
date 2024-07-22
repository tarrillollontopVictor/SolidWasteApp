package com.solidWaste_backend.SolidWasteApp.repository;


import com.solidWaste_backend.SolidWasteApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
    @Query("select u from Employee u where u.email = :email AND u.password = :password")
    Employee getEmployeeByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}


