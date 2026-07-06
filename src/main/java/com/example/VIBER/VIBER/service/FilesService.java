package com.example.VIBER.VIBER.service;

import com.example.VIBER.VIBER.dto.files.FileResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FilesService {
    List<FileResponse> getAllFiles(Long id);

     FileResponse getSingleFile(String path, Long id);
}
