package pl.patrykpora.qgame.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/healthCondition")
public class HealthConditionOFAppCheckerController {

    @GetMapping
    public String checkHealthCondition(){
        return "checkHealthConditionController works ok";
    }

}
