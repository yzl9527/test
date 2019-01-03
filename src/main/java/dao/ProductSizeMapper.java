package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ProductSizeKey;

public interface ProductSizeMapper {
    long countByExample(ProductSizeExample example);

    int deleteByExample(ProductSizeExample example);

    int deleteByPrimaryKey(ProductSizeKey key);

    int insert(ProductSizeKey record);

    int insertSelective(ProductSizeKey record);

    List<ProductSizeKey> selectByExample(ProductSizeExample example);

    int updateByExampleSelective(@Param("record") ProductSizeKey record, @Param("example") ProductSizeExample example);

    int updateByExample(@Param("record") ProductSizeKey record, @Param("example") ProductSizeExample example);
}