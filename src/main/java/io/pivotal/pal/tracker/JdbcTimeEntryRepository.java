package io.pivotal.pal.tracker;

import javax.sql.DataSource;
import java.util.List;

public class JdbcTimeEntryRepository implements TimeEntryRepository {

    public JdbcTimeEntryRepository(DataSource dataSource) {
    }

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        return null;
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

    }
}
