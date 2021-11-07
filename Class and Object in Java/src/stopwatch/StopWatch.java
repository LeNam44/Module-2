package stopwatch;

import java.sql.Time;
import java.sql.Timestamp;

public class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long endTime;

    public long start() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long stop() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public long getElapsedTime() {
            return this.endTime - this.startTime;
    }
}
