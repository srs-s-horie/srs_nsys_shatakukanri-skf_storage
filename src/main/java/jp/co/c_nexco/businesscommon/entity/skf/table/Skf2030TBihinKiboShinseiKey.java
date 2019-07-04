package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;
import jp.co.c_nexco.nfw.common.entity.base.BaseEntity;

public class Skf2030TBihinKiboShinseiKey extends BaseEntity implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2030_t_bihin_kibo_shinsei.company_cd
	 * @mbg.generated
	 */
	private String companyCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2030_t_bihin_kibo_shinsei.appl_no
	 * @mbg.generated
	 */
	private String applNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf2030_t_bihin_kibo_shinsei
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2030_t_bihin_kibo_shinsei.company_cd
	 * @return  the value of skf.skf2030_t_bihin_kibo_shinsei.company_cd
	 * @mbg.generated
	 */
	public String getCompanyCd() {
		return companyCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2030_t_bihin_kibo_shinsei.company_cd
	 * @param companyCd  the value for skf.skf2030_t_bihin_kibo_shinsei.company_cd
	 * @mbg.generated
	 */
	public void setCompanyCd(String companyCd) {
		this.companyCd = companyCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2030_t_bihin_kibo_shinsei.appl_no
	 * @return  the value of skf.skf2030_t_bihin_kibo_shinsei.appl_no
	 * @mbg.generated
	 */
	public String getApplNo() {
		return applNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2030_t_bihin_kibo_shinsei.appl_no
	 * @param applNo  the value for skf.skf2030_t_bihin_kibo_shinsei.appl_no
	 * @mbg.generated
	 */
	public void setApplNo(String applNo) {
		this.applNo = applNo;
	}
}