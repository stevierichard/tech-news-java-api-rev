package com.technews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Comment;
import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository <Comment, Integer> {
    List<Comment> findAllCommentsByPostId(int postId);

}
