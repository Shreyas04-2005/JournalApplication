package com.edigest.journalApp.repository;

import com.edigest.journalApp.entity.JournalEntry;
import com.edigest.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> { //Repository interface is used for communicate with database by defining services with mongorepository
    User findByusername(String username);

    void deleteByUsername(String username);
}



