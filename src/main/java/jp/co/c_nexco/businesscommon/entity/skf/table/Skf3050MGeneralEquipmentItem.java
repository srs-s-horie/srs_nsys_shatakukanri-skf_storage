package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;
import jp.co.c_nexco.nfw.common.entity.base.BaseEntity;

public class Skf3050MGeneralEquipmentItem extends Skf3050MGeneralEquipmentItemKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3050_m_general_equipment_item.general_equipment_name
	 * @mbg.generated
	 */
	private String generalEquipmentName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3050_m_general_equipment_item.equipment_payment
	 * @mbg.generated
	 */
	private Integer equipmentPayment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3050_m_general_equipment_item.end_year_month
	 * @mbg.generated
	 */
	private String endYearMonth;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf3050_m_general_equipment_item
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3050_m_general_equipment_item.general_equipment_name
	 * @return  the value of skf.skf3050_m_general_equipment_item.general_equipment_name
	 * @mbg.generated
	 */
	public String getGeneralEquipmentName() {
		return generalEquipmentName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3050_m_general_equipment_item.general_equipment_name
	 * @param generalEquipmentName  the value for skf.skf3050_m_general_equipment_item.general_equipment_name
	 * @mbg.generated
	 */
	public void setGeneralEquipmentName(String generalEquipmentName) {
		this.generalEquipmentName = generalEquipmentName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3050_m_general_equipment_item.equipment_payment
	 * @return  the value of skf.skf3050_m_general_equipment_item.equipment_payment
	 * @mbg.generated
	 */
	public Integer getEquipmentPayment() {
		return equipmentPayment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3050_m_general_equipment_item.equipment_payment
	 * @param equipmentPayment  the value for skf.skf3050_m_general_equipment_item.equipment_payment
	 * @mbg.generated
	 */
	public void setEquipmentPayment(Integer equipmentPayment) {
		this.equipmentPayment = equipmentPayment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3050_m_general_equipment_item.end_year_month
	 * @return  the value of skf.skf3050_m_general_equipment_item.end_year_month
	 * @mbg.generated
	 */
	public String getEndYearMonth() {
		return endYearMonth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3050_m_general_equipment_item.end_year_month
	 * @param endYearMonth  the value for skf.skf3050_m_general_equipment_item.end_year_month
	 * @mbg.generated
	 */
	public void setEndYearMonth(String endYearMonth) {
		this.endYearMonth = endYearMonth;
	}
}