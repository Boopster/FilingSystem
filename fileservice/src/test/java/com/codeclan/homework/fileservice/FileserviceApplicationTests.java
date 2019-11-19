package com.codeclan.homework.fileservice;

import com.codeclan.homework.fileservice.models.Folder;
import com.codeclan.homework.fileservice.models.User;
import com.codeclan.homework.fileservice.repositories.FileRepository;
import com.codeclan.homework.fileservice.repositories.FolderRepository;
import com.codeclan.homework.fileservice.repositories.UserRepository;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FileserviceApplicationTests {
	@Autowired
	UserRepository userRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUserAndFolder(){

		User user = new User("BECS");
		userRepository.save(user);

		Folder folder = new Folder("Plot 1", user);
		folderRepository.save(folder);

	}

}


