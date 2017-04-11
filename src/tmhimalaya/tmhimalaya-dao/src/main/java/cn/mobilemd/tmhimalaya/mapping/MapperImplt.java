package cn.mobilemd.tmhimalaya.mapping;

import cn.mobilemd.tmhimalaya.BO.MemberBO;
import cn.mobilemd.tmhimalaya.datamodel.MemberDO;
import fr.xebia.extras.selma.Selma;


public class MapperImplt {

   public static SelmaMapper mapper = Selma.mapper(SelmaMapper.class);

    public static MemberBO ToBO(MemberDO data) {
       MemberBO obj = mapper.ToBO(data);
       return  obj;
    }

}
