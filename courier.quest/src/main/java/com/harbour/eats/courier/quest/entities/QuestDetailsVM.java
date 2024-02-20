package com.harbour.eats.courier.quest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class QuestDetailsVM {
  private Integer id;
  private String description;
  private Integer hoursDration;
  private Integer orderThreshold;
  private Integer rewardAmount;

  public QuestDetailsVM() {

  }
}
