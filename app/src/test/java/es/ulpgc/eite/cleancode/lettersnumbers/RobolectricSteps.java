package es.ulpgc.eite.cleancode.lettersnumbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import android.os.Bundle;
import android.widget.ListView;

import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;

import es.ulpgc.eite.cleancode.lettersnumbers.data.LetterData;
import es.ulpgc.eite.cleancode.lettersnumbers.data.NumberData;
import es.ulpgc.eite.cleancode.lettersnumbers.letters.LetterListActivity;
import es.ulpgc.eite.cleancode.lettersnumbers.letters.LetterListAdapter;
import es.ulpgc.eite.cleancode.lettersnumbers.numbers.NumberListActivity;
import es.ulpgc.eite.cleancode.lettersnumbers.numbers.NumberListAdapter;

/**
 * Created by Luis on junio, 2022
 */
public class RobolectricSteps {

  private ActivityController<LetterListActivity> lTestCtrl;
  private ActivityController<NumberListActivity> nTestCtrl;

  public void iniciamosPantallaP1(String p1) {

    if(p1.equals("Letters")) {

      lTestCtrl = Robolectric.buildActivity(LetterListActivity.class);
      lTestCtrl.create().resume().visible();

    }

    if(p1.equals("Numbers")) {
      lTestCtrl.pause();

      nTestCtrl = Robolectric.buildActivity(NumberListActivity.class);
      nTestCtrl.create().resume().visible();

    }

  }
  
  public void mostramosListaDeLetrasConDimensionP1(String p1) {
    //onView (withId (R.id.letterList)).check (matches (withListSize (p1)));

    int size = Integer.parseInt(p1);

    LetterListActivity activity = lTestCtrl.get();

    ListView list = activity.findViewById(R.id.letterList);
    LetterListAdapter adapter = (LetterListAdapter) list.getAdapter();


    //assertThat(String.valueOf(adapter.getCount()), equalTo(p1));
    assertThat(adapter.getCount(), equalTo(size));
  }

  public void pulsamosBotonDeListaDeLetras() {
    //onView(withId(R.id.letterListButton)).perform(click());

    LetterListActivity activity = lTestCtrl.get();
    activity.findViewById(R.id.letterListButton).performClick();
  }

  public void pulsamosBotonDeListaDeNumeros() {
    //onView(withId(R.id.numberListButton)).perform(click());

    NumberListActivity activity = nTestCtrl.get();
    activity.findViewById(R.id.numberListButton).performClick();
  }

  public void mostramosLetraEnListaEnPosicionP1ConValorP2(String p1, String p2) {
    /*
    onView(withId (R.id.letterList))
        .check(matches(withValueAtPosition(p2, p1)));
        
    */

    int pos = Integer.parseInt(p1);

    LetterListActivity activity = lTestCtrl.get();

    ListView list = activity.findViewById(R.id.letterList);
    LetterListAdapter adapter = (LetterListAdapter) list.getAdapter();
    LetterData item = adapter.getItem(pos);

    assertThat(item.letter, equalTo(p2));
  }

  public void pulsamosCeldaDeLetraEnPosicionP1(String p1) {
    /*
    onData(allOf())
        .inAdapterView(withId(R.id.letterList))
        .atPosition(Integer.valueOf(p1))
        .perform(click());
    */

    int pos = Integer.parseInt(p1);

    LetterListActivity activity = lTestCtrl.get();
    ListView list = activity.findViewById(R.id.letterList);

    list.measure(0,0);
    list.layout(0,0,100,1000);

    //list.smoothScrollToPosition(pos);
    list.getChildAt(pos).performClick();
    //shadowOf(list).performItemClick(pos);
  }

  public void mostramosListaDeNumerosConDimensionP1(String p1) {
    //onView (withId (R.id.numberList)).check (matches (withListSize (p1)));

    int size = Integer.parseInt(p1);

    NumberListActivity activity = nTestCtrl.get();

    ListView list = activity.findViewById(R.id.numberList);
    NumberListAdapter adapter = (NumberListAdapter) list.getAdapter();


    assertThat(adapter.getCount(), equalTo(size));
  }



  public void mostramosNumeroEnListaEnPosicionP1ConValorP2(String p1, String p2) {
    /*
    onView(withId (R.id.numberList))
        .check(matches(withValueAtPosition(p2, p1)));
    */


    int pos = Integer.parseInt(p1);
    int num = Integer.parseInt(p2);

    NumberListActivity activity = nTestCtrl.get();

    ListView list = activity.findViewById(R.id.numberList);
    NumberListAdapter adapter = (NumberListAdapter) list.getAdapter();
    NumberData item = adapter.getItem(pos);

    assertThat(item.number, equalTo(num));
  }

  public void pulsamosBackEnListaDeNumeros() {
    //pressBack();

    //NumberListActivity activity = nTestCtrl.get();
    //activity.finish();

    nTestCtrl.destroy();
    lTestCtrl.resume();
  }

  public void rotarPantallaP1(String p1) {

    Bundle bundle = new Bundle();

    if(p1.equals("Letters")) {
      lTestCtrl
          .saveInstanceState(bundle)
          .pause()
          .stop()
          .destroy();

      lTestCtrl = Robolectric.buildActivity(LetterListActivity.class)
          .create(bundle)
          .restoreInstanceState(bundle)
          .resume()
          .visible();
    }

    if(p1.equals("Numbers")) {
      nTestCtrl
          .saveInstanceState(bundle)
          .pause()
          .stop()
          .destroy();

      nTestCtrl = Robolectric.buildActivity(NumberListActivity.class)
          .create(bundle)
          .restoreInstanceState(bundle)
          .resume()
          .visible();

    }

  }

 
}
