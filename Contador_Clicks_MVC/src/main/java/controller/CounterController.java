package controller;

import model.CounterModel;
import view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController implements ActionListener {
    private final CounterModel model;
    private final CounterView view;

    public CounterController(CounterModel model, CounterView view){
        this.model = model;
        this.view = view;
        setActionListeners();

    }

    public void setActionListeners(){
        this.view.getIncrementButton().addActionListener(this);
        this.view.getResetButton().addActionListener(this);
        this.view.getDecrementButton().addActionListener(this);
    }

    public CounterModel getModel() {
        return model;
    }

    public CounterView getView() {
        return view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(getView().getIncrementButton())){
            getModel().incrementClickCount();
        } else if (e.getSource().equals(getView().getResetButton())){
            getModel().resetClickCount();
        } else if (e.getSource().equals(getView().getDecrementButton())){
            getModel().decrementClickCount();
        }
        getView().getClickCountLabel().setText(getModel().getClickCount()+"");

    }
}
