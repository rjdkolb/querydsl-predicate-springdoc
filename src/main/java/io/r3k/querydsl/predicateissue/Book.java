package io.r3k.querydsl.predicateissue;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Book {
    @Id
    Integer id;
    String name;
    String bookNumber;
    String otherField;
}
