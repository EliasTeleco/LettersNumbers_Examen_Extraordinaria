package es.ulpgc.eite.cleancode.lettersnumbers.letters;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.lettersnumbers.data.LetterData;

public class LetterListModel implements LetterListContract.Model {

  public static String TAG = "LettersAndNumbers.LetterListModel";

  private String[] letters = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
      "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

  private List<LetterData> datasource;
  private Integer index;
  private Integer number;

  public LetterListModel() {
    datasource= new ArrayList<>();
    index=0;
    number=1;
  }

  @Override
  public void onRestartScreen(
      List<LetterData> datasource, Integer index, Integer number
  ) {

    // Log.e(TAG, "onRestartScreen()");

    this.datasource = datasource;
    this.index=index;
    this.number=number;
  }

  @Override
  public List<LetterData> getStoredDatasource() {
    return datasource;
  }


  @Override
  public void onAddLetter() {
    LetterData data = new LetterData();
    data.letter=letters[index++];
    datasource.add(data);
  }

  @Override
  public Integer getStoredIndex() {
    return index;
  }

  @Override
  public Integer getStoredNumber() {
    return number;
  }

  @Override
  public void onDataFromNextScreen(LetterData data, Integer number) {
    // Log.e(TAG, "onDataFromNextScreen()");

    // TODO: add code if is necessary
  }

}
