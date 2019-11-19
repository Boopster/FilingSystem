package com.codeclan.homework.fileservice.projections;

import com.codeclan.homework.fileservice.models.File;
import com.codeclan.homework.fileservice.models.Folder;
import org.springframework.data.rest.core.config.Projection;

    @Projection(name = "embedFile", types = File.class)
    public interface EmbedFile {
        String getName();
        String getExtension();
        Long getSize();
        Folder getFolder();
    }

