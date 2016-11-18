package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

final class egt implements TextWatcher {
    final /* synthetic */ egr a;

    egt(egr egr) {
        this.a = egr;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        this.a.b.b(editable.toString());
    }
}
