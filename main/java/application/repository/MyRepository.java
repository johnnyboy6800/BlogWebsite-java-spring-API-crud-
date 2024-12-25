package application.repository;

import application.entity.Blogs_t;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public interface MyRepository extends JpaRepository<Blogs_t, Integer> {

}
