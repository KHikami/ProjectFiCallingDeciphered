package defpackage;

import android.os.Parcel;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import v;

/* renamed from: gqd */
public class gqd implements kd {
    private final String a;
    private final int b;
    private final int c;
    private final Object d;
    private final int e;

    public boolean a(SpannableString spannableString) {
        return TextUtils.equals(this.a, spannableString) && spannableString.getSpans(this.b, this.c, this.d.getClass()).length == 0;
    }

    public void b(SpannableString spannableString) {
        spannableString.setSpan(this.d, this.b, this.c, this.e);
    }

    public boolean a() {
        return this.d instanceof ClickableSpan;
    }

    public static v b(Parcel parcel, ClassLoader classLoader) {
        return new v(parcel, classLoader);
    }

    public static v[] b(int i) {
        return new v[i];
    }

    public /* synthetic */ Object[] a(int i) {
        return gqd.b(i);
    }

    public /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
        return gqd.b(parcel, null);
    }
}
