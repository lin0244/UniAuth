package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.HrPerson;
import com.dianrong.common.uniauth.server.data.entity.HrPersonExample;
import com.dianrong.common.uniauth.server.support.audit.MapperAudit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MapperAudit
public interface HrPersonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_person
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int countByExample(HrPersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_person
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int deleteByExample(HrPersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_person
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int deleteByPrimaryKey(Long personId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_person
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int insert(HrPerson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_person
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int insertSelective(HrPerson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_person
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    List<HrPerson> selectByExample(HrPersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_person
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    HrPerson selectByPrimaryKey(Long personId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_person
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int updateByExampleSelective(@Param("record") HrPerson record,
        @Param("example") HrPersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_person
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int updateByExample(@Param("record") HrPerson record, @Param("example") HrPersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_person
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int updateByPrimaryKeySelective(HrPerson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_person
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int updateByPrimaryKey(HrPerson record);

    /**
     * 清空数据库表所有数据.
     */
    int clearTable();

    /**
     * 批量插入数据.
     */
    int insertBatch(List<HrPerson> hrPersonList);
}