package com.mukesh.service;

import com.mukesh.models.Comment;

public interface CommentService {
	public Comment createComment(Comment comment, Integer postId, Integer userId) throws Exception;
	public Comment findCommentById (Integer CommentId) throws Exception;
	public Comment likeComment (Integer CommentId, Integer userId) throws Exception;

}
