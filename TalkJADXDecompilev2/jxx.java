package defpackage;

import android.content.Context;
import java.util.Locale;

public final class jxx {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public jxx(String str, String str2, int i, int i2, int i3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public String toString() {
        return String.format(Locale.US, "DatabaseUpgradeFailureEvent: partitionName=%s, oldVersion=%d, newVersion=%d, failureVersion=%d", new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public void a(Context context) {
        jyn.a(context, jfn.class);
    }
}
