package py.com.pgimenez.spring_hexarch_lab.post.infrastructure.outbound.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import py.com.pgimenez.spring_hexarch_lab.post.domain.model.PostCommand;
import py.com.pgimenez.spring_hexarch_lab.post.domain.model.PostQuery;

import java.util.List;
import java.util.Map;

@FeignClient(name = "${clients.json-placeholder.name}", url = "${clients.json-placeholder.url}")
public interface JsonPlaceholderApiClient {

    @PostMapping
    PostQuery create(@RequestBody PostCommand request);

    @GetMapping("/{id}")
    PostQuery findPostById(@PathVariable Integer id);

    @GetMapping
    List<PostQuery> getAllPosts();

    @GetMapping
    List<PostQuery> searchByParam(@RequestParam Map<String, String> params);

}
