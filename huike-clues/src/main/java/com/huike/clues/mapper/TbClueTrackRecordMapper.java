package com.huike.clues.mapper;


import com.huike.clues.domain.vo.ClueTrackRecordVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 线索跟进记录Mapper接口
 * @date 2021-04-19
 */
@Mapper
public interface TbClueTrackRecordMapper {


    Integer listRecord();

    
}
