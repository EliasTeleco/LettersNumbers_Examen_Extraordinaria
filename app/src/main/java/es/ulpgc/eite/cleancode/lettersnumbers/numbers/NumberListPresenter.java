package es.ulpgc.eite.cleancode.lettersnumbers.numbers;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.lettersnumbers.app.AppMediator;
import es.ulpgc.eite.cleancode.lettersnumbers.data.NumberData;

public class NumberListPresenter implements NumberListContract.Presenter {

  public static String TAG = "LettersAndNumbers.NumberListPresenter";

  private WeakReference<NumberListContract.View> view;
  private NumberListState state;
  private NumberListContract.Model model;
  private AppMediator mediator;

  public NumberListPresenter(AppMediator mediator) {
    this.mediator = mediator;
    state = mediator.getNumberListState();
  }


  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // TODO: add code if is necessary
  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    // TODO: add code if is necessary
  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // TODO: add code if is necessary

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
  public void onClickNumberListButton() {
    Log.e(TAG, "onClickNumberListButton()");

    // TODO: add code if is necessary
  }

  @Override
  public void onClickNumberListCell(NumberData data) {
    Log.e(TAG, "onClickNumberListCell()");

    // TODO: add code if is necessary
  }


  @Override
  public void injectView(WeakReference<NumberListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(NumberListContract.Model model) {
    this.model = model;
  }

}
