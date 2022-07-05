package es.ulpgc.eite.cleancode.lettersnumbers.numbers;

import es.ulpgc.eite.cleancode.lettersnumbers.data.LetterData;
import es.ulpgc.eite.cleancode.lettersnumbers.data.NumberData;

public class NumberListModel implements NumberListContract.Model {

  public static String TAG = "LettersAndNumbers.NumberListModel";

  private LetterData data;
  private Integer number;

  @Override
  public LetterData getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }


  @Override
  public Integer getStoredNumber() {
    return number;
  }


  @Override
  public void onAddNumber() {
    NumberData data1 = new NumberData();
    data1.number= number++;
    this.data.numbers.add(data1);
  }


  @Override
  public void onRestartScreen(LetterData data, Integer number) {
    // Log.e(TAG, "onRestartScreen()");

    // TODO: add code if is necessary
  }


  @Override
  public void onDataFromPreviousScreen(LetterData data, Integer number) {
    // Log.e(TAG, "onDataFromPreviousScreen()");

    // TODO: add code if is necessary
  }

}
