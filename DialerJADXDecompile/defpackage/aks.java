package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.android.dialer.app.DialtactsActivity;

/* compiled from: PG */
/* renamed from: aks */
public final class aks implements TextWatcher {
    private /* synthetic */ DialtactsActivity a;

    public aks(DialtactsActivity dialtactsActivity) {
        this.a = dialtactsActivity;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CharSequence charSequence2 = charSequence.toString();
        if (!charSequence2.equals(this.a.q)) {
            this.a.q = charSequence2;
            if (!TextUtils.isEmpty(charSequence2)) {
                boolean z = (this.a.o && this.a.m) || (!this.a.o && this.a.n);
                if (!z) {
                    this.a.a(this.a.o, this.a.q, true);
                }
            }
            if (this.a.j != null && this.a.j.isVisible()) {
                this.a.j.a(this.a.q);
            } else if (this.a.i != null && this.a.i.isVisible()) {
                this.a.i.a(this.a.q);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }
}
