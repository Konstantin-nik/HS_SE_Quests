package com.harbour.eats.courier.quest.service.quest;

import com.harbour.eats.courier.quest.entities.QuestDetails;
import java.util.List;

public interface QuestService {

  List<QuestDetails> getActiveQuests();

  List<QuestDetails> getQuestsHistory();

  QuestDetails getQuestsDetails(Integer questId);

  String joinQuest(Integer questId);

}
