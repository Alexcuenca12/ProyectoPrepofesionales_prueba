package com.ista.tecazuay.proyecto.models.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.ista.tecazuay.proyecto.models.primary.entity.FileEntity;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.FileRepository;

@Service
public class FileService {

	@Autowired
	private final FileRepository fileRepository;

	public FileService(FileRepository fileRepository) {
		this.fileRepository = fileRepository;
	}

	public void save(MultipartFile file) throws IOException {
		FileEntity fileEntity = new FileEntity();
		fileEntity.setName(StringUtils.cleanPath(file.getOriginalFilename()));
		fileEntity.setContentType(file.getContentType());
		fileEntity.setData(file.getBytes());
		fileEntity.setSize(file.getSize());

		fileRepository.save(fileEntity);
	}

	public Optional<FileEntity> getFile(String id) {
		return fileRepository.findById(id);
	}

	public List<FileEntity> getAllFiles() {
		return (List<FileEntity>) fileRepository.findAll();
	}

}
