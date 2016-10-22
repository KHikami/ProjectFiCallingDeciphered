package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* compiled from: PG */
/* renamed from: cx */
abstract class cx extends cw {
    cx() {
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            cx.b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    final void a_() {
        super.onBackPressed();
    }

    static void b(int i) {
        if ((-65536 & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }
}
