package com.codeclan.homework.fileservice.projections;

import com.codeclan.homework.fileservice.models.File;
import com.codeclan.homework.fileservice.models.Folder;
import com.codeclan.homework.fileservice.models.User;
import org.springframework.data.rest.core.config.Projection;
import java.util.List;

@Projection(name = "embedFolder", types = Folder.class)
public interface EmbedFolder {
        String getTitle();
        List<File> getFiles();
        User getUser();
}



