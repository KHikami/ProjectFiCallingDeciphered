package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.telecom.PhoneAccountHandle;

/* compiled from: PG */
/* renamed from: akd */
public class akd extends ResultReceiver {
    public akd() {
        super(new Handler());
    }

    protected void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            a((PhoneAccountHandle) bundle.getParcelable("extra_selected_account_handle"), bundle.getBoolean("extra_set_default"));
        } else if (i == 2) {
            a();
        }
    }

    public void a(PhoneAccountHandle phoneAccountHandle, boolean z) {
    }

    public void a() {
    }
}
