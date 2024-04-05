package ru.itis.dto;

import lombok.*;

@AllArgsConstructor
@Data
@Builder
public class PostDto {
    String title;
    String description;
    String text;
    Integer price;
}
