import java.util.Objects;

public class Clock {

    private int hours;
    private int minutes;
    private int seconds;

    // Constants for validation
    private static final int HOURS_LOWER_LIMIT = 0;
    private static final int HOURS_UPPER_LIMIT = 24;
    private static final int MINUTES_LOWER_LIMIT = 0;
    private static final int MINUTES_UPPER_LIMIT = 60;
    private static final int SECONDS_LOWER_LIMIT = 0;
    private static final int SECONDS_UPPER_LIMIT = 60;

    public Clock() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    /**
     * Constructor that sets the clock to a specified time.
     * @param hours the hour to set the clock to.
     * @param minutes the minute to set the clock to.
     * @param seconds the second to set the clock to.
     */
    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // Getters for hours, minutes, and seconds
    public int getHours() {
        // TODO: Implement logic and return the appropriate value.
        return 0;
    }

    public int getMinutes() {
        // TODO: Implement logic and return the appropriate value.
        return 0;
    }

    public int getSeconds() {
        // TODO: Implement logic and return the appropriate value.
        return 0;
    }

    // Validating setters for hours, minutes, and seconds
    public void setHours(int hours) {
        if (hours >= HOURS_LOWER_LIMIT && hours < HOURS_UPPER_LIMIT) {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= MINUTES_LOWER_LIMIT && minutes < MINUTES_UPPER_LIMIT) {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= SECONDS_LOWER_LIMIT && seconds < SECONDS_UPPER_LIMIT) {
            this.seconds = seconds;
        }
    }

    @Override
    public String toString() {
        // TODO: Implement logic and return the appropriate value.
        return "";
    }

    /**
     * Advances the clock by one second.
     */
    public void tick() {
        seconds++;
        if (seconds >= SECONDS_UPPER_LIMIT) {
            seconds = 0;
            minutes++;
            if (minutes >= MINUTES_UPPER_LIMIT) {
                minutes = 0;
                hours++;
                if (hours >= HOURS_UPPER_LIMIT) {
                    hours = 0;
                }
            }
        }
    }

    /**
     * Advances the clock by a specified number of seconds incrementally.
     * @param seconds the number of seconds to advance the clock by.
     */
    public void tick(int seconds) {
        for (int i = 0; i < seconds; i++) {
            tick();
        }
    }
}