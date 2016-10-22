package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.regex.Matcher;

/* renamed from: ehv */
final class ehv implements TextWatcher {
    final /* synthetic */ eht a;

    ehv(eht eht) {
        this.a = eht;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        Context context = this.a.context;
        if ((cpq.b || cpq.c) && charSequence != null) {
            Matcher matcher = cpq.a.matcher(charSequence);
            if (matcher.matches()) {
                String group = matcher.group(1);
                for (cpp cpp : jyn.c(context, cpp.class)) {
                    if (cpp.a(group)) {
                        cpp.a(context);
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
            this.a.b.setText("");
            this.a.a.a("");
            return;
        }
        if (this.a.a == null) {
            this.a.a = (bck) this.a.binder.a(bck.class);
        }
        this.a.a.a(charSequence.toString());
    }

    public void afterTextChanged(Editable editable) {
    }
}
