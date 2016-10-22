package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;

/* renamed from: ifs */
public class ifs implements ifl {
    gyv a;

    public ifs() {
        this.a = new gyv();
    }

    public ifl a(boolean z) {
        this.a.a(true);
        return this;
    }

    public ifl a(Bitmap bitmap) {
        this.a.a(null);
        return this;
    }

    public ifl a(String str) {
        this.a.a(str);
        return this;
    }

    public ifl a(String str, String str2) {
        this.a.a(str, str2);
        return this;
    }

    public ifl a(Bundle bundle) {
        this.a.a(bundle);
        return this;
    }

    public ifl b(String str) {
        this.a.b(str);
        return this;
    }

    public ifl c(String str) {
        this.a.c(str);
        return this;
    }

    public ifk a() {
        return new ifr(this.a.a());
    }
}
