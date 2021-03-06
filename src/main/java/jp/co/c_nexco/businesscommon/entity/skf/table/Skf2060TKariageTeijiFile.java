package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;

public class Skf2060TKariageTeijiFile extends Skf2060TKariageTeijiFileKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2060_t_kariage_teiji_file.attached_no
	 * @mbg.generated
	 */
	private String attachedNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2060_t_kariage_teiji_file.file_size
	 * @mbg.generated
	 */
	private String fileSize;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column skf.skf2060_t_kariage_teiji_file.file_stream
	 * @mbg.generated
	 */
	private byte[] fileStream;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table skf.skf2060_t_kariage_teiji_file
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2060_t_kariage_teiji_file.attached_no
	 * @return  the value of skf.skf2060_t_kariage_teiji_file.attached_no
	 * @mbg.generated
	 */
	public String getAttachedNo() {
		return attachedNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2060_t_kariage_teiji_file.attached_no
	 * @param attachedNo  the value for skf.skf2060_t_kariage_teiji_file.attached_no
	 * @mbg.generated
	 */
	public void setAttachedNo(String attachedNo) {
		this.attachedNo = attachedNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2060_t_kariage_teiji_file.file_size
	 * @return  the value of skf.skf2060_t_kariage_teiji_file.file_size
	 * @mbg.generated
	 */
	public String getFileSize() {
		return fileSize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2060_t_kariage_teiji_file.file_size
	 * @param fileSize  the value for skf.skf2060_t_kariage_teiji_file.file_size
	 * @mbg.generated
	 */
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column skf.skf2060_t_kariage_teiji_file.file_stream
	 * @return  the value of skf.skf2060_t_kariage_teiji_file.file_stream
	 * @mbg.generated
	 */
	public byte[] getFileStream() {
		return fileStream;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column skf.skf2060_t_kariage_teiji_file.file_stream
	 * @param fileStream  the value for skf.skf2060_t_kariage_teiji_file.file_stream
	 * @mbg.generated
	 */
	public void setFileStream(byte[] fileStream) {
		this.fileStream = fileStream;
	}
}