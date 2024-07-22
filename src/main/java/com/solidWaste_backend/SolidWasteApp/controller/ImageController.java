package com.solidWaste_backend.SolidWasteApp.controller;

import com.solidWaste_backend.SolidWasteApp.dtos.request.ImageRequest;
import com.solidWaste_backend.SolidWasteApp.model.Image;
import com.solidWaste_backend.SolidWasteApp.repository.ImagenRepository;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/image")
public class ImageController {

    @Autowired
    private ImagenRepository imagenRepository;


    @PostMapping
    public ResponseEntity<Image> createPhoto(@RequestBody ImageRequest request) {


        String base64Img = request.getImg();
        byte[] imageBytes = Base64.getDecoder().decode(base64Img);


        Image imagen = new Image();
        imagen.setImg(imageBytes);
        imagen.setLatitude(request.getLatitude());
        imagen.setLongitude(request.getLongitude());


        Image savedImagen = imagenRepository.save(imagen);
        return ResponseEntity.ok(savedImagen);
    }



}