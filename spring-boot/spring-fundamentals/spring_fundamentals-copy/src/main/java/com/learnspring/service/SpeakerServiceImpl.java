package com.learnspring.service;

import com.learnspring.model.Speaker;
import com.learnspring.repository.SpeakerRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepo speakerRepo;
    
    public SpeakerServiceImpl() {
        System.out.println("SpeakerImpl no args constructor");
    }
    
    // Constructor Injection
    @Autowired
    public SpeakerServiceImpl(SpeakerRepo speakerRepo) {
        System.out.println("SpeakerImpl args constructor");
        this.speakerRepo = speakerRepo;
    }
    
    // Setter Injection
    // @Autowired
    public void setSpeakerRepo(SpeakerRepo speakerRepo) {
        System.out.println("SpeakerImpl setter");
        this.speakerRepo = speakerRepo;
    }
    
    public List<Speaker> findAll() {
        return speakerRepo.findAll();
    }
}
