package fastcampus.devops01.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;


class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void memberTest() {
        Member member = new Member();
        member.setUsername("이현석");
        member.setPassword("1234");
        memberRepository.save(member);
    }
}