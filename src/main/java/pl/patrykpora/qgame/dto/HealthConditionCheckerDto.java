package pl.patrykpora.qgame.dto;

public class HealthConditionCheckerDto {

    private boolean status;
    private String message;

    public HealthConditionCheckerDto(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }


}
