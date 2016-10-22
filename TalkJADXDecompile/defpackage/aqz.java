package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: aqz */
final class aqz implements arn {
    private final arb a;
    private final arg<ara, Bitmap> b;

    aqz() {
        this.a = new arb();
        this.b = new arg();
    }

    public void a(Bitmap bitmap) {
        this.b.a(this.a.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public Bitmap a(int i, int i2, Config config) {
        return (Bitmap) this.b.a(this.a.a(i, i2, config));
    }

    public Bitmap a() {
        return (Bitmap) this.b.a();
    }

    public String b(int i, int i2, Config config) {
        return aqz.c(i, i2, config);
    }

    public int c(Bitmap bitmap) {
        return baq.a(bitmap);
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 21).append("AttributeStrategy:\n  ").append(valueOf).toString();
    }

    static String c(int i, int i2, Config config) {
        String valueOf = String.valueOf(config);
        return new StringBuilder(String.valueOf(valueOf).length() + 27).append("[").append(i).append("x").append(i2).append("], ").append(valueOf).toString();
    }

    public String b(Bitmap bitmap) {
        return aqz.c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }
}
