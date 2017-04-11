package cn.mobilemd.tmhimalaya.mapping;


import cn.mobilemd.tmhimalaya.BO.MemberBO;
import cn.mobilemd.tmhimalaya.datamodel.MemberDO;
import fr.xebia.extras.selma.Mapper;

@Mapper
public interface SelmaMapper {

    MemberBO ToBO(MemberDO data);

}
