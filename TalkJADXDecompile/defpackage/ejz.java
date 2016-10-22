package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.telephony.SmsMessage;
import com.google.android.apps.hangouts.phone.ClassZeroActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: ejz */
public final class ejz implements OnClickListener {
    final /* synthetic */ ClassZeroActivity a;

    public ejz(ClassZeroActivity classZeroActivity) {
        this.a = classZeroActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.b = true;
        ClassZeroActivity classZeroActivity = this.a;
        RealTimeChatService.a(classZeroActivity.e, classZeroActivity.a.getPdu(), classZeroActivity.b);
        dialogInterface.dismiss();
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
