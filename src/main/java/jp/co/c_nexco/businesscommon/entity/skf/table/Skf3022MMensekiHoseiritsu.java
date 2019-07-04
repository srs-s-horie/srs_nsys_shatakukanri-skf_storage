package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;
import java.math.BigDecimal;
import jp.co.c_nexco.nfw.common.entity.base.BaseEntity;

public class Skf3022MMensekiHoseiritsu extends BaseEntity implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3022_m_menseki_hoseiritsu.menseki_minimum
	 * @mbg.generated
	 */
	private Short mensekiMinimum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3022_m_menseki_hoseiritsu.menseki_hoseiritsu
	 * @mbg.generated
	 */
	private BigDecimal mensekiHoseiritsu;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf3022_m_menseki_hoseiritsu
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3022_m_menseki_hoseiritsu.menseki_minimum
	 * @return  the value of skf.skf3022_m_menseki_hoseiritsu.menseki_minimum
	 * @mbg.generated
	 */
	public Short getMensekiMinimum() {
		return mensekiMinimum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3022_m_menseki_hoseiritsu.menseki_minimum
	 * @param mensekiMinimum  the value for skf.skf3022_m_menseki_hoseiritsu.menseki_minimum
	 * @mbg.generated
	 */
	public void setMensekiMinimum(Short mensekiMinimum) {
		this.mensekiMinimum = mensekiMinimum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3022_m_menseki_hoseiritsu.menseki_hoseiritsu
	 * @return  the value of skf.skf3022_m_menseki_hoseiritsu.menseki_hoseiritsu
	 * @mbg.generated
	 */
	public BigDecimal getMensekiHoseiritsu() {
		return mensekiHoseiritsu;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3022_m_menseki_hoseiritsu.menseki_hoseiritsu
	 * @param mensekiHoseiritsu  the value for skf.skf3022_m_menseki_hoseiritsu.menseki_hoseiritsu
	 * @mbg.generated
	 */
	public void setMensekiHoseiritsu(BigDecimal mensekiHoseiritsu) {
		this.mensekiHoseiritsu = mensekiHoseiritsu;
	}
}