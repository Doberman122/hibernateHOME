package org.example.Lecture;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "test.postcomment")
public class PostComment {
    // PostComment (комментарий к публикации) (id, text, post_id).

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "text")
    private String text;

    @Column(name = "post_comment_id")
    private Integer post_comment_id;

    @Column(name = "timestampPostComment")
    private Timestamp timestampPostComment;

//    @ManyToOne
//    @JoinColumn(name = "post_comment_id", nullable = false)
//    private Users usersPostComment;


    public PostComment() {}

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getText() {return text;}

    public void setText(String text) {this.text = text;}

    public Integer getPost_comment_id() {return post_comment_id;}

    public void setPost_comment_id(Integer post_comment_id) {this.post_comment_id = post_comment_id;}

    public PostComment(Integer id, String text, Integer post_comment_id) {
        this.id = id;
        this.text = text;
        this.post_comment_id = post_comment_id;
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", post_id=" + post_comment_id +
                '}';
    }
}
