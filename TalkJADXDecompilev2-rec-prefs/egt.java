package p000;

import android.text.Editable;
import android.text.TextWatcher;

final class egt implements TextWatcher {
    final /* synthetic */ egr f11465a;

    egt(egr egr) {
        this.f11465a = egr;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        this.f11465a.f11457b.m4869b(editable.toString());
    }
}
