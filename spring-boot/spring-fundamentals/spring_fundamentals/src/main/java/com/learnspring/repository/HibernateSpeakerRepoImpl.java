package com.learnspring.repository;

import com.learnspring.model.Speaker;
import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepoImpl implements SpeakerRepo {
    
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Abrar");
        speaker.setLastName("Khan");
        speakers.add(speaker);
        return speakers;
    }
}
