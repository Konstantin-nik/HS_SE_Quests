package com.harbour.eats.courier.quest.entities;

import java.util.ArrayList;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Courier {

  private Integer id;
  private String name;
  private Set<Integer> questIds;

  public void addQuest(QuestDetailsVM questDetailsVM) {
    ArrayList<Integer> ids = new ArrayList<>(questIds.stream().toList());
    ids.add(questDetailsVM.getId());
    questIds = Set.copyOf(ids);
  }
}
