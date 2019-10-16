package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3070TOwnerInfo;

public interface Skf3070TOwnerInfoRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3070_t_owner_info
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long ownerNo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3070_t_owner_info
	 * @mbg.generated
	 */
	int insert(Skf3070TOwnerInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3070_t_owner_info
	 * @mbg.generated
	 */
	int insertSelective(Skf3070TOwnerInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3070_t_owner_info
	 * @mbg.generated
	 */
	Skf3070TOwnerInfo selectByPrimaryKey(Long ownerNo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3070_t_owner_info
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf3070TOwnerInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3070_t_owner_info
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf3070TOwnerInfo record);
}