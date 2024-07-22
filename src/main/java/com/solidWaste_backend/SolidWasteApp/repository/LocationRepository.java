package com.solidWaste_backend.SolidWasteApp.repository;


import com.solidWaste_backend.SolidWasteApp.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
