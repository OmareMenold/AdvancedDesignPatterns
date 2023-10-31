public interface TrafficLightInterface {

    void changeTrafficLight(TrafficLightListener listener);

    void removeObserver(TrafficLightListener listener);

    void notifyTrafficLightChange();
}
