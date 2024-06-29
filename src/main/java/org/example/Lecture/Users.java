package org.example.Lecture;


import javax.persistence.*;

@Entity
@Table(name = "test.users")
public class Users {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Users() {

    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
