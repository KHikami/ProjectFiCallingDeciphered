package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

abstract class dp extends C0001do {
    boolean f630b;

    dp() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(this.f630b || i == -1)) {
            dn.m1083b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!(this.a || i == -1)) {
            dn.m1083b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
