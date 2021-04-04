package tr.com.somera.springbootcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tr.com.somera.springbootcourse.model.Repository;
import tr.com.somera.springbootcourse.model.response.ReposResponse;

@Service
public class GithubService {
    private String url = "https://api.github.com/users/";
    private RestTemplate template = new RestTemplate();

    public Repository[] getUsersRepos(String username) {
        ResponseEntity<Repository[]> response = template.getForEntity(url + username + "/repos", Repository[].class);
        return response.getBody();
    }
}
