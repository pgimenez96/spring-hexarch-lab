package py.com.pgimenez.spring_hexarch_lab.post.domain.repository;

import py.com.pgimenez.spring_hexarch_lab.post.domain.model.PostQuery;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface PostQueryRepository {

    Optional<PostQuery> findById(int id);
    List<PostQuery> searchBy(Map<String, String> params);
    List<PostQuery> findAllPosts();

}
