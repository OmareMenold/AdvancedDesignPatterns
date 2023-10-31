public class TrafficLightController implements TrafficLightListener {

    private String name;
    public TrafficLightController(String name){
        this.name = name;
    }
    @Override
    public void update(String state) {
        System.out.println("Traffic light " + name+ " received notification on change of state to: " + state );
    }
}
