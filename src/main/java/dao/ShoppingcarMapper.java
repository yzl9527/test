package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Shoppingcar;

public interface ShoppingcarMapper {
    long countByExample(ShoppingcarExample example);

    int deleteByExample(ShoppingcarExample example);

    int deleteByPrimaryKey(Integer scid);

    int insert(Shoppingcar record);

    int insertSelective(Shoppingcar record);

    List<Shoppingcar> selectByExample(ShoppingcarExample example);

    Shoppingcar selectByPrimaryKey(Integer scid);

    int updateByExampleSelective(@Param("record") Shoppingcar record, @Param("example") ShoppingcarExample example);

    int updateByExample(@Param("record") Shoppingcar record, @Param("example") ShoppingcarExample example);

    int updateByPrimaryKeySelective(Shoppingcar record);

    int updateByPrimaryKey(Shoppingcar record);
}