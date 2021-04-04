package tr.com.somera.springbootcourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.somera.springbootcourse.model.Repository;
import tr.com.somera.springbootcourse.model.response.ReposResponse;
import tr.com.somera.springbootcourse.service.GithubService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GithubController {
    private GithubService service;

    @Autowired
    GithubController(GithubService service) {
        this.service = service;
    }

    @GetMapping("/repos/{username}")
    public Repository[] getRepos(@PathVariable String username) {
        return service.getUsersRepos(username);
    }
}
