package com.harbour.eats.courier.quest.service.quest;

import java.util.List;
import org.openapitools.model.QuestDetails;

public interface QuestService {


  List<QuestDetails> getActiveQuests();

  List<QuestDetails> getQuestsHistory();

  QuestDetails getQuestsDetails(Integer questId);

  String joinQuest(Integer questId);

}
