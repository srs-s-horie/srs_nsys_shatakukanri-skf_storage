package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;
import jp.co.c_nexco.nfw.common.entity.base.BaseEntity;

public class Skf1010MAgencyKey extends BaseEntity implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf1010_m_agency.company_cd
	 * @mbg.generated
	 */
	private String companyCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf1010_m_agency.agency_cd
	 * @mbg.generated
	 */
	private String agencyCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf1010_m_agency
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf1010_m_agency.company_cd
	 * @return  the value of skf.skf1010_m_agency.company_cd
	 * @mbg.generated
	 */
	public String getCompanyCd() {
		return companyCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf1010_m_agency.company_cd
	 * @param companyCd  the value for skf.skf1010_m_agency.company_cd
	 * @mbg.generated
	 */
	public void setCompanyCd(String companyCd) {
		this.companyCd = companyCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf1010_m_agency.agency_cd
	 * @return  the value of skf.skf1010_m_agency.agency_cd
	 * @mbg.generated
	 */
	public String getAgencyCd() {
		return agencyCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf1010_m_agency.agency_cd
	 * @param agencyCd  the value for skf.skf1010_m_agency.agency_cd
	 * @mbg.generated
	 */
	public void setAgencyCd(String agencyCd) {
		this.agencyCd = agencyCd;
	}
}