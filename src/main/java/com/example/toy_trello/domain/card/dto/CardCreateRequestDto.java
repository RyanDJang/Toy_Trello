package com.example.toy_trello.domain.card.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CardCreateRequestDto {
  private String cardName;
  private String cardDescription;
  private String cardColor;
 // private UserState userState;

}