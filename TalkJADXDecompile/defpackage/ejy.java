package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.telephony.SmsMessage;
import com.google.android.apps.hangouts.phone.ClassZeroActivity;

/* renamed from: ejy */
public final class ejy implements OnClickListener {
    final /* synthetic */ ClassZeroActivity a;

    public ejy(ClassZeroActivity classZeroActivity) {
        this.a = classZeroActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ClassZeroActivity classZeroActivity = this.a;
        if (classZeroActivity.d.size() > 0) {
            classZeroActivity.d.remove(0);
        }
        if (classZeroActivity.d.size() == 0) {
            classZeroActivity.finish();
        } else {
            classZeroActivity.a((SmsMessage) classZeroActivity.d.get(0));
        }
    }
}
