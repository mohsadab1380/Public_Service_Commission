package user_2411699_model_class;

import java.time.LocalDateTime;

public class AuditLogEntry {
    private final String actorRole, action;
    private final int actorId;
    private final LocalDateTime timestamp;

    public AuditLogEntry(String actorRole, int actorId, String action, LocalDateTime timestamp) {
        this.actorRole = actorRole;
        this.actorId = actorId;
        this.action = action;
        this.timestamp = timestamp;
    }

    public String getActorRole() {
        return actorRole;
    }

    public String getAction() {
        return action;
    }

    public int getActorId() {
        return actorId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "AuditLogEntry{" +
                "actorRole='" + actorRole + '\'' +
                ", action='" + action + '\'' +
                ", actorId=" + actorId +
                ", timestamp=" + timestamp +
                '}';
    }
}
