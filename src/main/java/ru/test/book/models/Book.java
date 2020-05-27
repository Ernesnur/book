package ru.test.book.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel
@Data
@NoArgsConstructor
public class Book {
    @ApiModelProperty(value = "ID Книги", example = "000005")
    private String id;
    @ApiModelProperty(value = "Название книги", example = "В душе больнее чем вчера")
    private String name;

    @ApiModelProperty(value = "Автор Книги", example = "Галитоновна Лариса В.")
    private String author;
    @ApiModelProperty(value = "Редактор Книги", example = "Почкоч З.П.")
    private String editor;
    @ApiModelProperty(value = "Издатель Книги", example = "Михалков Г.К.")
    private String publisher;
    @ApiModelProperty(value = "Год Книги", example = "2020")
    private Integer year;
    @ApiModelProperty(value = "Вес Книги", example = "100")
    private Integer weight;
    @ApiModelProperty(value = "Рейтинг Книги", example = "8.5")
    private Double rating;

    @ApiModelProperty(value = "Описание Книги", example = "За все семнадцать лет жизни с Нофар ни разу не случилось ничего интересного. На летние каникулы она устроилась в кафе-мороженое, надеясь завести друзей или познакомиться с симпатичным парнем.\n" +
            "В один из последних августовских дней в кафе зашел некогда известный, но давно забытый эстрадный певец Авишай Милнер. Он был в дурном настроении и решил отыграться на молоденькой официантке. Оскорбленная Нофар убегает в переулок за магазином, он пытается ее догнать, чтобы извиниться, она кричит…\n")
    private String about;
    @ApiModelProperty(value = "Стоимость книги", example = "305")
    private Double price;

}
