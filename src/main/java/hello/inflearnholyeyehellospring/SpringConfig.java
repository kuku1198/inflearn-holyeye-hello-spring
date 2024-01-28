package hello.inflearnholyeyehellospring;

import hello.inflearnholyeyehellospring.repository.JdbcMemberRepository;
import hello.inflearnholyeyehellospring.repository.MemberRepository;
import hello.inflearnholyeyehellospring.repository.MemoryMemberRepository;
import hello.inflearnholyeyehellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }
}
