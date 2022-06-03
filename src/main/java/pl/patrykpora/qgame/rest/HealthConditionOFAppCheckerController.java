package pl.patrykpora.qgame.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykpora.qgame.dto.HealthConditionCheckerDto;

@RestController
@RequestMapping("/api/healthCondition")
public class HealthConditionOFAppCheckerController {

    @GetMapping
    public HealthConditionCheckerDto checkHealthCondition() {
        HealthConditionCheckerDto dto = new HealthConditionCheckerDto(true, "It is working");
        return dto;
    }


}
