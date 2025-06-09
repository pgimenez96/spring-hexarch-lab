package py.com.pgimenez.spring_hexarch_lab.post.infrastructure.outbound;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import py.com.pgimenez.spring_hexarch_lab.post.domain.model.PostQuery;
import py.com.pgimenez.spring_hexarch_lab.post.domain.repository.PostQueryRepository;
import py.com.pgimenez.spring_hexarch_lab.post.infrastructure.outbound.external.JsonPlaceholderApiClient;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostQueryRepositoryImpl implements PostQueryRepository {

    private final JsonPlaceholderApiClient jsonPlaceholderAPIClient;

    @Override
    public Optional<PostQuery> findById(int id) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.findPostById(id));
    }

    @Override
    public List<PostQuery> searchBy(Map<String, String> params) {
        return jsonPlaceholderAPIClient.searchByParam(params);
    }

    @Override
    public List<PostQuery> findAllPosts() {
        return jsonPlaceholderAPIClient.getAllPosts();
    }

}
