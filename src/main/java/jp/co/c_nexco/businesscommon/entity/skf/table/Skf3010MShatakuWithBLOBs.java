package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;

public class Skf3010MShatakuWithBLOBs extends Skf3010MShataku implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku.shataku_supplement_file_1
	 * @mbg.generated
	 */
	private byte[] shatakuSupplementFile1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku.shataku_supplement_file_2
	 * @mbg.generated
	 */
	private byte[] shatakuSupplementFile2;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3010_m_shataku.shataku_supplement_file_3
	 * @mbg.generated
	 */
	private byte[] shatakuSupplementFile3;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf3010_m_shataku
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku.shataku_supplement_file_1
	 * @return  the value of skf.skf3010_m_shataku.shataku_supplement_file_1
	 * @mbg.generated
	 */
	public byte[] getShatakuSupplementFile1() {
		return shatakuSupplementFile1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku.shataku_supplement_file_1
	 * @param shatakuSupplementFile1  the value for skf.skf3010_m_shataku.shataku_supplement_file_1
	 * @mbg.generated
	 */
	public void setShatakuSupplementFile1(byte[] shatakuSupplementFile1) {
		this.shatakuSupplementFile1 = shatakuSupplementFile1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku.shataku_supplement_file_2
	 * @return  the value of skf.skf3010_m_shataku.shataku_supplement_file_2
	 * @mbg.generated
	 */
	public byte[] getShatakuSupplementFile2() {
		return shatakuSupplementFile2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku.shataku_supplement_file_2
	 * @param shatakuSupplementFile2  the value for skf.skf3010_m_shataku.shataku_supplement_file_2
	 * @mbg.generated
	 */
	public void setShatakuSupplementFile2(byte[] shatakuSupplementFile2) {
		this.shatakuSupplementFile2 = shatakuSupplementFile2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3010_m_shataku.shataku_supplement_file_3
	 * @return  the value of skf.skf3010_m_shataku.shataku_supplement_file_3
	 * @mbg.generated
	 */
	public byte[] getShatakuSupplementFile3() {
		return shatakuSupplementFile3;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3010_m_shataku.shataku_supplement_file_3
	 * @param shatakuSupplementFile3  the value for skf.skf3010_m_shataku.shataku_supplement_file_3
	 * @mbg.generated
	 */
	public void setShatakuSupplementFile3(byte[] shatakuSupplementFile3) {
		this.shatakuSupplementFile3 = shatakuSupplementFile3;
	}
}