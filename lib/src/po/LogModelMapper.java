package po;

import po.LogModel;

public interface LogModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:55 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:55 CST 2017
     */
    int insert(LogModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:55 CST 2017
     */
    int insertSelective(LogModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:55 CST 2017
     */
    LogModel selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:55 CST 2017
     */
    int updateByPrimaryKeySelective(LogModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:55 CST 2017
     */
    int updateByPrimaryKey(LogModel record);
}