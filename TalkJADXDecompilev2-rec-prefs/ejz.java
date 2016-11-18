package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.telephony.SmsMessage;
import com.google.android.apps.hangouts.phone.ClassZeroActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ejz implements OnClickListener {
    final /* synthetic */ ClassZeroActivity f11676a;

    public ejz(ClassZeroActivity classZeroActivity) {
        this.f11676a = classZeroActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f11676a.f6632b = true;
        ClassZeroActivity classZeroActivity = this.f11676a;
        RealTimeChatService.m9032a(classZeroActivity.f6635e, classZeroActivity.f6631a.getPdu(), classZeroActivity.f6632b);
        dialogInterface.dismiss();
        ClassZeroActivity classZeroActivity2 = this.f11676a;
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
