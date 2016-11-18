package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.telephony.SmsMessage;
import com.google.android.apps.hangouts.phone.ClassZeroActivity;

public final class ejy implements OnClickListener {
    final /* synthetic */ ClassZeroActivity f11675a;

    public ejy(ClassZeroActivity classZeroActivity) {
        this.f11675a = classZeroActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ClassZeroActivity classZeroActivity = this.f11675a;
        if (classZeroActivity.f6634d.size() > 0) {
            classZeroActivity.f6634d.remove(0);
        }
        if (classZeroActivity.f6634d.size() == 0) {
            classZeroActivity.finish();
        } else {
            classZeroActivity.m8886a((SmsMessage) classZeroActivity.f6634d.get(0));
        }
    }
}
