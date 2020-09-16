package io.pivotal.pal.tracker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    private long currentId = 1L;
    private Map<Long, TimeEntry> timeEntries = new HashMap<>();

    public TimeEntry create(TimeEntry timeEntry) {
        Long id = currentId++;

        TimeEntry newTimeEntry = new TimeEntry(
            id,
            timeEntry.getProjectId(),
            timeEntry.getUserId(),
            timeEntry.getDate(),
            timeEntry.getHours()
        );

        timeEntries.put(id, newTimeEntry);

        return newTimeEntry;
    }

    @Override
    public TimeEntry find(Long id) {
        return null;
    }

    @Override
    public List<TimeEntry> list() {
        return null;
    }

    @Override
    public TimeEntry update(Long id, TimeEntry timeEntry) {
        return null;
    }

    @Override
    public void delete(Long id) {
        //
    }

    public TimeEntry find(long id) {
        return timeEntries.get(id);
    }
}
