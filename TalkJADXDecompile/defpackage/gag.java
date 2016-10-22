package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: gag */
public final class gag {
    long a;
    String b;
    String c;
    String d;
    gan e;
    boolean f;
    private Context g;

    gag(Context context) {
        this.a = TimeUnit.SECONDS.toMillis(3);
        this.g = context;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public gan d() {
        return this.e;
    }

    public long e() {
        if (this.g == null || !gld.a(this.g)) {
            return this.a;
        }
        return this.a * 10;
    }

    public boolean f() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gag)) {
            return false;
        }
        gag gag = (gag) obj;
        if (this.a == gag.a && TextUtils.equals(this.b, gag.b) && TextUtils.equals(this.c, gag.c) && TextUtils.equals(this.d, gag.d) && this.f == gag.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        int hashCode2 = ((this.b != null ? this.b.hashCode() : 0) + 2573) * 31;
        if (this.c != null) {
            hashCode = this.c.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.d != null) {
            hashCode = this.d.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.e != null) {
            hashCode = this.e.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (((hashCode + hashCode2) * 31) + ((int) (this.a ^ (this.a >>> 32)))) * 31;
        if (this.f) {
            i = 1;
        }
        return hashCode + i;
    }
}
