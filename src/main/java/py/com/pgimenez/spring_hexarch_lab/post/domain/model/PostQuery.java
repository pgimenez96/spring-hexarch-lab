package py.com.pgimenez.spring_hexarch_lab.post.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostQuery {

    private Long userId;
    private Long id;
    private String title;
    private String body;

}

