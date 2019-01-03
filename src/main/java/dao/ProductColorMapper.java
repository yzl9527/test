package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ProductColorKey;

public interface ProductColorMapper {
    long countByExample(ProductColorExample example);

    int deleteByExample(ProductColorExample example);

    int deleteByPrimaryKey(ProductColorKey key);

    int insert(ProductColorKey record);

    int insertSelective(ProductColorKey record);

    List<ProductColorKey> selectByExample(ProductColorExample example);

    int updateByExampleSelective(@Param("record") ProductColorKey record, @Param("example") ProductColorExample example);

    int updateByExample(@Param("record") ProductColorKey record, @Param("example") ProductColorExample example);
}