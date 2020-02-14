package com.learnspring.repository;

import com.learnspring.model.Speaker;
import java.util.List;

public interface SpeakerRepo {
    
    List<Speaker> findAll();
}
