package p000;

import android.content.Context;
import java.util.Locale;

public final class jxx {
    public final String f21268a;
    public final String f21269b;
    public final int f21270c;
    public final int f21271d;
    public final int f21272e;

    public jxx(String str, String str2, int i, int i2, int i3) {
        this.f21268a = str;
        this.f21269b = str2;
        this.f21270c = i;
        this.f21271d = i2;
        this.f21272e = i3;
    }

    public String toString() {
        return String.format(Locale.US, "DatabaseUpgradeFailureEvent: partitionName=%s, oldVersion=%d, newVersion=%d, failureVersion=%d", new Object[]{this.f21269b, Integer.valueOf(this.f21270c), Integer.valueOf(this.f21271d), Integer.valueOf(this.f21272e)});
    }

    public void m25400a(Context context) {
        jyn.m25426a(context, jfn.class);
    }
}
