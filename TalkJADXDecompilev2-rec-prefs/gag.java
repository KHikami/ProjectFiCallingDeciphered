package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public final class gag {
    long f14537a = TimeUnit.SECONDS.toMillis(3);
    String f14538b;
    String f14539c;
    String f14540d;
    gan f14541e;
    boolean f14542f;
    private Context f14543g;

    gag(Context context) {
        this.f14543g = context;
    }

    public String m16805a() {
        return this.f14538b;
    }

    public String m16806b() {
        return this.f14539c;
    }

    public String m16807c() {
        return this.f14540d;
    }

    public gan m16808d() {
        return this.f14541e;
    }

    public long m16809e() {
        if (this.f14543g == null || !gld.m17937a(this.f14543g)) {
            return this.f14537a;
        }
        return this.f14537a * 10;
    }

    public boolean m16810f() {
        return this.f14542f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gag)) {
            return false;
        }
        gag gag = (gag) obj;
        if (this.f14537a == gag.f14537a && TextUtils.equals(this.f14538b, gag.f14538b) && TextUtils.equals(this.f14539c, gag.f14539c) && TextUtils.equals(this.f14540d, gag.f14540d) && this.f14542f == gag.f14542f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        int hashCode2 = ((this.f14538b != null ? this.f14538b.hashCode() : 0) + 2573) * 31;
        if (this.f14539c != null) {
            hashCode = this.f14539c.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f14540d != null) {
            hashCode = this.f14540d.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f14541e != null) {
            hashCode = this.f14541e.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (((hashCode + hashCode2) * 31) + ((int) (this.f14537a ^ (this.f14537a >>> 32)))) * 31;
        if (this.f14542f) {
            i = 1;
        }
        return hashCode + i;
    }
}
