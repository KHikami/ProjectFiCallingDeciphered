package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: cz */
abstract class cz extends cy {
    boolean a;

    cz() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(this.a || i == -1)) {
            cx.b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            cx.b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
