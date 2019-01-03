package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ProductBrandKey;

public interface ProductBrandMapper {
    long countByExample(ProductBrandExample example);

    int deleteByExample(ProductBrandExample example);

    int deleteByPrimaryKey(ProductBrandKey key);

    int insert(ProductBrandKey record);

    int insertSelective(ProductBrandKey record);

    List<ProductBrandKey> selectByExample(ProductBrandExample example);

    int updateByExampleSelective(@Param("record") ProductBrandKey record, @Param("example") ProductBrandExample example);

    int updateByExample(@Param("record") ProductBrandKey record, @Param("example") ProductBrandExample example);
}