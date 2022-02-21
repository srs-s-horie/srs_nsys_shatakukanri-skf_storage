package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf2100MMobileRouter;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf2100MMobileRouterKey;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf2100MMobileRouterWithBLOBs;

public interface Skf2100MMobileRouterRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_m_mobile_router
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf2100MMobileRouterKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_m_mobile_router
	 * @mbg.generated
	 */
	int insert(Skf2100MMobileRouterWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_m_mobile_router
	 * @mbg.generated
	 */
	int insertSelective(Skf2100MMobileRouterWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_m_mobile_router
	 * @mbg.generated
	 */
	Skf2100MMobileRouterWithBLOBs selectByPrimaryKey(Skf2100MMobileRouterKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_m_mobile_router
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf2100MMobileRouterWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_m_mobile_router
	 * @mbg.generated
	 */
	int updateByPrimaryKeyWithBLOBs(Skf2100MMobileRouterWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2100_m_mobile_router
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf2100MMobileRouter record);
}