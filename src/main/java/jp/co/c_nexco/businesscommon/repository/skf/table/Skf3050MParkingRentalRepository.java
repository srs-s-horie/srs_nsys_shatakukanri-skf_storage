package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3050MParkingRental;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3050MParkingRentalKey;

public interface Skf3050MParkingRentalRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_m_parking_rental
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf3050MParkingRentalKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_m_parking_rental
	 * @mbg.generated
	 */
	int insert(Skf3050MParkingRental record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_m_parking_rental
	 * @mbg.generated
	 */
	int insertSelective(Skf3050MParkingRental record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_m_parking_rental
	 * @mbg.generated
	 */
	Skf3050MParkingRental selectByPrimaryKey(Skf3050MParkingRentalKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_m_parking_rental
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf3050MParkingRental record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3050_m_parking_rental
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf3050MParkingRental record);
}