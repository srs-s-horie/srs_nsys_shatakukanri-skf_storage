package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3022TTeijiBihinData;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3022TTeijiBihinDataKey;

public interface Skf3022TTeijiBihinDataRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_t_teiji_bihin_data
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf3022TTeijiBihinDataKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_t_teiji_bihin_data
	 * @mbg.generated
	 */
	int insert(Skf3022TTeijiBihinData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_t_teiji_bihin_data
	 * @mbg.generated
	 */
	int insertSelective(Skf3022TTeijiBihinData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_t_teiji_bihin_data
	 * @mbg.generated
	 */
	Skf3022TTeijiBihinData selectByPrimaryKey(Skf3022TTeijiBihinDataKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_t_teiji_bihin_data
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf3022TTeijiBihinData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3022_t_teiji_bihin_data
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf3022TTeijiBihinData record);
}