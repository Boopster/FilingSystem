package com.codeclan.homework.fileservice.repositories;

import com.codeclan.homework.fileservice.models.File;
import com.codeclan.homework.fileservice.projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
