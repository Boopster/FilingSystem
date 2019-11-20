package com.codeclan.homework.fileservice.components;

import com.codeclan.homework.fileservice.models.File;
import com.codeclan.homework.fileservice.models.Folder;
import com.codeclan.homework.fileservice.models.User;
import com.codeclan.homework.fileservice.repositories.FileRepository;
import com.codeclan.homework.fileservice.repositories.FolderRepository;
import com.codeclan.homework.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

    @Component
    public class DataLoader implements ApplicationRunner {

        @Autowired
        FileRepository fileRepository;
        @Autowired
        UserRepository userRepository;
        @Autowired
        FolderRepository folderRepository;

        public DataLoader() {
        }

        public void run(ApplicationArguments args) {
            User user1 = new User("BECS");
            userRepository.save(user1);
            User user2 = new User("STIREB");
            userRepository.save(user2);
            Folder folder1 = new Folder("Plot 1",user1);
            folderRepository.save(folder1);
            Folder folder2 = new Folder("Plot 2",user2);
            folderRepository.save(folder2);
            File file1 = new File("reservation","pdf",22);
            fileRepository.save(file1);
            File file2 = new File("reservation", "pdf",22);
            fileRepository.save(file2);
            folder1.addFile(file1);
            folder2.addFile(file2);
            folderRepository.save(folder1);
            folderRepository.save(folder2);
        }
    }


