package p000;

import android.os.Parcel;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;

public class gqd implements kd {
    private final String f15897a;
    private final int f15898b;
    private final int f15899c;
    private final Object f15900d;
    private final int f15901e;

    public boolean m18297a(SpannableString spannableString) {
        return TextUtils.equals(this.f15897a, spannableString) && spannableString.getSpans(this.f15898b, this.f15899c, this.f15900d.getClass()).length == 0;
    }

    public void m18299b(SpannableString spannableString) {
        spannableString.setSpan(this.f15900d, this.f15898b, this.f15899c, this.f15901e);
    }

    public boolean m18296a() {
        return this.f15900d instanceof ClickableSpan;
    }

    public static v m18293b(Parcel parcel, ClassLoader classLoader) {
        return new v(parcel, classLoader);
    }

    public static v[] m18294b(int i) {
        return new v[i];
    }

    public /* synthetic */ Object[] mo108a(int i) {
        return gqd.m18294b(i);
    }

    public /* synthetic */ Object mo107a(Parcel parcel, ClassLoader classLoader) {
        return gqd.m18293b(parcel, null);
    }
}
