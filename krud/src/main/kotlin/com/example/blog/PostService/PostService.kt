package com.example.blog.PostService

import com.example.blog.Entities.Post
import com.example.blog.Repositories.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
public class PostService {
    @Autowired
//    var postRepository: PostRepository? = null
        lateinit var postRepository: PostRepository;

    public fun getAll(): List<Post> {
        return postRepository.findAll();
    }

    public fun save(post: Post) {
        postRepository.save(post);
    }

    public fun get(id: Long): Post {
        return postRepository.findById(id).get();
    }

    public fun deletePost(id: Long) {
        postRepository.deleteById(id)
    }
}