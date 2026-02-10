import java.util.Comparator;

public class EmergencyPriorityComparator implements Comparator<Emergency> {

    @Override
    public int compare(Emergency e1, Emergency e2) {
        int severityCompare = e2.getSeverity().compareTo(e1.getSeverity());
        if (severityCompare != 0) {
            return severityCompare;
        }
        return e1.getReportedAt().compareTo(e2.getReportedAt());
    }
}
