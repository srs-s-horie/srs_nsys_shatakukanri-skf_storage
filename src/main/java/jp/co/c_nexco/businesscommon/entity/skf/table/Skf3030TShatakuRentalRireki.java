package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;

public class Skf3030TShatakuRentalRireki extends Skf3030TShatakuRentalRirekiKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.rental_pattern_id
	 * @mbg.generated
	 */
	private Long rentalPatternId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.yakuin_sanntei_kbn
	 * @mbg.generated
	 */
	private String yakuinSannteiKbn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.rental_month
	 * @mbg.generated
	 */
	private Integer rentalMonth;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.rental_day
	 * @mbg.generated
	 */
	private Integer rentalDay;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.rental_adjust
	 * @mbg.generated
	 */
	private Integer rentalAdjust;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.rental_total
	 * @mbg.generated
	 */
	private Integer rentalTotal;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_person
	 * @mbg.generated
	 */
	private Integer kyoekihiPerson;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_person_adjust
	 * @mbg.generated
	 */
	private Integer kyoekihiPersonAdjust;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_person_total
	 * @mbg.generated
	 */
	private Integer kyoekihiPersonTotal;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_pay_month
	 * @mbg.generated
	 */
	private String kyoekihiPayMonth;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.parking_1_rental_month
	 * @mbg.generated
	 */
	private Integer parking1RentalMonth;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.parking_1_rental_day
	 * @mbg.generated
	 */
	private Integer parking1RentalDay;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.parking_2_rental_month
	 * @mbg.generated
	 */
	private Integer parking2RentalMonth;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.parking_2_rental_day
	 * @mbg.generated
	 */
	private Integer parking2RentalDay;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.parking_rental_adjust
	 * @mbg.generated
	 */
	private Integer parkingRentalAdjust;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.parking_rental_total
	 * @mbg.generated
	 */
	private Integer parkingRentalTotal;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.genbutu_santei
	 * @mbg.generated
	 */
	private Integer genbutuSantei;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.bihin_genbutu_goukei
	 * @mbg.generated
	 */
	private Integer bihinGenbutuGoukei;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.shataku_account_name
	 * @mbg.generated
	 */
	private String shatakuAccountName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.kyoeki_account_name
	 * @mbg.generated
	 */
	private String kyoekiAccountName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.shataku_account_cd
	 * @mbg.generated
	 */
	private String shatakuAccountCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf3030_t_shataku_rental_rireki.kyoeki_account_cd
	 * @mbg.generated
	 */
	private String kyoekiAccountCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf3030_t_shataku_rental_rireki
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.rental_pattern_id
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.rental_pattern_id
	 * @mbg.generated
	 */
	public Long getRentalPatternId() {
		return rentalPatternId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.rental_pattern_id
	 * @param rentalPatternId  the value for skf.skf3030_t_shataku_rental_rireki.rental_pattern_id
	 * @mbg.generated
	 */
	public void setRentalPatternId(Long rentalPatternId) {
		this.rentalPatternId = rentalPatternId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.yakuin_sanntei_kbn
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.yakuin_sanntei_kbn
	 * @mbg.generated
	 */
	public String getYakuinSannteiKbn() {
		return yakuinSannteiKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.yakuin_sanntei_kbn
	 * @param yakuinSannteiKbn  the value for skf.skf3030_t_shataku_rental_rireki.yakuin_sanntei_kbn
	 * @mbg.generated
	 */
	public void setYakuinSannteiKbn(String yakuinSannteiKbn) {
		this.yakuinSannteiKbn = yakuinSannteiKbn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.rental_month
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.rental_month
	 * @mbg.generated
	 */
	public Integer getRentalMonth() {
		return rentalMonth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.rental_month
	 * @param rentalMonth  the value for skf.skf3030_t_shataku_rental_rireki.rental_month
	 * @mbg.generated
	 */
	public void setRentalMonth(Integer rentalMonth) {
		this.rentalMonth = rentalMonth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.rental_day
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.rental_day
	 * @mbg.generated
	 */
	public Integer getRentalDay() {
		return rentalDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.rental_day
	 * @param rentalDay  the value for skf.skf3030_t_shataku_rental_rireki.rental_day
	 * @mbg.generated
	 */
	public void setRentalDay(Integer rentalDay) {
		this.rentalDay = rentalDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.rental_adjust
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.rental_adjust
	 * @mbg.generated
	 */
	public Integer getRentalAdjust() {
		return rentalAdjust;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.rental_adjust
	 * @param rentalAdjust  the value for skf.skf3030_t_shataku_rental_rireki.rental_adjust
	 * @mbg.generated
	 */
	public void setRentalAdjust(Integer rentalAdjust) {
		this.rentalAdjust = rentalAdjust;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.rental_total
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.rental_total
	 * @mbg.generated
	 */
	public Integer getRentalTotal() {
		return rentalTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.rental_total
	 * @param rentalTotal  the value for skf.skf3030_t_shataku_rental_rireki.rental_total
	 * @mbg.generated
	 */
	public void setRentalTotal(Integer rentalTotal) {
		this.rentalTotal = rentalTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_person
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.kyoekihi_person
	 * @mbg.generated
	 */
	public Integer getKyoekihiPerson() {
		return kyoekihiPerson;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_person
	 * @param kyoekihiPerson  the value for skf.skf3030_t_shataku_rental_rireki.kyoekihi_person
	 * @mbg.generated
	 */
	public void setKyoekihiPerson(Integer kyoekihiPerson) {
		this.kyoekihiPerson = kyoekihiPerson;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_person_adjust
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.kyoekihi_person_adjust
	 * @mbg.generated
	 */
	public Integer getKyoekihiPersonAdjust() {
		return kyoekihiPersonAdjust;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_person_adjust
	 * @param kyoekihiPersonAdjust  the value for skf.skf3030_t_shataku_rental_rireki.kyoekihi_person_adjust
	 * @mbg.generated
	 */
	public void setKyoekihiPersonAdjust(Integer kyoekihiPersonAdjust) {
		this.kyoekihiPersonAdjust = kyoekihiPersonAdjust;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_person_total
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.kyoekihi_person_total
	 * @mbg.generated
	 */
	public Integer getKyoekihiPersonTotal() {
		return kyoekihiPersonTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_person_total
	 * @param kyoekihiPersonTotal  the value for skf.skf3030_t_shataku_rental_rireki.kyoekihi_person_total
	 * @mbg.generated
	 */
	public void setKyoekihiPersonTotal(Integer kyoekihiPersonTotal) {
		this.kyoekihiPersonTotal = kyoekihiPersonTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_pay_month
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.kyoekihi_pay_month
	 * @mbg.generated
	 */
	public String getKyoekihiPayMonth() {
		return kyoekihiPayMonth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoekihi_pay_month
	 * @param kyoekihiPayMonth  the value for skf.skf3030_t_shataku_rental_rireki.kyoekihi_pay_month
	 * @mbg.generated
	 */
	public void setKyoekihiPayMonth(String kyoekihiPayMonth) {
		this.kyoekihiPayMonth = kyoekihiPayMonth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_1_rental_month
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.parking_1_rental_month
	 * @mbg.generated
	 */
	public Integer getParking1RentalMonth() {
		return parking1RentalMonth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_1_rental_month
	 * @param parking1RentalMonth  the value for skf.skf3030_t_shataku_rental_rireki.parking_1_rental_month
	 * @mbg.generated
	 */
	public void setParking1RentalMonth(Integer parking1RentalMonth) {
		this.parking1RentalMonth = parking1RentalMonth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_1_rental_day
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.parking_1_rental_day
	 * @mbg.generated
	 */
	public Integer getParking1RentalDay() {
		return parking1RentalDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_1_rental_day
	 * @param parking1RentalDay  the value for skf.skf3030_t_shataku_rental_rireki.parking_1_rental_day
	 * @mbg.generated
	 */
	public void setParking1RentalDay(Integer parking1RentalDay) {
		this.parking1RentalDay = parking1RentalDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_2_rental_month
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.parking_2_rental_month
	 * @mbg.generated
	 */
	public Integer getParking2RentalMonth() {
		return parking2RentalMonth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_2_rental_month
	 * @param parking2RentalMonth  the value for skf.skf3030_t_shataku_rental_rireki.parking_2_rental_month
	 * @mbg.generated
	 */
	public void setParking2RentalMonth(Integer parking2RentalMonth) {
		this.parking2RentalMonth = parking2RentalMonth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_2_rental_day
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.parking_2_rental_day
	 * @mbg.generated
	 */
	public Integer getParking2RentalDay() {
		return parking2RentalDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_2_rental_day
	 * @param parking2RentalDay  the value for skf.skf3030_t_shataku_rental_rireki.parking_2_rental_day
	 * @mbg.generated
	 */
	public void setParking2RentalDay(Integer parking2RentalDay) {
		this.parking2RentalDay = parking2RentalDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_rental_adjust
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.parking_rental_adjust
	 * @mbg.generated
	 */
	public Integer getParkingRentalAdjust() {
		return parkingRentalAdjust;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_rental_adjust
	 * @param parkingRentalAdjust  the value for skf.skf3030_t_shataku_rental_rireki.parking_rental_adjust
	 * @mbg.generated
	 */
	public void setParkingRentalAdjust(Integer parkingRentalAdjust) {
		this.parkingRentalAdjust = parkingRentalAdjust;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_rental_total
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.parking_rental_total
	 * @mbg.generated
	 */
	public Integer getParkingRentalTotal() {
		return parkingRentalTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.parking_rental_total
	 * @param parkingRentalTotal  the value for skf.skf3030_t_shataku_rental_rireki.parking_rental_total
	 * @mbg.generated
	 */
	public void setParkingRentalTotal(Integer parkingRentalTotal) {
		this.parkingRentalTotal = parkingRentalTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.genbutu_santei
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.genbutu_santei
	 * @mbg.generated
	 */
	public Integer getGenbutuSantei() {
		return genbutuSantei;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.genbutu_santei
	 * @param genbutuSantei  the value for skf.skf3030_t_shataku_rental_rireki.genbutu_santei
	 * @mbg.generated
	 */
	public void setGenbutuSantei(Integer genbutuSantei) {
		this.genbutuSantei = genbutuSantei;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.bihin_genbutu_goukei
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.bihin_genbutu_goukei
	 * @mbg.generated
	 */
	public Integer getBihinGenbutuGoukei() {
		return bihinGenbutuGoukei;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.bihin_genbutu_goukei
	 * @param bihinGenbutuGoukei  the value for skf.skf3030_t_shataku_rental_rireki.bihin_genbutu_goukei
	 * @mbg.generated
	 */
	public void setBihinGenbutuGoukei(Integer bihinGenbutuGoukei) {
		this.bihinGenbutuGoukei = bihinGenbutuGoukei;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.shataku_account_name
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.shataku_account_name
	 * @mbg.generated
	 */
	public String getShatakuAccountName() {
		return shatakuAccountName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.shataku_account_name
	 * @param shatakuAccountName  the value for skf.skf3030_t_shataku_rental_rireki.shataku_account_name
	 * @mbg.generated
	 */
	public void setShatakuAccountName(String shatakuAccountName) {
		this.shatakuAccountName = shatakuAccountName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoeki_account_name
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.kyoeki_account_name
	 * @mbg.generated
	 */
	public String getKyoekiAccountName() {
		return kyoekiAccountName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoeki_account_name
	 * @param kyoekiAccountName  the value for skf.skf3030_t_shataku_rental_rireki.kyoeki_account_name
	 * @mbg.generated
	 */
	public void setKyoekiAccountName(String kyoekiAccountName) {
		this.kyoekiAccountName = kyoekiAccountName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.shataku_account_cd
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.shataku_account_cd
	 * @mbg.generated
	 */
	public String getShatakuAccountCd() {
		return shatakuAccountCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.shataku_account_cd
	 * @param shatakuAccountCd  the value for skf.skf3030_t_shataku_rental_rireki.shataku_account_cd
	 * @mbg.generated
	 */
	public void setShatakuAccountCd(String shatakuAccountCd) {
		this.shatakuAccountCd = shatakuAccountCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoeki_account_cd
	 * @return  the value of skf.skf3030_t_shataku_rental_rireki.kyoeki_account_cd
	 * @mbg.generated
	 */
	public String getKyoekiAccountCd() {
		return kyoekiAccountCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf3030_t_shataku_rental_rireki.kyoeki_account_cd
	 * @param kyoekiAccountCd  the value for skf.skf3030_t_shataku_rental_rireki.kyoeki_account_cd
	 * @mbg.generated
	 */
	public void setKyoekiAccountCd(String kyoekiAccountCd) {
		this.kyoekiAccountCd = kyoekiAccountCd;
	}
}