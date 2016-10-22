package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.android.contacts.common.vcard.CancelActivity;

/* compiled from: PG */
/* renamed from: aja */
public final class aja implements OnCancelListener, OnClickListener {
    private /* synthetic */ CancelActivity a;

    public aja(CancelActivity cancelActivity) {
        this.a = cancelActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
