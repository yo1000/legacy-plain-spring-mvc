package com.yo1000.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface DateTimeRepository {
    LocalDateTime now();
    LocalDate today();
}
