package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

final class aqz implements arn {
    private final arb f2192a = new arb();
    private final arg<ara, Bitmap> f2193b = new arg();

    aqz() {
    }

    public void mo351a(Bitmap bitmap) {
        this.f2193b.m3845a(this.f2192a.m3824a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public Bitmap mo350a(int i, int i2, Config config) {
        return (Bitmap) this.f2193b.m3844a(this.f2192a.m3824a(i, i2, config));
    }

    public Bitmap mo349a() {
        return (Bitmap) this.f2193b.m3843a();
    }

    public String mo352b(int i, int i2, Config config) {
        return aqz.m3799c(i, i2, config);
    }

    public int mo354c(Bitmap bitmap) {
        return baq.m4681a(bitmap);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2193b);
        return new StringBuilder(String.valueOf(valueOf).length() + 21).append("AttributeStrategy:\n  ").append(valueOf).toString();
    }

    static String m3799c(int i, int i2, Config config) {
        String valueOf = String.valueOf(config);
        return new StringBuilder(String.valueOf(valueOf).length() + 27).append("[").append(i).append("x").append(i2).append("], ").append(valueOf).toString();
    }

    public String mo353b(Bitmap bitmap) {
        return aqz.m3799c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }
}
