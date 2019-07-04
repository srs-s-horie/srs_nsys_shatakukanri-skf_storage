package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;
import jp.co.c_nexco.nfw.common.entity.base.BaseEntity;

public class Skf3010MShatakuParking extends BaseEntity implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking.shataku_kanri_no
	 * @mbg.generated
	 */
	private Long shatakuKanriNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking.contract_property_id
	 * @mbg.generated
	 */
	private Long contractPropertyId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking.parking_structure_kbn
	 * @mbg.generated
	 */
	private String parkingStructureKbn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking.parking_supplement_name_1
	 * @mbg.generated
	 */
	private String parkingSupplementName1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking.parking_supplement_name_2
	 * @mbg.generated
	 */
	private String parkingSupplementName2;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking.parking_supplement_name_3
	 * @mbg.generated
	 */
	private String parkingSupplementName3;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking.parking_biko
	 * @mbg.generated
	 */
	private String parkingBiko;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking.parking_rental
	 * @mbg.generated
	 */
	private Integer parkingRental;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking.parking_supplement_size_1
	 * @mbg.generated
	 */
	private String parkingSupplementSize1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking.parking_supplement_size_2
	 * @mbg.generated
	 */
	private String parkingSupplementSize2;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking.parking_supplement_size_3
	 * @mbg.generated
	 */
	private String parkingSupplementSize3;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf3010_m_shataku_parking
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking.shataku_kanri_no
	 * @return  the value of skf.skf3010_m_shataku_parking.shataku_kanri_no
	 * @mbg.generated
	 */
	public Long getShatakuKanriNo() {
		return shatakuKanriNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking.shataku_kanri_no
	 * @param shatakuKanriNo  the value for skf.skf3010_m_shataku_parking.shataku_kanri_no
	 * @mbg.generated
	 */
	public void setShatakuKanriNo(Long shatakuKanriNo) {
		this.shatakuKanriNo = shatakuKanriNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking.contract_property_id
	 * @return  the value of skf.skf3010_m_shataku_parking.contract_property_id
	 * @mbg.generated
	 */
	public Long getContractPropertyId() {
		return contractPropertyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking.contract_property_id
	 * @param contractPropertyId  the value for skf.skf3010_m_shataku_parking.contract_property_id
	 * @mbg.generated
	 */
	public void setContractPropertyId(Long contractPropertyId) {
		this.contractPropertyId = contractPropertyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking.parking_structure_kbn
	 * @return  the value of skf.skf3010_m_shataku_parking.parking_structure_kbn
	 * @mbg.generated
	 */
	public String getParkingStructureKbn() {
		return parkingStructureKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking.parking_structure_kbn
	 * @param parkingStructureKbn  the value for skf.skf3010_m_shataku_parking.parking_structure_kbn
	 * @mbg.generated
	 */
	public void setParkingStructureKbn(String parkingStructureKbn) {
		this.parkingStructureKbn = parkingStructureKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_name_1
	 * @return  the value of skf.skf3010_m_shataku_parking.parking_supplement_name_1
	 * @mbg.generated
	 */
	public String getParkingSupplementName1() {
		return parkingSupplementName1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_name_1
	 * @param parkingSupplementName1  the value for skf.skf3010_m_shataku_parking.parking_supplement_name_1
	 * @mbg.generated
	 */
	public void setParkingSupplementName1(String parkingSupplementName1) {
		this.parkingSupplementName1 = parkingSupplementName1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_name_2
	 * @return  the value of skf.skf3010_m_shataku_parking.parking_supplement_name_2
	 * @mbg.generated
	 */
	public String getParkingSupplementName2() {
		return parkingSupplementName2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_name_2
	 * @param parkingSupplementName2  the value for skf.skf3010_m_shataku_parking.parking_supplement_name_2
	 * @mbg.generated
	 */
	public void setParkingSupplementName2(String parkingSupplementName2) {
		this.parkingSupplementName2 = parkingSupplementName2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_name_3
	 * @return  the value of skf.skf3010_m_shataku_parking.parking_supplement_name_3
	 * @mbg.generated
	 */
	public String getParkingSupplementName3() {
		return parkingSupplementName3;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_name_3
	 * @param parkingSupplementName3  the value for skf.skf3010_m_shataku_parking.parking_supplement_name_3
	 * @mbg.generated
	 */
	public void setParkingSupplementName3(String parkingSupplementName3) {
		this.parkingSupplementName3 = parkingSupplementName3;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking.parking_biko
	 * @return  the value of skf.skf3010_m_shataku_parking.parking_biko
	 * @mbg.generated
	 */
	public String getParkingBiko() {
		return parkingBiko;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking.parking_biko
	 * @param parkingBiko  the value for skf.skf3010_m_shataku_parking.parking_biko
	 * @mbg.generated
	 */
	public void setParkingBiko(String parkingBiko) {
		this.parkingBiko = parkingBiko;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking.parking_rental
	 * @return  the value of skf.skf3010_m_shataku_parking.parking_rental
	 * @mbg.generated
	 */
	public Integer getParkingRental() {
		return parkingRental;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking.parking_rental
	 * @param parkingRental  the value for skf.skf3010_m_shataku_parking.parking_rental
	 * @mbg.generated
	 */
	public void setParkingRental(Integer parkingRental) {
		this.parkingRental = parkingRental;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_size_1
	 * @return  the value of skf.skf3010_m_shataku_parking.parking_supplement_size_1
	 * @mbg.generated
	 */
	public String getParkingSupplementSize1() {
		return parkingSupplementSize1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_size_1
	 * @param parkingSupplementSize1  the value for skf.skf3010_m_shataku_parking.parking_supplement_size_1
	 * @mbg.generated
	 */
	public void setParkingSupplementSize1(String parkingSupplementSize1) {
		this.parkingSupplementSize1 = parkingSupplementSize1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_size_2
	 * @return  the value of skf.skf3010_m_shataku_parking.parking_supplement_size_2
	 * @mbg.generated
	 */
	public String getParkingSupplementSize2() {
		return parkingSupplementSize2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_size_2
	 * @param parkingSupplementSize2  the value for skf.skf3010_m_shataku_parking.parking_supplement_size_2
	 * @mbg.generated
	 */
	public void setParkingSupplementSize2(String parkingSupplementSize2) {
		this.parkingSupplementSize2 = parkingSupplementSize2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_size_3
	 * @return  the value of skf.skf3010_m_shataku_parking.parking_supplement_size_3
	 * @mbg.generated
	 */
	public String getParkingSupplementSize3() {
		return parkingSupplementSize3;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking.parking_supplement_size_3
	 * @param parkingSupplementSize3  the value for skf.skf3010_m_shataku_parking.parking_supplement_size_3
	 * @mbg.generated
	 */
	public void setParkingSupplementSize3(String parkingSupplementSize3) {
		this.parkingSupplementSize3 = parkingSupplementSize3;
	}
}