package org.example.googleoauth2.repository;

import org.example.googleoauth2.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    boolean existsByLoginId(String loginId);
    Member findByLoginId(String loginId);
}
