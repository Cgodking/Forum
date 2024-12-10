package com.example.forum.mapper;

import com.example.forum.model.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface CommentMapper {
    int insertComment(Comment comment);

    Comment findById(@Param("id") Long id);

    List<Comment> findByPostId(@Param("postId") Long postId);

    int updateComment(Comment comment);

    int deleteComment(@Param("id") Long id);
}
