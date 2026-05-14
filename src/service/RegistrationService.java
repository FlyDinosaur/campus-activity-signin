public class RegistrationService {
    public boolean register(String studentId, String activityName) {
        return studentId != null && !studentId.isEmpty() && activityName != null && !activityName.isEmpty();
    }
}