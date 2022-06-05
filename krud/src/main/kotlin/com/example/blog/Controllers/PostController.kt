package com.example.blog.Controllers

import com.example.blog.Entities.Post
import com.example.blog.PostService.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView

@Controller
class PostController {

    @Autowired
    private lateinit var postService: PostService

    @RequestMapping("/")
    public fun getPost(model: Model): String {
        var listPosts: List<Post> = postService.getAll();
        model.addAttribute("listPosts", listPosts)
        model.addAttribute("post", Post());

        return "index";
    }

    @RequestMapping("/", method = arrayOf(RequestMethod.POST))
    public fun savePost(@ModelAttribute("post") post: Post): String {
        postService.save(post);
        return "redirect:/";
    }

    @RequestMapping("/update_post/{id}")
    public fun getPost(@PathVariable(name="id") id: Long): ModelAndView {
        var mav: ModelAndView = ModelAndView("update_post")
        var post: Post = postService.get(id);
        mav.addObject("post", post)
        return mav;
    }

    @RequestMapping("/deletePost/{id}")
    public fun deletePost(@PathVariable id: Long, model: Model): String {
        postService.deletePost(id);
        return "redirect:/";
    }
}