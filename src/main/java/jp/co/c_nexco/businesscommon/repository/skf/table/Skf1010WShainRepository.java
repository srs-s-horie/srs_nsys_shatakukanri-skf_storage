package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf1010WShain;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf1010WShainKey;

public interface Skf1010WShainRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_w_shain
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf1010WShainKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_w_shain
	 * @mbg.generated
	 */
	int insert(Skf1010WShain record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_w_shain
	 * @mbg.generated
	 */
	int insertSelective(Skf1010WShain record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_w_shain
	 * @mbg.generated
	 */
	Skf1010WShain selectByPrimaryKey(Skf1010WShainKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_w_shain
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf1010WShain record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_w_shain
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf1010WShain record);
}