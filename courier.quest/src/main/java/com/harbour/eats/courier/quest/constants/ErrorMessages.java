package com.harbour.eats.courier.quest.constants;

import static ch.qos.logback.core.CoreConstants.EMPTY_STRING;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessages {
  QUEST_DOES_NOT_EXIST("1", "Such quest does not exist");

  private final String code;
  private final String message;

  public static String getMessageByCode(String code) {
    for (ErrorMessages error : ErrorMessages.values()) {
      if (error.getCode().equals(code)) {
        return error.getMessage();
      }
    }
    return EMPTY_STRING;
  }
}
