package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf2010MWorkflowLevel;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf2010MWorkflowLevelKey;

public interface Skf2010MWorkflowLevelRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_m_workflow_level
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf2010MWorkflowLevelKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_m_workflow_level
	 * @mbg.generated
	 */
	int insert(Skf2010MWorkflowLevel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_m_workflow_level
	 * @mbg.generated
	 */
	int insertSelective(Skf2010MWorkflowLevel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_m_workflow_level
	 * @mbg.generated
	 */
	Skf2010MWorkflowLevel selectByPrimaryKey(Skf2010MWorkflowLevelKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_m_workflow_level
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf2010MWorkflowLevel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf2010_m_workflow_level
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf2010MWorkflowLevel record);
}