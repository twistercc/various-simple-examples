package com.springlight.data.db.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.springlight.data.db.model.UnitBuild;

public interface UnitBuildMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table unit_build
	 *
	 * @mbggenerated Mon Jan 08 12:31:50 CST 2018
	 */
	int deleteByPrimaryKey(String unitArea);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table unit_build
	 *
	 * @mbggenerated Mon Jan 08 12:31:50 CST 2018
	 */
	int insert(UnitBuild record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table unit_build
	 *
	 * @mbggenerated Mon Jan 08 12:31:50 CST 2018
	 */
	int insertSelective(UnitBuild record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table unit_build
	 *
	 * @mbggenerated Mon Jan 08 12:31:50 CST 2018
	 */
	UnitBuild selectByPrimaryKey(String unitArea);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table unit_build
	 *
	 * @mbggenerated Mon Jan 08 12:31:50 CST 2018
	 */
	int updateByPrimaryKeySelective(UnitBuild record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table unit_build
	 *
	 * @mbggenerated Mon Jan 08 12:31:50 CST 2018
	 */
	int updateByPrimaryKey(UnitBuild record);

	/**
	 * 查询所有楼宇
	 * 
	 * @return
	 */
	List<UnitBuild> selectAllBuild();

	/**
	 * 根据区域查询所有楼宇
	 * 
	 * @param unitArea
	 * @return
	 */
	List<UnitBuild> selectBuildByUnitArea(String unitArea);

	/**
	 * 根据选中区域和模糊输入信息进行模糊查询
	 * 
	 * @param unitArea
	 * @param searchData
	 * @return
	 */
	List<UnitBuild> selectBuildBySearchData(@Param("unitArea") String unitArea, @Param("searchData") String searchData);
}