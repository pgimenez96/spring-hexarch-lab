package py.com.pgimenez.spring_hexarch_lab.post.infrastructure.inbound.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import py.com.pgimenez.spring_hexarch_lab.post.application.find.PostFindUseCase;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final PostFindUseCase postFindUseCase;

    @GetMapping("/{id}/posts")
    public ResponseEntity<?> findAllPosts(@PathVariable Integer id){
        return ResponseEntity.ok(this.postFindUseCase.findAllPostsByUserId(id));
    }

}
