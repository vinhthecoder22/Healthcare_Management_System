package com.vinhthe.communityportalservice.service;

import com.vinhthe.communityportalservice.dto.VoteCountDto;
import com.vinhthe.communityportalservice.dto.VoteDto;
import com.vinhthe.communityportalservice.exception.CustomException;

public interface VoteService {
    void castVote(VoteDto voteDto) throws CustomException;

    VoteCountDto countVotes(Long postId) throws CustomException;
}
