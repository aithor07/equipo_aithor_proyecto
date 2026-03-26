import controller.CounterController;
import model.CounterModel;
import view.CounterView;

public class Main {
    public static void main(String[] args){
        //Removed unnecessary variables, CounterController constructor handles the creation of the model and view.
        CounterController controller = new CounterController(new CounterModel(), new CounterView(600, 350));
    }
}
