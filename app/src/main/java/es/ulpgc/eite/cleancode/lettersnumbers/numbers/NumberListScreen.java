package es.ulpgc.eite.cleancode.lettersnumbers.numbers;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.lettersnumbers.app.AppMediator;

public class NumberListScreen {

  public static void configure(NumberListContract.View view) {

//    WeakReference<FragmentActivity> context =
//        new WeakReference<>((FragmentActivity) view);

    AppMediator mediator = AppMediator.getInstance();

    NumberListContract.Presenter presenter = new NumberListPresenter(mediator);
    NumberListContract.Model model = new NumberListModel();

    presenter.injectModel(model);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
