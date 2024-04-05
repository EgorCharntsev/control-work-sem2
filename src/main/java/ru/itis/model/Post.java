package ru.itis.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "post")
public class Post extends AbstractEntity{
     @Column(length = 20, nullable = false)
     String title;

     @Column(length = 100, nullable = false)
     String description;

     @Column(nullable = false)
     String text;

     @Column(length = 15)
     String category; // TODO: enum

     @Column(nullable = false)
     String photo;

     @Column(nullable = false)
     Integer price;

     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "author_id", nullable = false)
     User author;

     @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
     Set<Like> likes;

     @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
     Set<Comment> comments;
}
