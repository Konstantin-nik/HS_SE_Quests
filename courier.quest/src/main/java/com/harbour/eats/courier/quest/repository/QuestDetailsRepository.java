package com.harbour.eats.courier.quest.repository;

import com.harbour.eats.courier.quest.entities.QuestDetails;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestDetailsRepository extends JpaRepository<QuestDetails, Integer> {
    List<QuestDetails> findByActiveStatusTrue();
}