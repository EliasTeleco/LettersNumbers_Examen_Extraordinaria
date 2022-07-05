package es.ulpgc.eite.cleancode.lettersnumbers.app;

import es.ulpgc.eite.cleancode.lettersnumbers.letters.LetterListState;
import es.ulpgc.eite.cleancode.lettersnumbers.numbers.NumberListState;

public class AppMediator  {

  private static AppMediator instance;

  private LetterListState letterListState;
  private NumberListState numberListState;

  private LettersToNumbersState lettersToNumbersState;
  private NumbersToLettersState numbersToLettersState;

  private AppMediator() {
    numberListState=new NumberListState();
    letterListState=new LetterListState();
  }

  public static AppMediator getInstance(){
    if(instance==null){
      instance= new AppMediator();
    }

    return instance;
  }

  public static void resetInstance(){
    instance=null;
  }

  public LetterListState getLetterListState() {
    return letterListState;
  }

  public NumberListState getNumberListState() {
    return numberListState;
  }

  public void setNextLetterListScreenState(LettersToNumbersState state) {
    lettersToNumbersState=state;

  }

  public NumbersToLettersState getNextLetterListScreenState() {
    NumbersToLettersState state=numbersToLettersState;
    numbersToLettersState = null;
    return state;
  }

  public void setPreviousNumberListScreenState(NumbersToLettersState state) {
    numbersToLettersState=state;
  }

  public LettersToNumbersState getPreviousNumberListScreenState() {
    LettersToNumbersState state=lettersToNumbersState;
    lettersToNumbersState = null;
    return state;
  }
}
