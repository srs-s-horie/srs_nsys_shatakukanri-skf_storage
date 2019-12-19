package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;
import jp.co.c_nexco.nfw.common.entity.base.BaseEntity;

public class Skf1010MOperationGuideKey extends BaseEntity implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf1010_m_operation_guide.screen_id
	 * @mbg.generated
	 */
	private String screenId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf1010_m_operation_guide.guide_kbn
	 * @mbg.generated
	 */
	private String guideKbn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf1010_m_operation_guide
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf1010_m_operation_guide.screen_id
	 * @return  the value of skf.skf1010_m_operation_guide.screen_id
	 * @mbg.generated
	 */
	public String getScreenId() {
		return screenId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf1010_m_operation_guide.screen_id
	 * @param screenId  the value for skf.skf1010_m_operation_guide.screen_id
	 * @mbg.generated
	 */
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf1010_m_operation_guide.guide_kbn
	 * @return  the value of skf.skf1010_m_operation_guide.guide_kbn
	 * @mbg.generated
	 */
	public String getGuideKbn() {
		return guideKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf1010_m_operation_guide.guide_kbn
	 * @param guideKbn  the value for skf.skf1010_m_operation_guide.guide_kbn
	 * @mbg.generated
	 */
	public void setGuideKbn(String guideKbn) {
		this.guideKbn = guideKbn;
	}
}