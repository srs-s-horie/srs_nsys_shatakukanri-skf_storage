package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf2010TApplComment;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf2010TApplCommentKey;

public interface Skf2010TApplCommentRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_t_appl_comment
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf2010TApplCommentKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_t_appl_comment
	 * @mbg.generated
	 */
	int insert(Skf2010TApplComment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_t_appl_comment
	 * @mbg.generated
	 */
	int insertSelective(Skf2010TApplComment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_t_appl_comment
	 * @mbg.generated
	 */
	Skf2010TApplComment selectByPrimaryKey(Skf2010TApplCommentKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_t_appl_comment
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf2010TApplComment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_t_appl_comment
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf2010TApplComment record);
}