import android.os.Handler;
import android.os.Message;
import android.telephony.SmsMessage;
import com.google.android.apps.hangouts.phone.ClassZeroActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class eka extends Handler {
    private ClassZeroActivity a;

    public eka(ClassZeroActivity classZeroActivity) {
        this.a = classZeroActivity;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.b = false;
            this.a.c.dismiss();
            ClassZeroActivity classZeroActivity = this.a;
            RealTimeChatService.a(classZeroActivity.e, classZeroActivity.a.getPdu(), classZeroActivity.b);
            ClassZeroActivity classZeroActivity2 = this.a;
            if (classZeroActivity2.d.size() > 0) {
                classZeroActivity2.d.remove(0);
            }
            if (classZeroActivity2.d.size() == 0) {
                classZeroActivity2.finish();
            } else {
                classZeroActivity2.a((SmsMessage) classZeroActivity2.d.get(0));
            }
        }
    }
}
