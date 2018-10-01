package com.yo1000.repository.system;

import com.yo1000.repository.DateTimeRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SystemDateTimeRepository implements DateTimeRepository {

    @Override
    public LocalDateTime now() {
        return LocalDateTime.now();
    }

    @Override
    public LocalDate today() {
        return LocalDate.now();
    }
}
