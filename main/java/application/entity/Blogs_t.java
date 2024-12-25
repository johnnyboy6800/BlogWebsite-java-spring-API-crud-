package application.entity;


import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Meu_blog")
public class Blogs_t {
    @Column(name = "blog_post", nullable = false)
    @Lob
    private String blog_post;
    private int id;
    @Column(name = "título", nullable = false)
    private String title;
    @Column(name = "DataCriação", nullable = false, updatable = false)
    private LocalDate CriadoEm;

    public Blogs_t() {
    }

    public Blogs_t( String title,String blog_post) {

        this.blog_post = blog_post;
        this.title = title;

    }

    @PrePersist
    protected void onCreate() {
        this.CriadoEm = LocalDate.now();
    }


    public String getBlog_post() {
        return blog_post;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBlog_post(String blog_post) {
        this.blog_post = blog_post;
    }

    public LocalDate getCriadoEm() {
        return CriadoEm;
    }

    public void setCriadoEm(LocalDate criadoEm) {
        this.CriadoEm = criadoEm;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
