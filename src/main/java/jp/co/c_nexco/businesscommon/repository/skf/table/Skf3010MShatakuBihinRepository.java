package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3010MShatakuBihin;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3010MShatakuBihinKey;

public interface Skf3010MShatakuBihinRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_bihin
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf3010MShatakuBihinKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_bihin
	 * @mbg.generated
	 */
	int insert(Skf3010MShatakuBihin record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_bihin
	 * @mbg.generated
	 */
	int insertSelective(Skf3010MShatakuBihin record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_bihin
	 * @mbg.generated
	 */
	Skf3010MShatakuBihin selectByPrimaryKey(Skf3010MShatakuBihinKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_bihin
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf3010MShatakuBihin record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_bihin
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf3010MShatakuBihin record);
}