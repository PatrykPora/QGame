package pl.patrykpora.qgame.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HealthConditionCheckerDto {

    private boolean status;
    private String message;


}
