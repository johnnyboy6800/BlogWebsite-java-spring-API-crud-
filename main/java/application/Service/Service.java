package application.Service;

import application.entity.Blogs_t;

import java.util.List;
import java.util.Optional;

public interface Service {
    List<Blogs_t> FindAll();

    Blogs_t findById(Integer id);

    Blogs_t save(Blogs_t blog);

    Blogs_t deleteById(Integer id);

    Blogs_t updating(Integer id, Blogs_t new_blog);
}
