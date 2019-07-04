package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;

public class Skf2060TKariageBukken extends Skf2060TKariageBukkenKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2060_t_kariage_bukken.shataku_name
	 * @mbg.generated
	 */
	private String shatakuName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2060_t_kariage_bukken.address
	 * @mbg.generated
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2060_t_kariage_bukken.money
	 * @mbg.generated
	 */
	private String money;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2060_t_kariage_bukken.teiji_flg
	 * @mbg.generated
	 */
	private String teijiFlg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf2060_t_kariage_bukken
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2060_t_kariage_bukken.shataku_name
	 * @return  the value of skf.skf2060_t_kariage_bukken.shataku_name
	 * @mbg.generated
	 */
	public String getShatakuName() {
		return shatakuName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2060_t_kariage_bukken.shataku_name
	 * @param shatakuName  the value for skf.skf2060_t_kariage_bukken.shataku_name
	 * @mbg.generated
	 */
	public void setShatakuName(String shatakuName) {
		this.shatakuName = shatakuName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2060_t_kariage_bukken.address
	 * @return  the value of skf.skf2060_t_kariage_bukken.address
	 * @mbg.generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2060_t_kariage_bukken.address
	 * @param address  the value for skf.skf2060_t_kariage_bukken.address
	 * @mbg.generated
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2060_t_kariage_bukken.money
	 * @return  the value of skf.skf2060_t_kariage_bukken.money
	 * @mbg.generated
	 */
	public String getMoney() {
		return money;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2060_t_kariage_bukken.money
	 * @param money  the value for skf.skf2060_t_kariage_bukken.money
	 * @mbg.generated
	 */
	public void setMoney(String money) {
		this.money = money;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2060_t_kariage_bukken.teiji_flg
	 * @return  the value of skf.skf2060_t_kariage_bukken.teiji_flg
	 * @mbg.generated
	 */
	public String getTeijiFlg() {
		return teijiFlg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2060_t_kariage_bukken.teiji_flg
	 * @param teijiFlg  the value for skf.skf2060_t_kariage_bukken.teiji_flg
	 * @mbg.generated
	 */
	public void setTeijiFlg(String teijiFlg) {
		this.teijiFlg = teijiFlg;
	}
}