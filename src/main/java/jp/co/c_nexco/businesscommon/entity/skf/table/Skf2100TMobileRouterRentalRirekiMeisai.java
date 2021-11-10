package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;

public class Skf2100TMobileRouterRentalRirekiMeisai extends Skf2100TMobileRouterRentalRirekiMeisaiKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_genbutsu_gaku
	 * @mbg.generated
	 */
	private Integer mobileRouterGenbutsuGaku;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_appl_kbn
	 * @mbg.generated
	 */
	private String mobileRouterApplKbn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_return_kbn
	 * @mbg.generated
	 */
	private String mobileRouterReturnKbn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf2100_t_mobile_router_rental_rireki_meisai
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_genbutsu_gaku
	 * @return  the value of skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_genbutsu_gaku
	 * @mbg.generated
	 */
	public Integer getMobileRouterGenbutsuGaku() {
		return mobileRouterGenbutsuGaku;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_genbutsu_gaku
	 * @param mobileRouterGenbutsuGaku  the value for skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_genbutsu_gaku
	 * @mbg.generated
	 */
	public void setMobileRouterGenbutsuGaku(Integer mobileRouterGenbutsuGaku) {
		this.mobileRouterGenbutsuGaku = mobileRouterGenbutsuGaku;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_appl_kbn
	 * @return  the value of skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_appl_kbn
	 * @mbg.generated
	 */
	public String getMobileRouterApplKbn() {
		return mobileRouterApplKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_appl_kbn
	 * @param mobileRouterApplKbn  the value for skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_appl_kbn
	 * @mbg.generated
	 */
	public void setMobileRouterApplKbn(String mobileRouterApplKbn) {
		this.mobileRouterApplKbn = mobileRouterApplKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_return_kbn
	 * @return  the value of skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_return_kbn
	 * @mbg.generated
	 */
	public String getMobileRouterReturnKbn() {
		return mobileRouterReturnKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_return_kbn
	 * @param mobileRouterReturnKbn  the value for skf.skf2100_t_mobile_router_rental_rireki_meisai.mobile_router_return_kbn
	 * @mbg.generated
	 */
	public void setMobileRouterReturnKbn(String mobileRouterReturnKbn) {
		this.mobileRouterReturnKbn = mobileRouterReturnKbn;
	}
}