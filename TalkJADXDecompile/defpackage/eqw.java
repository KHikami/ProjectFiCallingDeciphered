package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: eqw */
final class eqw implements TextWatcher {
    final /* synthetic */ equ a;

    eqw(equ equ) {
        this.a = equ;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        this.a.b.setVisibility(8);
        this.a.c.setVisibility(0);
    }
}
