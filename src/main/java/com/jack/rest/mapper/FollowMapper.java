package com.jack.rest.mapper;


import com.jack.rest.model.Follow;
import com.jack.rest.model.FollowExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface FollowMapper
{

    int countByExample(FollowExample example);

    int deleteByExample(FollowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Follow record);

    int insertSelective(Follow record);

    List<Follow> selectByExampleWithRowbounds(FollowExample example, RowBounds rowBounds);

    List<Follow> selectByExample(FollowExample example);

    Follow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Follow record, @Param("example") FollowExample example);

    int updateByExample(@Param("record") Follow record, @Param("example") FollowExample example);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);

    Follow selectByUidAndTargetId(@Param("userId") Long uid, @Param("targetId") Long targetId);

    List<Follow> selectByUid(@Param("userId") Long uid, @Param("type") Integer type, @Param("start") Long start, @Param("num") Integer num);

    List<Follow> selectByTargetId(@Param("targetId") Long targetId, @Param("start") Long start, @Param("num") Integer num);

}