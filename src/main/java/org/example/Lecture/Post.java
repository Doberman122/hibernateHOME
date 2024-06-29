package org.example.Lecture;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "test.post")
public class Post {
    // 1. Post (публикация) (id, title)

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "timestampPost")
    private Timestamp timestampPost;

    @Column(name = "post_id")
    private Integer post_id;

//    @ManyToOne
//    @JoinColumn(name = "post_id",nullable = false)
//    private Users userspost;
    /*
    Здесь почему то у меня кидаешь Exception.
     */


    public Post() {}

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public Timestamp getTimestampPost() {return timestampPost;}

    public void setTimestampPost(Timestamp timestampPost) {this.timestampPost = timestampPost;}

    public Integer getPost_id() {return post_id;}

    public void setPost_id(Integer post_id) {this.post_id = post_id;}

    public Post(Integer id, String title, Integer post_id) {
        this.title = title;
        this.id = id;
        this.post_id = post_id;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", timestampPost=" + timestampPost +
                ", post_id=" + post_id +
                '}';
    }
}

