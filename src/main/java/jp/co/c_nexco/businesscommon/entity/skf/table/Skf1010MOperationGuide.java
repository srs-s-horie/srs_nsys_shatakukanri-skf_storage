package jp.co.c_nexco.businesscommon.entity.skf.table;

import java.io.Serializable;

public class Skf1010MOperationGuide extends Skf1010MOperationGuideKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skf.skf1010_m_operation_guide.operation_guide
     *
     * @mbg.generated
     */
    private String operationGuide;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table skf.skf1010_m_operation_guide
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skf.skf1010_m_operation_guide.operation_guide
     *
     * @return the value of skf.skf1010_m_operation_guide.operation_guide
     *
     * @mbg.generated
     */
    public String getOperationGuide() {
        return operationGuide;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skf.skf1010_m_operation_guide.operation_guide
     *
     * @param operationGuide the value for skf.skf1010_m_operation_guide.operation_guide
     *
     * @mbg.generated
     */
    public void setOperationGuide(String operationGuide) {
        this.operationGuide = operationGuide;
    }
}