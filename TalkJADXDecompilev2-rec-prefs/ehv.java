package p000;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.regex.Matcher;

final class ehv implements TextWatcher {
    final /* synthetic */ eht f11525a;

    ehv(eht eht) {
        this.f11525a = eht;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        Context context = this.f11525a.context;
        if ((cpq.f8799b || cpq.f8800c) && charSequence != null) {
            Matcher matcher = cpq.f8798a.matcher(charSequence);
            if (matcher.matches()) {
                String group = matcher.group(1);
                for (cpp cpp : jyn.m25438c(context, cpp.class)) {
                    if (cpp.mo1917a(group)) {
                        cpp.mo1916a(context);
                        i4 = 1;
                        break;
                    }
                }
            }
            i4 = 0;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            this.f11525a.f11520b.setText("");
            this.f11525a.f11519a.m4866a("");
            return;
        }
        if (this.f11525a.f11519a == null) {
            this.f11525a.f11519a = (bck) this.f11525a.binder.m25443a(bck.class);
        }
        this.f11525a.f11519a.m4866a(charSequence.toString());
    }

    public void afterTextChanged(Editable editable) {
    }
}
