package com.airaa.ecommerce_app.Repo;


import com.airaa.ecommerce_app.entity.PointsHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PointsHistoryRepository extends JpaRepository<PointsHistory, Long> {
    List<PointsHistory> findByUserId(Long userId);
}

