import java.time.LocalDateTime;

public class Emergency {

    private final String id;
    private final EmergencyType type;
    private final Severity severity;
    private final Location location;
    private final LocalDateTime reportedAt;

    public Emergency(String id, EmergencyType type, Severity severity, Location location) {
        this.id = id;
        this.type = type;
        this.severity = severity;
        this.location = location;
        this.reportedAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public EmergencyType getType() {
        return type;
    }

    public Severity getSeverity() {
        return severity;
    }

    public Location getLocation() {
        return location;
    }

    public LocalDateTime getReportedAt() {
        return reportedAt;
    }

    @Override
    public String toString() {
        return "Emergency{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", severity=" + severity +
                ", location=" + location.getName() +
                ", reportedAt=" + reportedAt +
                '}';
    }
}