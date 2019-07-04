package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3022MAgingResidualRate;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3022MAgingResidualRateKey;

public interface Skf3022MAgingResidualRateRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_m_aging_residual_rate
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf3022MAgingResidualRateKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_m_aging_residual_rate
	 * @mbg.generated
	 */
	int insert(Skf3022MAgingResidualRate record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_m_aging_residual_rate
	 * @mbg.generated
	 */
	int insertSelective(Skf3022MAgingResidualRate record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_m_aging_residual_rate
	 * @mbg.generated
	 */
	Skf3022MAgingResidualRate selectByPrimaryKey(Skf3022MAgingResidualRateKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_m_aging_residual_rate
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf3022MAgingResidualRate record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_m_aging_residual_rate
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf3022MAgingResidualRate record);
}