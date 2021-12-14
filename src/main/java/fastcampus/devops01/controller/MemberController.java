package fastcampus.devops01.controller;


import fastcampus.devops01.domain.Member;
import fastcampus.devops01.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;


    @PostMapping("/save")
    public String save(@RequestBody Member member) {
        memberRepository.save(member);
        return "save";
    }


}
