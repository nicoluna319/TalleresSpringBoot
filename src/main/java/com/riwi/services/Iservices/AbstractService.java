package com.riwi.services.Iservices;

import java.util.List;

import com.riwi.entities.EventEntity;

public interface AbstractService {

    public EventEntity save(EventEntity event);
    public List<EventEntity> getAll();
    public EventEntity findById(Long id);

    public void delete(Long id);

    public EventEntity update(Long id, EventEntity objEvent);
    public List<EventEntity> search(String name);
}
