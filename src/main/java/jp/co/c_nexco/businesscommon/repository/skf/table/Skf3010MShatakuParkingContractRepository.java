package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3010MShatakuParkingContract;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3010MShatakuParkingContractKey;

public interface Skf3010MShatakuParkingContractRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_parking_contract
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf3010MShatakuParkingContractKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_parking_contract
	 * @mbg.generated
	 */
	int insert(Skf3010MShatakuParkingContract record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_parking_contract
	 * @mbg.generated
	 */
	int insertSelective(Skf3010MShatakuParkingContract record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_parking_contract
	 * @mbg.generated
	 */
	Skf3010MShatakuParkingContract selectByPrimaryKey(Skf3010MShatakuParkingContractKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_parking_contract
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf3010MShatakuParkingContract record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_parking_contract
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf3010MShatakuParkingContract record);
}