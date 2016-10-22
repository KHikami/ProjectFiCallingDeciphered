package defpackage;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
/* renamed from: aua */
public final class aua implements OnClickListener {
    private /* synthetic */ DialogFragment a;
    private /* synthetic */ aug b;

    public aua(DialogFragment dialogFragment, aug aug) {
        this.a = dialogFragment;
        this.b = aug;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
        this.b.a();
    }
}
