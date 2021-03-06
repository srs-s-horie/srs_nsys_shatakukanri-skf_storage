package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;
import jp.co.c_nexco.nfw.common.entity.base.BaseEntity;

public class Skf3010MShatakuManegeKey extends BaseEntity implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_manege.shataku_kanri_no
	 * @mbg.generated
	 */
	private Long shatakuKanriNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_manege.manege_kbn
	 * @mbg.generated
	 */
	private String manegeKbn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf3010_m_shataku_manege
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_manege.shataku_kanri_no
	 * @return  the value of skf.skf3010_m_shataku_manege.shataku_kanri_no
	 * @mbg.generated
	 */
	public Long getShatakuKanriNo() {
		return shatakuKanriNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_manege.shataku_kanri_no
	 * @param shatakuKanriNo  the value for skf.skf3010_m_shataku_manege.shataku_kanri_no
	 * @mbg.generated
	 */
	public void setShatakuKanriNo(Long shatakuKanriNo) {
		this.shatakuKanriNo = shatakuKanriNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_manege.manege_kbn
	 * @return  the value of skf.skf3010_m_shataku_manege.manege_kbn
	 * @mbg.generated
	 */
	public String getManegeKbn() {
		return manegeKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_manege.manege_kbn
	 * @param manegeKbn  the value for skf.skf3010_m_shataku_manege.manege_kbn
	 * @mbg.generated
	 */
	public void setManegeKbn(String manegeKbn) {
		this.manegeKbn = manegeKbn;
	}
}