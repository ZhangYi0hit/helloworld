package com.kuang.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuang.pojo.Post;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class postServiceImpl {



    public Post getJson(String post) {
        Post postJson = new Post();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            postJson = objectMapper.readValue(post, Post.class);

        }catch(IOException e) {
            System.out.printf("Error", e.toString());
        }
//		GalleryItem photo = galleryItemRepo.findById(galleryItemId).get();
//		postJson.setGalleryItem(photo);

        return postJson;
    }
}
