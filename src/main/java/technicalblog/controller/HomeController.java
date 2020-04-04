package technicalblog.controller;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.PostService;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    public HomeController(){
        System.out.println("***Home Controller Constructor***");
    }

    @Autowired
    private PostService postService;

    //putting @RequestMapping("/") to make home page
    @RequestMapping("/")
    public String getAllPosts(Model model){

        ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "index";
    }
}
