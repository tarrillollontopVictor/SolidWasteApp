package com.solidWaste_backend.SolidWasteApp.repository;


import com.solidWaste_backend.SolidWasteApp.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepository extends JpaRepository <Image, Long> {
}