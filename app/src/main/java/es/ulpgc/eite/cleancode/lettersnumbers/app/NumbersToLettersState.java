package es.ulpgc.eite.cleancode.lettersnumbers.app;

import es.ulpgc.eite.cleancode.lettersnumbers.data.LetterData;

public class NumbersToLettersState {

  public LetterData data;
  public Integer number;

  public NumbersToLettersState(LetterData data, Integer number) {
    this.data=data;
    this.number=number;
  }
}
