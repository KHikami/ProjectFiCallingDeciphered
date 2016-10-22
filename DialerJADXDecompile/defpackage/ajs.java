package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.android.contacts.common.vcard.SelectAccountActivity;

/* compiled from: PG */
/* renamed from: ajs */
public final class ajs implements OnCancelListener, OnClickListener {
    private /* synthetic */ SelectAccountActivity a;

    public ajs(SelectAccountActivity selectAccountActivity) {
        this.a = selectAccountActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
