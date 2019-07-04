package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;
import jp.co.c_nexco.nfw.common.entity.base.BaseEntity;

public class Skf3030TShatakuBihin extends BaseEntity implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.shataku_kanri_id
	 * @mbg.generated
	 */
	private Long shatakuKanriId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.taiyo_date
	 * @mbg.generated
	 */
	private String taiyoDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.hannyu_request_day
	 * @mbg.generated
	 */
	private String hannyuRequestDay;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.hannyu_request_kbn
	 * @mbg.generated
	 */
	private String hannyuRequestKbn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.hannyu_confirm_date
	 * @mbg.generated
	 */
	private String hannyuConfirmDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.ukeire_dairi_name
	 * @mbg.generated
	 */
	private String ukeireDairiName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.ukeire_dairi_apoint
	 * @mbg.generated
	 */
	private String ukeireDairiApoint;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.hannyu_carryin_instruction
	 * @mbg.generated
	 */
	private String hannyuCarryinInstruction;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.henkyaku_date
	 * @mbg.generated
	 */
	private String henkyakuDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.hansyutu_request_day
	 * @mbg.generated
	 */
	private String hansyutuRequestDay;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.hansyutu_request_kbn
	 * @mbg.generated
	 */
	private String hansyutuRequestKbn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.hansyutu_confirm_date
	 * @mbg.generated
	 */
	private String hansyutuConfirmDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.tatiai_dairi_name
	 * @mbg.generated
	 */
	private String tatiaiDairiName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.tatiai_dairi_apoint
	 * @mbg.generated
	 */
	private String tatiaiDairiApoint;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.hansyutu_carryin_instruction
	 * @mbg.generated
	 */
	private String hansyutuCarryinInstruction;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.dairi_biko
	 * @mbg.generated
	 */
	private String dairiBiko;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.bihin_biko
	 * @mbg.generated
	 */
	private String bihinBiko;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.ukeire_my_apoint
	 * @mbg.generated
	 */
	private String ukeireMyApoint;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.tatiai_my_apoint
	 * @mbg.generated
	 */
	private String tatiaiMyApoint;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.hannyu_checklist_date
	 * @mbg.generated
	 */
	private String hannyuChecklistDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_bihin.hansyutu_checklist_date
	 * @mbg.generated
	 */
	private String hansyutuChecklistDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf3030_t_shataku_bihin
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.shataku_kanri_id
	 * @return  the value of skf.skf3030_t_shataku_bihin.shataku_kanri_id
	 * @mbg.generated
	 */
	public Long getShatakuKanriId() {
		return shatakuKanriId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.shataku_kanri_id
	 * @param shatakuKanriId  the value for skf.skf3030_t_shataku_bihin.shataku_kanri_id
	 * @mbg.generated
	 */
	public void setShatakuKanriId(Long shatakuKanriId) {
		this.shatakuKanriId = shatakuKanriId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.taiyo_date
	 * @return  the value of skf.skf3030_t_shataku_bihin.taiyo_date
	 * @mbg.generated
	 */
	public String getTaiyoDate() {
		return taiyoDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.taiyo_date
	 * @param taiyoDate  the value for skf.skf3030_t_shataku_bihin.taiyo_date
	 * @mbg.generated
	 */
	public void setTaiyoDate(String taiyoDate) {
		this.taiyoDate = taiyoDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.hannyu_request_day
	 * @return  the value of skf.skf3030_t_shataku_bihin.hannyu_request_day
	 * @mbg.generated
	 */
	public String getHannyuRequestDay() {
		return hannyuRequestDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.hannyu_request_day
	 * @param hannyuRequestDay  the value for skf.skf3030_t_shataku_bihin.hannyu_request_day
	 * @mbg.generated
	 */
	public void setHannyuRequestDay(String hannyuRequestDay) {
		this.hannyuRequestDay = hannyuRequestDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.hannyu_request_kbn
	 * @return  the value of skf.skf3030_t_shataku_bihin.hannyu_request_kbn
	 * @mbg.generated
	 */
	public String getHannyuRequestKbn() {
		return hannyuRequestKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.hannyu_request_kbn
	 * @param hannyuRequestKbn  the value for skf.skf3030_t_shataku_bihin.hannyu_request_kbn
	 * @mbg.generated
	 */
	public void setHannyuRequestKbn(String hannyuRequestKbn) {
		this.hannyuRequestKbn = hannyuRequestKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.hannyu_confirm_date
	 * @return  the value of skf.skf3030_t_shataku_bihin.hannyu_confirm_date
	 * @mbg.generated
	 */
	public String getHannyuConfirmDate() {
		return hannyuConfirmDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.hannyu_confirm_date
	 * @param hannyuConfirmDate  the value for skf.skf3030_t_shataku_bihin.hannyu_confirm_date
	 * @mbg.generated
	 */
	public void setHannyuConfirmDate(String hannyuConfirmDate) {
		this.hannyuConfirmDate = hannyuConfirmDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.ukeire_dairi_name
	 * @return  the value of skf.skf3030_t_shataku_bihin.ukeire_dairi_name
	 * @mbg.generated
	 */
	public String getUkeireDairiName() {
		return ukeireDairiName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.ukeire_dairi_name
	 * @param ukeireDairiName  the value for skf.skf3030_t_shataku_bihin.ukeire_dairi_name
	 * @mbg.generated
	 */
	public void setUkeireDairiName(String ukeireDairiName) {
		this.ukeireDairiName = ukeireDairiName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.ukeire_dairi_apoint
	 * @return  the value of skf.skf3030_t_shataku_bihin.ukeire_dairi_apoint
	 * @mbg.generated
	 */
	public String getUkeireDairiApoint() {
		return ukeireDairiApoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.ukeire_dairi_apoint
	 * @param ukeireDairiApoint  the value for skf.skf3030_t_shataku_bihin.ukeire_dairi_apoint
	 * @mbg.generated
	 */
	public void setUkeireDairiApoint(String ukeireDairiApoint) {
		this.ukeireDairiApoint = ukeireDairiApoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.hannyu_carryin_instruction
	 * @return  the value of skf.skf3030_t_shataku_bihin.hannyu_carryin_instruction
	 * @mbg.generated
	 */
	public String getHannyuCarryinInstruction() {
		return hannyuCarryinInstruction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.hannyu_carryin_instruction
	 * @param hannyuCarryinInstruction  the value for skf.skf3030_t_shataku_bihin.hannyu_carryin_instruction
	 * @mbg.generated
	 */
	public void setHannyuCarryinInstruction(String hannyuCarryinInstruction) {
		this.hannyuCarryinInstruction = hannyuCarryinInstruction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.henkyaku_date
	 * @return  the value of skf.skf3030_t_shataku_bihin.henkyaku_date
	 * @mbg.generated
	 */
	public String getHenkyakuDate() {
		return henkyakuDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.henkyaku_date
	 * @param henkyakuDate  the value for skf.skf3030_t_shataku_bihin.henkyaku_date
	 * @mbg.generated
	 */
	public void setHenkyakuDate(String henkyakuDate) {
		this.henkyakuDate = henkyakuDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.hansyutu_request_day
	 * @return  the value of skf.skf3030_t_shataku_bihin.hansyutu_request_day
	 * @mbg.generated
	 */
	public String getHansyutuRequestDay() {
		return hansyutuRequestDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.hansyutu_request_day
	 * @param hansyutuRequestDay  the value for skf.skf3030_t_shataku_bihin.hansyutu_request_day
	 * @mbg.generated
	 */
	public void setHansyutuRequestDay(String hansyutuRequestDay) {
		this.hansyutuRequestDay = hansyutuRequestDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.hansyutu_request_kbn
	 * @return  the value of skf.skf3030_t_shataku_bihin.hansyutu_request_kbn
	 * @mbg.generated
	 */
	public String getHansyutuRequestKbn() {
		return hansyutuRequestKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.hansyutu_request_kbn
	 * @param hansyutuRequestKbn  the value for skf.skf3030_t_shataku_bihin.hansyutu_request_kbn
	 * @mbg.generated
	 */
	public void setHansyutuRequestKbn(String hansyutuRequestKbn) {
		this.hansyutuRequestKbn = hansyutuRequestKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.hansyutu_confirm_date
	 * @return  the value of skf.skf3030_t_shataku_bihin.hansyutu_confirm_date
	 * @mbg.generated
	 */
	public String getHansyutuConfirmDate() {
		return hansyutuConfirmDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.hansyutu_confirm_date
	 * @param hansyutuConfirmDate  the value for skf.skf3030_t_shataku_bihin.hansyutu_confirm_date
	 * @mbg.generated
	 */
	public void setHansyutuConfirmDate(String hansyutuConfirmDate) {
		this.hansyutuConfirmDate = hansyutuConfirmDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.tatiai_dairi_name
	 * @return  the value of skf.skf3030_t_shataku_bihin.tatiai_dairi_name
	 * @mbg.generated
	 */
	public String getTatiaiDairiName() {
		return tatiaiDairiName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.tatiai_dairi_name
	 * @param tatiaiDairiName  the value for skf.skf3030_t_shataku_bihin.tatiai_dairi_name
	 * @mbg.generated
	 */
	public void setTatiaiDairiName(String tatiaiDairiName) {
		this.tatiaiDairiName = tatiaiDairiName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.tatiai_dairi_apoint
	 * @return  the value of skf.skf3030_t_shataku_bihin.tatiai_dairi_apoint
	 * @mbg.generated
	 */
	public String getTatiaiDairiApoint() {
		return tatiaiDairiApoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.tatiai_dairi_apoint
	 * @param tatiaiDairiApoint  the value for skf.skf3030_t_shataku_bihin.tatiai_dairi_apoint
	 * @mbg.generated
	 */
	public void setTatiaiDairiApoint(String tatiaiDairiApoint) {
		this.tatiaiDairiApoint = tatiaiDairiApoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.hansyutu_carryin_instruction
	 * @return  the value of skf.skf3030_t_shataku_bihin.hansyutu_carryin_instruction
	 * @mbg.generated
	 */
	public String getHansyutuCarryinInstruction() {
		return hansyutuCarryinInstruction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.hansyutu_carryin_instruction
	 * @param hansyutuCarryinInstruction  the value for skf.skf3030_t_shataku_bihin.hansyutu_carryin_instruction
	 * @mbg.generated
	 */
	public void setHansyutuCarryinInstruction(String hansyutuCarryinInstruction) {
		this.hansyutuCarryinInstruction = hansyutuCarryinInstruction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.dairi_biko
	 * @return  the value of skf.skf3030_t_shataku_bihin.dairi_biko
	 * @mbg.generated
	 */
	public String getDairiBiko() {
		return dairiBiko;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.dairi_biko
	 * @param dairiBiko  the value for skf.skf3030_t_shataku_bihin.dairi_biko
	 * @mbg.generated
	 */
	public void setDairiBiko(String dairiBiko) {
		this.dairiBiko = dairiBiko;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.bihin_biko
	 * @return  the value of skf.skf3030_t_shataku_bihin.bihin_biko
	 * @mbg.generated
	 */
	public String getBihinBiko() {
		return bihinBiko;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.bihin_biko
	 * @param bihinBiko  the value for skf.skf3030_t_shataku_bihin.bihin_biko
	 * @mbg.generated
	 */
	public void setBihinBiko(String bihinBiko) {
		this.bihinBiko = bihinBiko;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.ukeire_my_apoint
	 * @return  the value of skf.skf3030_t_shataku_bihin.ukeire_my_apoint
	 * @mbg.generated
	 */
	public String getUkeireMyApoint() {
		return ukeireMyApoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.ukeire_my_apoint
	 * @param ukeireMyApoint  the value for skf.skf3030_t_shataku_bihin.ukeire_my_apoint
	 * @mbg.generated
	 */
	public void setUkeireMyApoint(String ukeireMyApoint) {
		this.ukeireMyApoint = ukeireMyApoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.tatiai_my_apoint
	 * @return  the value of skf.skf3030_t_shataku_bihin.tatiai_my_apoint
	 * @mbg.generated
	 */
	public String getTatiaiMyApoint() {
		return tatiaiMyApoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.tatiai_my_apoint
	 * @param tatiaiMyApoint  the value for skf.skf3030_t_shataku_bihin.tatiai_my_apoint
	 * @mbg.generated
	 */
	public void setTatiaiMyApoint(String tatiaiMyApoint) {
		this.tatiaiMyApoint = tatiaiMyApoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.hannyu_checklist_date
	 * @return  the value of skf.skf3030_t_shataku_bihin.hannyu_checklist_date
	 * @mbg.generated
	 */
	public String getHannyuChecklistDate() {
		return hannyuChecklistDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.hannyu_checklist_date
	 * @param hannyuChecklistDate  the value for skf.skf3030_t_shataku_bihin.hannyu_checklist_date
	 * @mbg.generated
	 */
	public void setHannyuChecklistDate(String hannyuChecklistDate) {
		this.hannyuChecklistDate = hannyuChecklistDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_bihin.hansyutu_checklist_date
	 * @return  the value of skf.skf3030_t_shataku_bihin.hansyutu_checklist_date
	 * @mbg.generated
	 */
	public String getHansyutuChecklistDate() {
		return hansyutuChecklistDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_bihin.hansyutu_checklist_date
	 * @param hansyutuChecklistDate  the value for skf.skf3030_t_shataku_bihin.hansyutu_checklist_date
	 * @mbg.generated
	 */
	public void setHansyutuChecklistDate(String hansyutuChecklistDate) {
		this.hansyutuChecklistDate = hansyutuChecklistDate;
	}
}