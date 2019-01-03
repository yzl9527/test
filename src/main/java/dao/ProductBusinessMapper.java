package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ProductBusiness;

public interface ProductBusinessMapper {
    long countByExample(ProductBusinessExample example);

    int deleteByExample(ProductBusinessExample example);

    int deleteByPrimaryKey(Integer spbid);

    int insert(ProductBusiness record);

    int insertSelective(ProductBusiness record);

    List<ProductBusiness> selectByExample(ProductBusinessExample example);

    ProductBusiness selectByPrimaryKey(Integer spbid);

    int updateByExampleSelective(@Param("record") ProductBusiness record, @Param("example") ProductBusinessExample example);

    int updateByExample(@Param("record") ProductBusiness record, @Param("example") ProductBusinessExample example);

    int updateByPrimaryKeySelective(ProductBusiness record);

    int updateByPrimaryKey(ProductBusiness record);
}