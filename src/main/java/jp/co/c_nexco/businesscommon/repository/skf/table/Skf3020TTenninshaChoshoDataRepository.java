package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3020TTenninshaChoshoData;

public interface Skf3020TTenninshaChoshoDataRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3020_t_tenninsha_chosho_data
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(String shainNo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3020_t_tenninsha_chosho_data
	 * @mbg.generated
	 */
	int insert(Skf3020TTenninshaChoshoData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3020_t_tenninsha_chosho_data
	 * @mbg.generated
	 */
	int insertSelective(Skf3020TTenninshaChoshoData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3020_t_tenninsha_chosho_data
	 * @mbg.generated
	 */
	Skf3020TTenninshaChoshoData selectByPrimaryKey(String shainNo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3020_t_tenninsha_chosho_data
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf3020TTenninshaChoshoData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3020_t_tenninsha_chosho_data
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf3020TTenninshaChoshoData record);
}