package cn.mobilemd.tmhimalaya.dao;

import cn.mobilemd.tmhimalaya.BO.MemberBO;

/**
 * Created by yanjie.miao on 2017/4/11.
 */
public interface MemberDao {
    MemberBO GetMemberByMemberId(Integer memberId);
}
