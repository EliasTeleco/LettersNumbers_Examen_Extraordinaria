package es.ulpgc.eite.cleancode.lettersnumbers.numbers;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.lettersnumbers.data.LetterData;
import es.ulpgc.eite.cleancode.lettersnumbers.data.NumberData;

public interface NumberListContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(NumberListViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);
    void injectModel(Model model);

    void onResume();
    void onStart();
    void onRestart();
    void onBackPressed();
    void onPause();
    void onDestroy();

    void onClickNumberListButton();
    void onClickNumberListCell(NumberData data);
  }

  interface Model {
    LetterData getStoredData();
    Integer getStoredNumber();
    void onRestartScreen(LetterData data, Integer number);
    void onDataFromPreviousScreen(LetterData data,Integer number);

    void onAddNumber();
  }

}
