package com.learnspring.service;

import com.learnspring.model.Speaker;
import com.learnspring.repository.HibernateSpeakerRepoImpl;
import com.learnspring.repository.SpeakerRepo;
import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepo speakerRepo = new HibernateSpeakerRepoImpl();
    
    public List<Speaker> findAll() {
        return speakerRepo.findAll();
    }
}
