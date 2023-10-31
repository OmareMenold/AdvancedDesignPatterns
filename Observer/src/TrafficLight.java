import java.util.ArrayList;
import java.util.List;

public class TrafficLight implements TrafficLightInterface{


    private String state;
    private List<TrafficLightListener> listeners;

    public TrafficLight(){
        this.state = "red";
        this.listeners = new ArrayList<>();
    }

    public void setState(String state) {
        this.state = state;
        notifyTrafficLightChange();
    }

    @Override
    public void changeTrafficLight(TrafficLightListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeObserver(TrafficLightListener listener) {
        listeners.remove(listener);
    }
    @Override
    public void notifyTrafficLightChange() {
        for (TrafficLightListener listener: listeners){
            listener.update(state);
        }
    }
}
