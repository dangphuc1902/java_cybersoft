package com.dtp.WebNetFlix.service;

import com.dtp.WebNetFlix.controllertest.dto.PostDto;
import org.springframework.stereotype.Service;

@Service
public class PostService{
        public PostService(){

        }
        public PostDto getPost(int id){
            System.out.println("find post data from database by " + id);
            System.out.println("validate data from database");
            System.out.println("process data if necessary");

            return new PostDto(id,"title","this is content","dangphuc");
        }
}
