package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;
import jp.co.c_nexco.nfw.common.entity.base.BaseEntity;

public class Skf3050MParkingRentalKey extends BaseEntity implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3050_m_parking_rental.parking_structure_kbn
	 * @mbg.generated
	 */
	private String parkingStructureKbn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3050_m_parking_rental.area_kbn
	 * @mbg.generated
	 */
	private String areaKbn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf3050_m_parking_rental
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3050_m_parking_rental.parking_structure_kbn
	 * @return  the value of skf.skf3050_m_parking_rental.parking_structure_kbn
	 * @mbg.generated
	 */
	public String getParkingStructureKbn() {
		return parkingStructureKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3050_m_parking_rental.parking_structure_kbn
	 * @param parkingStructureKbn  the value for skf.skf3050_m_parking_rental.parking_structure_kbn
	 * @mbg.generated
	 */
	public void setParkingStructureKbn(String parkingStructureKbn) {
		this.parkingStructureKbn = parkingStructureKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3050_m_parking_rental.area_kbn
	 * @return  the value of skf.skf3050_m_parking_rental.area_kbn
	 * @mbg.generated
	 */
	public String getAreaKbn() {
		return areaKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3050_m_parking_rental.area_kbn
	 * @param areaKbn  the value for skf.skf3050_m_parking_rental.area_kbn
	 * @mbg.generated
	 */
	public void setAreaKbn(String areaKbn) {
		this.areaKbn = areaKbn;
	}
}