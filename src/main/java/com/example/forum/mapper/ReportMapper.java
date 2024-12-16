package com.example.forum.mapper;

import com.example.forum.model.Report;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReportMapper {
    int insertReport(Report report);

    Report findById(@Param("id") Long id);

    List<Report> findAll();

    List<Report> findByStatus(@Param("status") Byte status);

    int updateReportStatus(@Param("id") Long id, @Param("status") Byte status);

    int deleteReport(@Param("id") Long id);
}
