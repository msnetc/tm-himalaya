package cn.mobilemd.tmhimalaya.dao;

import cn.mobilemd.tmhimalaya.BO.MemberBO;
import cn.mobilemd.tmhimalaya.datamodel.MemberDO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MemberDaoImpl implements MemberDao {

    @Resource
    private SqlSession sqlSession;

    public MemberBO GetMemberByMemberId(Integer memberId) {
        MemberDO member = sqlSession.selectOne("findMemberByMemberId", memberId);
        MemberBO obj = new MemberBO();
        obj.setUid( member.getUid());  ;
        return obj;
    }

}
