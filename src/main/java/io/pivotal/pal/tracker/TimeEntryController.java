package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

import java.util.List;

public class TimeEntryController {

    private TimeEntryRepository timeEntriesRepo;

    public TimeEntryController(TimeEntryRepository timeEntriesRepo) {
        this.timeEntriesRepo = timeEntriesRepo;
    }

    public ResponseEntity create(TimeEntry timeEntry) {
        return null;
    }

    public ResponseEntity<TimeEntry> read(Long id) {
        return null;
    }

    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }

    public ResponseEntity update(Long id, TimeEntry timeEntry) {
        return null;
    }

    public ResponseEntity delete(Long id) {
        return null;
    }
}
