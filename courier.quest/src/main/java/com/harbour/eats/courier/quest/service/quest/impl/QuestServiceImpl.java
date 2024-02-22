package com.harbour.eats.courier.quest.service.quest.impl;

import static com.harbour.eats.courier.quest.constants.ErrorMessages.QUEST_DOES_NOT_EXIST;

import com.harbour.eats.courier.quest.entities.QuestDetails;
import com.harbour.eats.courier.quest.repository.QuestDetailsRepository;
import com.harbour.eats.courier.quest.service.quest.QuestService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public class QuestServiceImpl implements QuestService {

  @Autowired
  QuestDetailsRepository questDetailsRepository;

  /**
   * Вернёт список активных квестов.
   */
  @Override
  public List<QuestDetails> getActiveQuests() {
    return questDetailsRepository.findByActiveStatusTrue();
  }

  /**
   * Вернёт список всех квестов.
   */
  @Override
  public List<QuestDetails> getQuestsHistory() {
    return questDetailsRepository.findAll();
  }

  /**
   * Вернёт квест по id.
   */
  @Override
  public QuestDetails getQuestsDetails(Integer questId) {
    return questDetailsRepository.findById(questId).orElse(null);
  }

  /**
   *
   */
  @Override
  public String joinQuest(Integer questId) {
    QuestDetails questDetails = questDetailsRepository.findById(questId).orElse(null);
    if (questDetails == null) {
      return QUEST_DOES_NOT_EXIST.getMessage();
    }
    return null;
  }
}
