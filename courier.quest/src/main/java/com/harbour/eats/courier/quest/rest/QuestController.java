package com.harbour.eats.courier.quest.rest;

import static com.harbour.eats.courier.quest.constants.ErrorMessages.QUEST_DOES_NOT_EXIST;

import com.harbour.eats.courier.quest.entities.QuestDetails;
import com.harbour.eats.courier.quest.service.quest.QuestService;
import com.harbour.eats.courier.quest.service.quest.impl.QuestServiceImpl;
import org.openapitools.api.QuestsApiController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class QuestController extends QuestsApiController {

  @Autowired
  @Qualifier(QuestServiceImpl.NAME)
  QuestService questService;

  public QuestController() {
    super();
  }

  /**
   * Вернёт список активных квестов.
   */
  @Override
  public ResponseEntity<String> questsActiveGet() {
    return ResponseEntity.ok(questService.getActiveQuests().toString());
  }

  /**
   * Вернёт список всех квестов.
   */
  @Override
  public ResponseEntity<String> questsHistoryGet() {
    return ResponseEntity.ok(questService.getQuestsHistory().toString());
  }

  /**
   * Вернёт квест по id.
   */
  @Override
  public ResponseEntity<String> questsQuestIdDetailsGet(int questId) {
    QuestDetails questsDetails = questService.getQuestsDetails(questId);
    if (questsDetails == null) {
      return ResponseEntity.ok(QUEST_DOES_NOT_EXIST.getMessage());
    }

    return ResponseEntity.ok(questService.getQuestsDetails(questId).toString());
  }

  /**
   *
   */
  @Override
  public ResponseEntity<String> questsQuestIdJoinPost(int questId) {
    return ResponseEntity.ok(questService.joinQuest(questId));
  }
}
