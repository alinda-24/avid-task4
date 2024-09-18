public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    private static final int SECONDS_LOWER_LIMIT = 0;
    private static final int SECONDS_UPPER_LIMIT = 60;
    private static final int MINUTES_LOWER_LIMIT = 0;
    private static final int MINUTES_UPPER_LIMIT = 60;
    private static final int HOURS_LOWER_LIMIT = 1;
    private static final int HOURS_UPPER_LIMIT = 13;

    /**
     * Default constructor, creates a clock with time set to 12:00:00.
     */
    public Clock() {
        this.hours = 12;
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
        this(); // Call default constructor
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // Getters for hours, minutes, and seconds
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
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
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
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
                    hours = HOURS_LOWER_LIMIT;
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