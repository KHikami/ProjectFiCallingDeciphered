package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: aoq */
public final class aoq extends DialogFragment {
    private int a;
    private int b;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getInt("argTitleResId");
        this.b = getArguments().getInt("argMessageResId");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Builder builder = new Builder(getActivity());
        if (this.a != 0) {
            builder.setTitle(this.a);
        }
        if (this.b != 0) {
            builder.setMessage(this.b);
        }
        builder.setPositiveButton(17039370, new aor(this));
        return builder.create();
    }

    public static aoq a(int i) {
        aoq aoq = new aoq();
        Bundle bundle = new Bundle();
        bundle.putInt("argTitleResId", 0);
        bundle.putInt("argMessageResId", i);
        aoq.setArguments(bundle);
        return aoq;
    }
}
