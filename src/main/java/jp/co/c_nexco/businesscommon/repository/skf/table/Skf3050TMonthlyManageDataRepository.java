package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3050TMonthlyManageData;

public interface Skf3050TMonthlyManageDataRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_t_monthly_manage_data
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(String cycleBillingYymm);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_t_monthly_manage_data
	 * @mbg.generated
	 */
	int insert(Skf3050TMonthlyManageData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_t_monthly_manage_data
	 * @mbg.generated
	 */
	int insertSelective(Skf3050TMonthlyManageData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_t_monthly_manage_data
	 * @mbg.generated
	 */
	Skf3050TMonthlyManageData selectByPrimaryKey(String cycleBillingYymm);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_t_monthly_manage_data
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf3050TMonthlyManageData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_t_monthly_manage_data
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf3050TMonthlyManageData record);
}