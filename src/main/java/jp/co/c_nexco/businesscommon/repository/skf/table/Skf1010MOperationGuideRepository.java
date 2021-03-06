package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf1010MOperationGuide;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf1010MOperationGuideKey;

public interface Skf1010MOperationGuideRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_operation_guide
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf1010MOperationGuideKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_operation_guide
	 * @mbg.generated
	 */
	int insert(Skf1010MOperationGuide record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_operation_guide
	 * @mbg.generated
	 */
	int insertSelective(Skf1010MOperationGuide record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_operation_guide
	 * @mbg.generated
	 */
	Skf1010MOperationGuide selectByPrimaryKey(Skf1010MOperationGuideKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_operation_guide
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf1010MOperationGuide record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_operation_guide
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf1010MOperationGuide record);
}