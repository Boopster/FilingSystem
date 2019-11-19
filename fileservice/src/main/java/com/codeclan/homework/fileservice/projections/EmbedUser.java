package com.codeclan.homework.fileservice.projections;

import com.codeclan.homework.fileservice.models.File;
import com.codeclan.homework.fileservice.models.User;
import org.springframework.data.rest.core.config.Projection;
import java.util.List;

@Projection(name = "embedUser", types = User.class)

public interface EmbedUser {
    String getName();
    List<File> getFiles();
}
