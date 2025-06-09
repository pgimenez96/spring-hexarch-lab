package py.com.pgimenez.spring_hexarch_lab.post.domain.repository;

import py.com.pgimenez.spring_hexarch_lab.post.domain.model.PostCommand;
import py.com.pgimenez.spring_hexarch_lab.post.domain.model.PostQuery;

import java.util.Optional;

public interface PostCommandRepository {

    Optional<PostQuery> createPost(PostCommand postCommand);
    Optional<PostQuery> updatePost(PostCommand postCommand);
    void deletePost(int id);

}
