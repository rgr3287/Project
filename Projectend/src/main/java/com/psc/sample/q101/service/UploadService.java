package com.psc.sample.q101.service;


import com.psc.sample.q101.domain.upload;
import com.psc.sample.q101.domain.uploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;

@Service
public class UploadService {
    @Autowired
    uploadRepository uploadRepository;

    public void save (upload file){
         upload f = new upload();

         f.setFileName(file.getFileName());
         f.setFileOrName(file.getFileOrName());
         f.setFileUrl(file.getFileUrl());

         uploadRepository.save(f);
    }
}
