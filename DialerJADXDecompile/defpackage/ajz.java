package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.telecom.PhoneAccountHandle;

/* compiled from: PG */
/* renamed from: ajz */
final class ajz implements OnClickListener {
    private /* synthetic */ ajy a;

    ajz(ajy ajy) {
        this.a = ajy;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b = true;
        PhoneAccountHandle phoneAccountHandle = (PhoneAccountHandle) this.a.a.get(i);
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_selected_account_handle", phoneAccountHandle);
        bundle.putBoolean("extra_set_default", this.a.c);
        if (this.a.e != null) {
            this.a.e.onReceiveResult(1, bundle);
        }
    }
}
