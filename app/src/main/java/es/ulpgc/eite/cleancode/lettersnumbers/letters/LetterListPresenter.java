package es.ulpgc.eite.cleancode.lettersnumbers.letters;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.lettersnumbers.app.AppMediator;
import es.ulpgc.eite.cleancode.lettersnumbers.app.LettersToNumbersState;
import es.ulpgc.eite.cleancode.lettersnumbers.app.NumbersToLettersState;
import es.ulpgc.eite.cleancode.lettersnumbers.data.LetterData;

public class LetterListPresenter implements LetterListContract.Presenter {

  public static String TAG = "LettersAndNumbers.LetterListPresenter";

  private WeakReference<LetterListContract.View> view;
  private LetterListState state;
  private LetterListContract.Model model;
  private AppMediator mediator;

  public LetterListPresenter(AppMediator mediator) {
    this.mediator = mediator;
    state = mediator.getLetterListState();
  }


  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // TODO: add code if is necessary
    if (state == null) {
      state = new LetterListState();
    }

  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    // TODO: add code if is necessary
      model.onRestartScreen(state.datasource,state.number ,state.number);

  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // TODO: add code if is necessary
    NumbersToLettersState savedState = getStateFromNextScreen();
     if (savedState != null) {

      // update the model if is necessary
      model.onDataFromNextScreen(savedState.data, savedState.number);
    }


    // call the model and update the state
    state.datasource = model.getStoredDatasource();

    // update the view
    view.get().onDataUpdated(state);
  }



  @Override
  public void onBackPressed() {
    Log.e(TAG, "onBackPressed()");

    // TODO: add code if is necessary
  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause()");

    // TODO: add code if is necessary
  }

  @Override
  public void onDestroy() {
    Log.e(TAG, "onDestroy()");

    // TODO: add code if is necessary
  }

  @Override
  public void onClickLetterListButton() {
    Log.e(TAG, "onClickLetterListButton()");

    // TODO: add code if is necessary
    model.onAddLetter();

    LetterData nuevaLetra=new LetterData();
    nuevaLetra.letter= String.valueOf(model.getStoredDatasource()); //
    view.get().onDataUpdated(state);


  }

  @RequiresApi(api = Build.VERSION_CODES.N)
  @Override
  public void onClickLetterListCell(LetterData data) {
    Log.e(TAG, "onClickLetterListCell()");

    // TODO: add code if is necessary
    /*LettersToNumbersState pasarNumber=new LettersToNumbersState();
    pasarNumber.number= Math.toIntExact(data.id);
    passStateToNextScreen(pasarNumber);*/

    view.get().navigateToNextScreen();
  }




  @Override
  public void injectView(WeakReference<LetterListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(LetterListContract.Model model) {
    this.model = model;
  }







  private NumbersToLettersState getStateFromNextScreen() {
    return mediator.getNextLetterListScreenState();
  }
  private void passStateToNextScreen(LettersToNumbersState lettersToNumbersState) {
        mediator.setNextLetterListScreenState( lettersToNumbersState);
  }

}
