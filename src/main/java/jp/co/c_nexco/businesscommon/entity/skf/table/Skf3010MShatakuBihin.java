package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;

public class Skf3010MShatakuBihin extends Skf3010MShatakuBihinKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku_bihin.bihin_status_kbn
	 * @mbg.generated
	 */
	private String bihinStatusKbn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf3010_m_shataku_bihin
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku_bihin.bihin_status_kbn
	 * @return  the value of skf.skf3010_m_shataku_bihin.bihin_status_kbn
	 * @mbg.generated
	 */
	public String getBihinStatusKbn() {
		return bihinStatusKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku_bihin.bihin_status_kbn
	 * @param bihinStatusKbn  the value for skf.skf3010_m_shataku_bihin.bihin_status_kbn
	 * @mbg.generated
	 */
	public void setBihinStatusKbn(String bihinStatusKbn) {
		this.bihinStatusKbn = bihinStatusKbn;
	}
}