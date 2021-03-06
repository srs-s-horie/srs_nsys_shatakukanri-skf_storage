package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf2100TRouterLendingYoteiData;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf2100TRouterLendingYoteiDataKey;

public interface Skf2100TRouterLendingYoteiDataRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_t_router_lending_yotei_data
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf2100TRouterLendingYoteiDataKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_t_router_lending_yotei_data
	 * @mbg.generated
	 */
	int insert(Skf2100TRouterLendingYoteiData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_t_router_lending_yotei_data
	 * @mbg.generated
	 */
	int insertSelective(Skf2100TRouterLendingYoteiData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_t_router_lending_yotei_data
	 * @mbg.generated
	 */
	Skf2100TRouterLendingYoteiData selectByPrimaryKey(Skf2100TRouterLendingYoteiDataKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_t_router_lending_yotei_data
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf2100TRouterLendingYoteiData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_t_router_lending_yotei_data
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf2100TRouterLendingYoteiData record);
}