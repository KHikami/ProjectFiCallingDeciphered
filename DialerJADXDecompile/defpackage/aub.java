package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: aub */
public final class aub extends auf {
    public boolean a;

    public aub() {
        super();
    }

    public final /* bridge */ /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public final /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        CharSequence string;
        super.onCreateDialog(bundle);
        Builder title = buf.a(getActivity(), (DialogFragment) this).setTitle(getString(buf.ih, new Object[]{this.c}));
        if (this.a) {
            string = getString(buf.id, new Object[]{buf.o(getContext())});
        } else {
            string = getString(buf.ik);
        }
        Dialog create = title.setMessage(string).setPositiveButton(buf.ii, buf.a((DialogFragment) this, this.d)).create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
