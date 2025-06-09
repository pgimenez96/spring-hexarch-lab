package py.com.pgimenez.spring_hexarch_lab.post.infrastructure.outbound;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import py.com.pgimenez.spring_hexarch_lab.post.domain.model.PostCommand;
import py.com.pgimenez.spring_hexarch_lab.post.domain.model.PostQuery;
import py.com.pgimenez.spring_hexarch_lab.post.domain.repository.PostCommandRepository;
import py.com.pgimenez.spring_hexarch_lab.post.infrastructure.outbound.external.JsonPlaceholderApiClient;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostCommandRepositoryImpl implements PostCommandRepository {

    private final JsonPlaceholderApiClient jsonPlaceholderAPIClient;

    @Override
    public Optional<PostQuery> createPost(PostCommand postCommand) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.create(postCommand));
    }

    @Override
    public Optional<PostQuery> updatePost(PostCommand postCommand) {
        //Código a implementar
        return Optional.empty();
    }

    @Override
    public void deletePost(int id) {
        //Código a implementar
    }

}
