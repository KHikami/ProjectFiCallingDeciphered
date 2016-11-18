package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class ear {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final long g;
    public final List<ecj> h;
    public int i;
    public final boolean j;
    public final String k;
    public final int l;
    public final long m;

    public ear(String str, String str2, int i, String str3, long j, boolean z, int i2, String str4, int i3, long j2) {
        this.a = str;
        this.b = str2;
        this.e = i;
        this.c = this.e == 2;
        this.d = i2;
        this.f = str3;
        this.g = j;
        this.h = new ArrayList();
        this.i = 0;
        this.j = z;
        this.k = str4;
        this.l = i3;
        this.m = j2;
        if (ebz.d) {
            String str5 = this.a;
            String str6 = this.f;
            new StringBuilder((String.valueOf(str5).length() + 20) + String.valueOf(str6).length()).append("Conversation Line: ").append(str5).append(" ").append(str6);
        }
    }

    static String a(Cursor cursor, int i, int i2) {
        String string = cursor.getString(i);
        if (TextUtils.isEmpty(string)) {
            return cursor.getString(i2);
        }
        return string;
    }

    public fvd a() {
        if (this.h.size() > 0) {
            return ((ecj) this.h.get(0)).q;
        }
        return fvd.MESSAGE;
    }

    boolean b() {
        return this.l == 1;
    }
}
