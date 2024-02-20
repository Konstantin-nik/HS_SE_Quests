package com.harbour.eats.courier.quest.rest;

import com.harbour.eats.courier.quest.service.quest.QuestService;
import java.util.List;
import org.openapitools.api.QuestsApiController;
import org.openapitools.model.QuestDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class QuestController extends QuestsApiController {

  @Autowired
  QuestService questService;

  public QuestController() {
    super();
  }

  /**
   * @return список доступных квестов.
   */
  @Override
  public ResponseEntity<List<QuestDetails>> questsActiveGet() {
    return ResponseEntity.ok(questService.getActiveQuests());
  }

  /**
   * @return список всех квестов.
   */
  @Override
  public ResponseEntity<List<QuestDetails>> questsHistoryGet() {
    return ResponseEntity.ok(questService.getQuestsHistory());
  }

  /**
   * @return вернёт квест по id.
   */
  @Override
  public ResponseEntity<QuestDetails> questsQuestIdDetailsGet(int questId) {
    return ResponseEntity.ok(questService.getQuestsDetails(questId));

  }

  /**
   *
   */
  @Override
  public ResponseEntity questsQuestIdJoinPost(int questId) {
    return ResponseEntity.ok(questService.joinQuest(questId));
  }
}
