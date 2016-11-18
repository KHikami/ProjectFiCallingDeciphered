package p000;

import android.os.Handler;
import android.os.Message;
import android.telephony.SmsMessage;
import com.google.android.apps.hangouts.phone.ClassZeroActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class eka extends Handler {
    private ClassZeroActivity f11678a;

    public eka(ClassZeroActivity classZeroActivity) {
        this.f11678a = classZeroActivity;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            this.f11678a.f6632b = false;
            this.f11678a.f6633c.dismiss();
            ClassZeroActivity classZeroActivity = this.f11678a;
            RealTimeChatService.m9032a(classZeroActivity.f6635e, classZeroActivity.f6631a.getPdu(), classZeroActivity.f6632b);
            ClassZeroActivity classZeroActivity2 = this.f11678a;
            if (classZeroActivity2.f6634d.size() > 0) {
                classZeroActivity2.f6634d.remove(0);
            }
            if (classZeroActivity2.f6634d.size() == 0) {
                classZeroActivity2.finish();
            } else {
                classZeroActivity2.m8886a((SmsMessage) classZeroActivity2.f6634d.get(0));
            }
        }
    }
}
