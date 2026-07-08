package com.example.VIBER.VIBER.service.impl;

import com.example.VIBER.VIBER.dto.files.FileResponse;
import com.example.VIBER.VIBER.service.FilesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilesServiceImpl implements FilesService {
    @Override
    public List<FileResponse> getAllFiles(Long id) {
        return List.of();
    }

    @Override
    public FileResponse getSingleFile(String path, Long id) {
        return null;
    }
}
