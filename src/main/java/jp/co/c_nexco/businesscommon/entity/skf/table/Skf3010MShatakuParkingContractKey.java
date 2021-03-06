package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;
import jp.co.c_nexco.nfw.common.entity.base.BaseEntity;

public class Skf3010MShatakuParkingContractKey extends BaseEntity implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking_contract.shataku_kanri_no
	 * @mbg.generated
	 */
	private Long shatakuKanriNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking_contract.contract_property_id
	 * @mbg.generated
	 */
	private Long contractPropertyId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_parking_contract.parking_kanri_no
	 * @mbg.generated
	 */
	private Long parkingKanriNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf3010_m_shataku_parking_contract
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking_contract.shataku_kanri_no
	 * @return  the value of skf.skf3010_m_shataku_parking_contract.shataku_kanri_no
	 * @mbg.generated
	 */
	public Long getShatakuKanriNo() {
		return shatakuKanriNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking_contract.shataku_kanri_no
	 * @param shatakuKanriNo  the value for skf.skf3010_m_shataku_parking_contract.shataku_kanri_no
	 * @mbg.generated
	 */
	public void setShatakuKanriNo(Long shatakuKanriNo) {
		this.shatakuKanriNo = shatakuKanriNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking_contract.contract_property_id
	 * @return  the value of skf.skf3010_m_shataku_parking_contract.contract_property_id
	 * @mbg.generated
	 */
	public Long getContractPropertyId() {
		return contractPropertyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking_contract.contract_property_id
	 * @param contractPropertyId  the value for skf.skf3010_m_shataku_parking_contract.contract_property_id
	 * @mbg.generated
	 */
	public void setContractPropertyId(Long contractPropertyId) {
		this.contractPropertyId = contractPropertyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_parking_contract.parking_kanri_no
	 * @return  the value of skf.skf3010_m_shataku_parking_contract.parking_kanri_no
	 * @mbg.generated
	 */
	public Long getParkingKanriNo() {
		return parkingKanriNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_parking_contract.parking_kanri_no
	 * @param parkingKanriNo  the value for skf.skf3010_m_shataku_parking_contract.parking_kanri_no
	 * @mbg.generated
	 */
	public void setParkingKanriNo(Long parkingKanriNo) {
		this.parkingKanriNo = parkingKanriNo;
	}
}