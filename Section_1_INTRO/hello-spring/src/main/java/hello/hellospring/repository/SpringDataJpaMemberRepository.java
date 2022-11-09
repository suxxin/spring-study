package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository  extends JpaRepository<Member, Long>, MemberRepository { // 다중상속 인터페이스

    @Override
    Optional<Member> findByName(String name);

}

