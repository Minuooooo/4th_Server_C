package carrot.backend.domain.post.repository;

import carrot.backend.domain.member.entity.Member;
import carrot.backend.domain.post.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

    @EntityGraph(attributePaths = {"member"})
    Page<Post> findPostsByMember(Pageable pageable, Member member);
}
