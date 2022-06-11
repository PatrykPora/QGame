package pl.patrykpora.qgame.service;


import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.patrykpora.qgame.dto.CategoriesOfQuizDto;

@Service
@Log
public class QuizDataService {

    public void getCategoriesForQuiz() {
        RestTemplate restTemplate = new RestTemplate();
        CategoriesOfQuizDto result = restTemplate
                .getForObject("https://opentdb.com/api_category.php", CategoriesOfQuizDto.class);

        log.info("available categories: " + result.getTrivia_categories());
    }

}
