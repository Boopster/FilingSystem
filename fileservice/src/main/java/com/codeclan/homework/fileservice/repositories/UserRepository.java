package com.codeclan.homework.fileservice.repositories;

import com.codeclan.homework.fileservice.models.User;
import com.codeclan.homework.fileservice.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
