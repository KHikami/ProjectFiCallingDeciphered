package p000;

import android.os.Build.VERSION;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import com.google.android.apps.hangouts.fragments.dialpad.DigitsEditText;

public final class deq implements TextWatcher {
    final /* synthetic */ DigitsEditText f9566a;

    public deq(DigitsEditText digitsEditText) {
        this.f9566a = digitsEditText;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        if (VERSION.SDK_INT >= 21) {
            gwb.m1786a((Spannable) editable);
        }
    }
}
