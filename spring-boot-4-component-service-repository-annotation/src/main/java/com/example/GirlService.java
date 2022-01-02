package com.example;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public Girl getGirl() {
        String name = getRandomName(10);

        return girlRepository.getGirlByName(name);
    }

    public String getRandomName(int length) {
        return RandomStringUtils.randomAlphabetic(length).toLowerCase();
    }
}
