package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findByID(Long id); // null이 있을까봐 미리 처리하는 요즘 쓰는 예외방법
    Optional<Member> findByID(String name);
    List<Member> findAll();
}