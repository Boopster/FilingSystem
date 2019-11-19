package com.codeclan.homework.fileservice.repositories;

import com.codeclan.homework.fileservice.models.Folder;
import com.codeclan.homework.fileservice.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}


