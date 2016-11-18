package p000;

import android.text.Editable;
import android.text.TextWatcher;

final class eqw implements TextWatcher {
    final /* synthetic */ equ f12092a;

    eqw(equ equ) {
        this.f12092a = equ;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        this.f12092a.f12083b.setVisibility(8);
        this.f12092a.f12084c.setVisibility(0);
    }
}
