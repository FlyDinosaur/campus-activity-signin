public class SignInService {
    public String signIn(String studentId, String activityName) {
         if (studentId == null || studentId.isEmpty()) {
             return "签到失败：学⽣信息为空";
        }
        return "签到成功：" + studentId + " 已参加 " + activityName;
    }
}