package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf2060TKariageBukken;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf2060TKariageBukkenKey;

public interface Skf2060TKariageBukkenRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2060_t_kariage_bukken
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf2060TKariageBukkenKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2060_t_kariage_bukken
	 * @mbg.generated
	 */
	int insert(Skf2060TKariageBukken record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2060_t_kariage_bukken
	 * @mbg.generated
	 */
	int insertSelective(Skf2060TKariageBukken record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2060_t_kariage_bukken
	 * @mbg.generated
	 */
	Skf2060TKariageBukken selectByPrimaryKey(Skf2060TKariageBukkenKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2060_t_kariage_bukken
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf2060TKariageBukken record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2060_t_kariage_bukken
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf2060TKariageBukken record);
}