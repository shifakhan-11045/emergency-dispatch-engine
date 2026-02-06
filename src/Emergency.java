import java.time.LocalDateTime;

public class Emergency {
    private final String id;
    private final String description;
    private final String location;
    private int severity; // initial severity, will compute later
    private final LocalDateTime reportedAt;

    public Emergency(String id, String description, String location, int severity) {
        this.id = id;
        this.description = description;
        this.location = location;
        this.severity = severity;
        this.reportedAt = LocalDateTime.now();
    }

    // Getters
    public String getId() { return id; }
    public String getDescription() { return description; }
    public String getLocation() { return location; }
    public int getSeverity() { return severity; }
    public LocalDateTime getReportedAt() { return reportedAt; }

    // Setter for severity
    public void setSeverity(int severity) { this.severity = severity; }

    @Override
    public String toString() {
        return "Emergency{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", severity=" + severity +
                ", reportedAt=" + reportedAt +
                '}';
    }
}
