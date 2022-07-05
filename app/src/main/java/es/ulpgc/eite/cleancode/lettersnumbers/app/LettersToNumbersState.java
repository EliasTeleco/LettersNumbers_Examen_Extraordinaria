package es.ulpgc.eite.cleancode.lettersnumbers.app;

import es.ulpgc.eite.cleancode.lettersnumbers.data.LetterData;

public class LettersToNumbersState {

  public LetterData data;
  public Integer number;

  public LettersToNumbersState(LetterData data, Integer number) {
    this.data=data;
    this.number=number;
  }
}
