package jp.co.c_nexco.businesscommon.repository.skf.table;

import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3010MShatakuRoom;
import jp.co.c_nexco.businesscommon.entity.skf.table.Skf3010MShatakuRoomKey;

public interface Skf3010MShatakuRoomRepository {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_room
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Skf3010MShatakuRoomKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_room
	 * @mbg.generated
	 */
	int insert(Skf3010MShatakuRoom record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_room
	 * @mbg.generated
	 */
	int insertSelective(Skf3010MShatakuRoom record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_room
	 * @mbg.generated
	 */
	Skf3010MShatakuRoom selectByPrimaryKey(Skf3010MShatakuRoomKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_room
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Skf3010MShatakuRoom record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table skf.skf3010_m_shataku_room
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Skf3010MShatakuRoom record);
}