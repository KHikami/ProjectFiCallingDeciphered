package p000;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class czs implements TextWatcher {
    final /* synthetic */ CallContactPickerFragment f9390a;

    public czs(CallContactPickerFragment callContactPickerFragment) {
        this.f9390a = callContactPickerFragment;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f9390a.f6244a.m11278a(charSequence);
        if (charSequence.length() != 0) {
            return;
        }
        if (this.f9390a.f6248e == 0) {
            this.f9390a.m8467a(0);
        } else {
            this.f9390a.m8467a(2);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        gwb.m1786a((Spannable) editable);
    }
}
