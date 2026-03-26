import controller.CounterController;
import model.CounterModel;
import view.CounterView;

public class Main {
    public static void main(String[] args){
        CounterModel model = new CounterModel();
        CounterView view = new CounterView(600, 350);
        CounterController controller = new CounterController(model, view);
    }
}
