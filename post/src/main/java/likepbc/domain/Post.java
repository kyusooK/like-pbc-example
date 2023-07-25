package likepbc.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import likepbc.PostApplication;
import lombok.Data;

@Entity
@Table(name = "Post_table")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String topicId;

    @Embedded
    private Likes likes;

    public static PostRepository repository() {
        PostRepository postRepository = PostApplication.applicationContext.getBean(
            PostRepository.class
        );
        return postRepository;
    }
}
