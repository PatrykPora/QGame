package pl.patrykpora.qgame.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@ToString
public class CategoriesOfQuizDto {

    private List<CategoryOfQuizDto> trivia_categories;

    @NoArgsConstructor
    @Getter
    @ToString
    public static class CategoryOfQuizDto {

        private int id;
        private String name;
    }

}
