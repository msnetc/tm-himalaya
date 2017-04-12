package cn.mobilemd.tmhimalaya.api;

import cn.mobilemd.tmhimalaya.BO.MemberBO;
import cn.mobilemd.tmhimalaya.service.MemberService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberApi {

    @Autowired
    private MemberService memberService;
    private final  Logger logger = LogManager.getLogger(MemberApi.class);

    @RequestMapping("/member/{memberId}")
    MemberBO findMemberByMemberId(@PathVariable("memberId") Integer memberId) throws Exception{
        logger.info(memberId);
        MemberBO ret =  memberService.GetMemberByMemberId(memberId);
        return ret;
    }
}
