package application.Service;

import application.entity.Blogs_t;
import application.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class CodeServiceImpl implements Service {
    @Autowired
    MyRepository repository;

    @Override
    public List<Blogs_t> FindAll() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "CriadoEm"));
    }

    @Override
    public Blogs_t findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Blogs_t save(Blogs_t blog) {
        return repository.save(blog);
    }

    @Override
    public Blogs_t deleteById(Integer id) {
        Optional<Blogs_t> blogs_tOptional = repository.findById(id);
        if (blogs_tOptional.isPresent()) {
            repository.deleteById(id);

        } else {
            throw new RuntimeException("Blog not found");
        }
        return null;
    }

    @Override
    public Blogs_t updating(Integer id, Blogs_t new_blog) {
        Optional<Blogs_t> optionalBlogsT = repository.findById(id);
        if (optionalBlogsT.isPresent()) {
            Blogs_t blogExistente = optionalBlogsT.get();
            blogExistente.setTitle(new_blog.getTitle());
            blogExistente.setBlog_post(new_blog.getBlog_post());
            return repository.save(blogExistente);

        } else {
            throw new RuntimeException("Não foi possível realizar operação");
        }
    }
}

