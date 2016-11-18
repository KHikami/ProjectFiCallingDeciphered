package defpackage;

import java.security.MessageDigest;
import java.util.Map;

final class aqi implements anv {
    private final Object b;
    private final int c;
    private final int d;
    private final Class<?> e;
    private final Class<?> f;
    private final anv g;
    private final Map<Class<?>, aoc<?>> h;
    private final anz i;
    private int j;

    public aqi(Object obj, anv anv, int i, int i2, Map<Class<?>, aoc<?>> map, Class<?> cls, Class<?> cls2, anz anz) {
        this.b = gwb.I(obj);
        this.g = (anv) gwb.a((Object) anv, "Signature must not be null");
        this.c = i;
        this.d = i2;
        this.h = (Map) gwb.I((Object) map);
        this.e = (Class) gwb.a((Object) cls, "Resource class must not be null");
        this.f = (Class) gwb.a((Object) cls2, "Transcode class must not be null");
        this.i = (anz) gwb.I((Object) anz);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aqi)) {
            return false;
        }
        aqi aqi = (aqi) obj;
        if (this.b.equals(aqi.b) && this.g.equals(aqi.g) && this.d == aqi.d && this.c == aqi.c && this.h.equals(aqi.h) && this.e.equals(aqi.e) && this.f.equals(aqi.f) && this.i.equals(aqi.i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.j == 0) {
            this.j = this.b.hashCode();
            this.j = (this.j * 31) + this.g.hashCode();
            this.j = (this.j * 31) + this.c;
            this.j = (this.j * 31) + this.d;
            this.j = (this.j * 31) + this.h.hashCode();
            this.j = (this.j * 31) + this.e.hashCode();
            this.j = (this.j * 31) + this.f.hashCode();
            this.j = (this.j * 31) + this.i.hashCode();
        }
        return this.j;
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        int i3 = this.j;
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        return new StringBuilder((((((String.valueOf(valueOf).length() + 151) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append("EngineKey{model=").append(valueOf).append(", width=").append(i).append(", height=").append(i2).append(", resourceClass=").append(valueOf2).append(", transcodeClass=").append(valueOf3).append(", signature=").append(valueOf4).append(", hashCode=").append(i3).append(", transformations=").append(valueOf5).append(", options=").append(valueOf6).append("}").toString();
    }

    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
