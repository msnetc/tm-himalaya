package cn.mobilemd.tmhimalaya.service;

import cn.mobilemd.tmhimalaya.BO.MemberBO;

public interface MemberService {
    MemberBO GetMemberByMemberId(Integer memberId);
}
