package cn.mobilemd.tmhimalaya.service;

import cn.mobilemd.tmhimalaya.BO.MemberBO;
import cn.mobilemd.tmhimalaya.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl  implements  MemberService{

    @Autowired
    private MemberDao memberDao;

    public MemberBO GetMemberByMemberId(Integer memberId) {
       MemberBO member =memberDao.GetMemberByMemberId(memberId);
       return member;
    }

}
