package py.com.pgimenez.spring_hexarch_lab.post.infrastructure.inbound.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import py.com.pgimenez.spring_hexarch_lab.post.application.find.PostFindUseCase;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController{

    private final PostFindUseCase postFindUseCase;

    @GetMapping
    public ResponseEntity<?> findAllPosts(){
        return ResponseEntity.ok(this.postFindUseCase.findAllPosts());
    }

}
