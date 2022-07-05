package es.ulpgc.eite.cleancode.lettersnumbers.letters;

import java.lang.ref.WeakReference;
import java.util.List;

import es.ulpgc.eite.cleancode.lettersnumbers.app.LettersToNumbersState;
import es.ulpgc.eite.cleancode.lettersnumbers.app.NumbersToLettersState;
import es.ulpgc.eite.cleancode.lettersnumbers.data.LetterData;

public interface LetterListContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(LetterListViewModel viewModel);
    void navigateToNextScreen();

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

    void onClickLetterListButton();
    void onClickLetterListCell(LetterData data);
  }

  interface Model {

    Integer getStoredNumber();
    void onDataFromNextScreen(LetterData data, Integer number);

    void onRestartScreen(
        List<LetterData> datasource, Integer index, Integer number
    );

    List<LetterData> getStoredDatasource();
    void onAddLetter();
    Integer getStoredIndex();
  }


}
