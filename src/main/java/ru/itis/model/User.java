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
@Table(name = "user_table")
public class User extends AbstractEntity {
    @Column(length = 20, nullable = false)
    String name;

    @Column(nullable = false)
    String lastname;

    @Column(nullable = false)
    String login;

    @Column(nullable = false)
    // TODO: i think we need to use hashpassword here
    String password;
    String photo;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    Set<Post> posts;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    Set<Like> likes;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    Set<Comment> comments;
}
