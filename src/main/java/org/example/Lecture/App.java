package org.example.Lecture;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();

        try(SessionFactory sessionFactory = configuration.buildSessionFactory()) {
//            list(sessionFactory);
//            Save(sessionFactory);
//            update(sessionFactory);
//            delete(sessionFactory);
        }
    }

    public static void list(SessionFactory sessionFactory) {
        try (Session session = sessionFactory.openSession()) {
//            List<Post> post = session.createQuery("FROM Post ", Post.class).getResultList();
//            List<PostComment> postComment = session.createQuery("FROM PostComment ", PostComment.class).getResultList();
           // post.forEach(System.out::println);
           // System.out.println("-----------------");
           // postComment.forEach(System.out::println);
            /**
             * Получаем данны из таблицы Post, PostComment.
             */
        }
    }

    public static void Save(SessionFactory sessionFactory) {
        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();
//            Post post = new Post();
//            PostComment postComment = new PostComment();
//            postComment.setId(6);
//            postComment.setText("text #6");
//            postComment.setPost_id(6);
//            post.setId(6);
//            post.setTitle("Post #6");
//            session.persist(postComment);
//            session.persist(post); // insert
//            session.getTransaction().commit();
            /**
             * Добавляем данные в таблицу Post.
             * Аналогично также можно добавлять данны в  таблицу PostComment.
             */
        }
    }
    public static void update(SessionFactory sessionFactory) {
        try(Session session = sessionFactory.openSession()) {
//            Post updatePost = session.find(Post.class, 3);
//            updatePost.setTitle("Updated");
//            session.beginTransaction();
//            session.merge(updatePost);
//            session.getTransaction().commit();
            /**
             * Обновляем данные в таблицу Post.
             * Аналогично также можно обновить данны в таблицу PostComment.
             */
        }
    }

    public static void delete(SessionFactory sessionFactory) {
        try(Session session = sessionFactory.openSession()) {
//            Post deletePost = session.find(Post.class, 1);
//            session.beginTransaction();
//            session.remove(deletePost);
//            session.getTransaction().commit();
            /**
             * Удаляем данные из таблицы Post.
             * Аналогично также можно удалить данные их таблицы PostComment.
             */
        }
    }

}
