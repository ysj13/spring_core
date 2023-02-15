package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        // 주어진 값
        Member member = new Member(1L, "memberA", Grade.VIP);

        // 테스트할 것
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // 테스트 결과
        Assertions.assertThat(member).isEqualTo(findMember);
    }

}