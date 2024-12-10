package com.example.forum.mapper;

import com.example.forum.model.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MessageMapper {
    int insertMessage(Message message);

    Message findById(@Param("id") Long id);

    List<Message> findByReceiver(@Param("receiverId") Long receiverId);

    int updateMessageStatus(@Param("id") Long id, @Param("status") Byte status);

    int deleteMessage(@Param("id") Long id);
}
