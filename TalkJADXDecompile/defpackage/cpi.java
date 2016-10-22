package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* renamed from: cpi */
final class cpi implements gkf {
    private final cpd a;

    cpi(Context context) {
        this.a = (cpd) jyn.b(context, cpd.class);
    }

    public void a(SpannableStringBuilder spannableStringBuilder) {
        if (this.a != null) {
            this.a.a(spannableStringBuilder);
        }
    }
}
