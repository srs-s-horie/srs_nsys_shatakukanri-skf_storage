package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3030TShatakuLedger;

public interface Skf3030TShatakuLedgerRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3030_t_shataku_ledger
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long shatakuKanriId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3030_t_shataku_ledger
	 * @mbg.generated
	 */
	int insert(Skf3030TShatakuLedger record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3030_t_shataku_ledger
	 * @mbg.generated
	 */
	int insertSelective(Skf3030TShatakuLedger record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3030_t_shataku_ledger
	 * @mbg.generated
	 */
	Skf3030TShatakuLedger selectByPrimaryKey(Long shatakuKanriId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3030_t_shataku_ledger
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf3030TShatakuLedger record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3030_t_shataku_ledger
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf3030TShatakuLedger record);
}