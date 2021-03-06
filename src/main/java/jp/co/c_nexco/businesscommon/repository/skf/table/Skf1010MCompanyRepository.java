package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf1010MCompany;

public interface Skf1010MCompanyRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_company
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(String companyCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_company
	 * @mbg.generated
	 */
	int insert(Skf1010MCompany record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_company
	 * @mbg.generated
	 */
	int insertSelective(Skf1010MCompany record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_company
	 * @mbg.generated
	 */
	Skf1010MCompany selectByPrimaryKey(String companyCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_company
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf1010MCompany record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf1010_m_company
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf1010MCompany record);
}