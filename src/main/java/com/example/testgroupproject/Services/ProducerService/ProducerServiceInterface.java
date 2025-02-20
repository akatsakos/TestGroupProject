package com.example.testgroupproject.Services.ProducerService;

import com.example.testgroupproject.Models.Producer;
import com.example.testgroupproject.Models.Product;

import java.util.List;

public interface ProducerServiceInterface {

    void insertProducer(Producer p);

    List<Producer> getAllProducers();

    Producer getProducerById(Integer id);

    void deleteProducer(Producer p);

    void updateProducer(Producer p);
}
