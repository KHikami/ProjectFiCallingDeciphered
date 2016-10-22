package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* compiled from: PG */
/* renamed from: aye */
final class aye implements OnCancelListener {
    private /* synthetic */ ayc a;

    aye(ayc ayc) {
        this.a = ayc;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.c();
        ayj.c();
    }
}
