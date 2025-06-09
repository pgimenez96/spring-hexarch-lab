package py.com.pgimenez.spring_hexarch_lab.post.application.find;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import py.com.pgimenez.spring_hexarch_lab.post.domain.model.PostQuery;
import py.com.pgimenez.spring_hexarch_lab.post.domain.repository.PostQueryRepository;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PostFindUseCase {

    private final PostQueryRepository postQueryRepository;

    public List<PostQuery> findAllPosts(){
        return this.postQueryRepository.findAllPosts();
    }

    public PostQuery findById(Integer id){
        return this.postQueryRepository.findById(id).orElseThrow();
    }

    public List<PostQuery> findAllPostsByUserId(Integer userId){
        return this.postQueryRepository.searchBy(Map.of("userId",String.valueOf(userId)));
    }

}
