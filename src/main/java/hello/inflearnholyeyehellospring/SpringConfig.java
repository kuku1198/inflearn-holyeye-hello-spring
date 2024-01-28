package hello.inflearnholyeyehellospring;

import hello.inflearnholyeyehellospring.repository.MemberRepository;
import hello.inflearnholyeyehellospring.repository.MemoryMemberRepository;
import hello.inflearnholyeyehellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
