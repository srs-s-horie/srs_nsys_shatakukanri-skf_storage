package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf1010MShatakuShainRireki;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf1010MShatakuShainRirekiKey;

public interface Skf1010MShatakuShainRirekiRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_shataku_shain_rireki
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf1010MShatakuShainRirekiKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_shataku_shain_rireki
	 * @mbg.generated
	 */
	int insert(Skf1010MShatakuShainRireki record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_shataku_shain_rireki
	 * @mbg.generated
	 */
	int insertSelective(Skf1010MShatakuShainRireki record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_shataku_shain_rireki
	 * @mbg.generated
	 */
	Skf1010MShatakuShainRireki selectByPrimaryKey(Skf1010MShatakuShainRirekiKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_shataku_shain_rireki
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf1010MShatakuShainRireki record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_shataku_shain_rireki
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf1010MShatakuShainRireki record);
}