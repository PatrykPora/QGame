package pl.patrykpora.qgame.service;


import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Log
public class QuizDataService {

    public void getCategoriesForQuiz(){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("https://opentdb.com/api_category.php", String.class);
        log.info("available categories: " + result);
    }

}
