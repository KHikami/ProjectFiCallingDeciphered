package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.widget.EditText;

/* compiled from: PG */
/* renamed from: ale */
public final class ale implements OnCancelListener {
    public ProgressDialog a;
    public int b;
    private int c;
    private ald d;
    private EditText e;

    public ale(int i, ald ald, int i2) {
        this.b = i;
        this.d = ald;
        this.c = -1;
    }

    public final synchronized EditText a() {
        return this.e;
    }

    public final synchronized void a(EditText editText) {
        this.e = editText;
    }

    public final synchronized void onCancel(DialogInterface dialogInterface) {
        if (this.a != null) {
            this.a.dismiss();
        }
        this.e = null;
        this.d.cancelOperation(this.c);
    }
}
