import java.util.Comparator;

public class EmergencyPriorityComparator implements Comparator<Emergency> {

    @Override
    public int compare(Emergency e1, Emergency e2) {

        // Higher severity first
        int severityCompare = e2.getSeverity().ordinal() - e1.getSeverity().ordinal();
        if (severityCompare != 0) {
            return severityCompare;
        }

        // If severity same → earlier reported first
        return e1.getReportedAt().compareTo(e2.getReportedAt());
    }
}