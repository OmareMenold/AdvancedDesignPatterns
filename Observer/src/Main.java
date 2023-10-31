import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        // Create a traffic light
        TrafficLight trafficLight = new TrafficLight();

        // Create traffic light controllers (observers)
        TrafficLightListener controller1 = new TrafficLightController("Controller 1");
        TrafficLightListener controller2 = new TrafficLightController("Controller 2");

        // Register observers with the traffic light
        trafficLight.changeTrafficLight(controller1);
        trafficLight.changeTrafficLight(controller2);

        // Define the time interval for state changes (in milliseconds)
        int interval = 2000; // 2 seconds

        // Create a Timer and TimerTask to automate state changes
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            private String[] states = { "Red", "Green", "Yellow" };
            private int currentIndex = 0;

            @Override
            public void run() {
                String nextState = states[currentIndex];
                trafficLight.setState(nextState);
                currentIndex = (currentIndex + 1) % states.length;
            }
        };

        // Schedule the task to run at regular intervals
        timer.scheduleAtFixedRate(task, 0, interval);

        // Run the simulation for a certain duration (in milliseconds)
        int simulationDuration = 10000; // 10 seconds

        // Wait for the simulation to complete
        try {
            Thread.sleep(simulationDuration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the timer and end the simulation
        timer.cancel();
        timer.purge();
    }
}