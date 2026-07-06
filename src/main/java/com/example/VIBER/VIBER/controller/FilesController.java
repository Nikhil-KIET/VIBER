package com.example.VIBER.VIBER.controller;

import com.example.VIBER.VIBER.dto.files.FileResponse;
import com.example.VIBER.VIBER.service.FilesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/files/")
@RequiredArgsConstructor
public class FilesController {

    private final FilesService filesService;


    @GetMapping("/{id}")
    public ResponseEntity<List<FileResponse>>getAllFiles(@PathVariable Long id){
        return ResponseEntity.ok(filesService.getAllFiles(id));
    }

    @GetMapping("/{*path}")
    public ResponseEntity<FileResponse>getSingleFile(@PathVariable String  path,@PathVariable Long id){

        return ResponseEntity.ok(filesService.getSingleFile(path,id));

    }
}
