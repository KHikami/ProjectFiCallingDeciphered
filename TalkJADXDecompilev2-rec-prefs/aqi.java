package p000;

import java.security.MessageDigest;
import java.util.Map;

final class aqi implements anv {
    private final Object f2128b;
    private final int f2129c;
    private final int f2130d;
    private final Class<?> f2131e;
    private final Class<?> f2132f;
    private final anv f2133g;
    private final Map<Class<?>, aoc<?>> f2134h;
    private final anz f2135i;
    private int f2136j;

    public aqi(Object obj, anv anv, int i, int i2, Map<Class<?>, aoc<?>> map, Class<?> cls, Class<?> cls2, anz anz) {
        this.f2128b = gwb.m1404I(obj);
        this.f2133g = (anv) gwb.m1637a((Object) anv, "Signature must not be null");
        this.f2129c = i;
        this.f2130d = i2;
        this.f2134h = (Map) gwb.m1404I((Object) map);
        this.f2131e = (Class) gwb.m1637a((Object) cls, "Resource class must not be null");
        this.f2132f = (Class) gwb.m1637a((Object) cls2, "Transcode class must not be null");
        this.f2135i = (anz) gwb.m1404I((Object) anz);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aqi)) {
            return false;
        }
        aqi aqi = (aqi) obj;
        if (this.f2128b.equals(aqi.f2128b) && this.f2133g.equals(aqi.f2133g) && this.f2130d == aqi.f2130d && this.f2129c == aqi.f2129c && this.f2134h.equals(aqi.f2134h) && this.f2131e.equals(aqi.f2131e) && this.f2132f.equals(aqi.f2132f) && this.f2135i.equals(aqi.f2135i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f2136j == 0) {
            this.f2136j = this.f2128b.hashCode();
            this.f2136j = (this.f2136j * 31) + this.f2133g.hashCode();
            this.f2136j = (this.f2136j * 31) + this.f2129c;
            this.f2136j = (this.f2136j * 31) + this.f2130d;
            this.f2136j = (this.f2136j * 31) + this.f2134h.hashCode();
            this.f2136j = (this.f2136j * 31) + this.f2131e.hashCode();
            this.f2136j = (this.f2136j * 31) + this.f2132f.hashCode();
            this.f2136j = (this.f2136j * 31) + this.f2135i.hashCode();
        }
        return this.f2136j;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2128b);
        int i = this.f2129c;
        int i2 = this.f2130d;
        String valueOf2 = String.valueOf(this.f2131e);
        String valueOf3 = String.valueOf(this.f2132f);
        String valueOf4 = String.valueOf(this.f2133g);
        int i3 = this.f2136j;
        String valueOf5 = String.valueOf(this.f2134h);
        String valueOf6 = String.valueOf(this.f2135i);
        return new StringBuilder((((((String.valueOf(valueOf).length() + 151) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append("EngineKey{model=").append(valueOf).append(", width=").append(i).append(", height=").append(i2).append(", resourceClass=").append(valueOf2).append(", transcodeClass=").append(valueOf3).append(", signature=").append(valueOf4).append(", hashCode=").append(i3).append(", transformations=").append(valueOf5).append(", options=").append(valueOf6).append("}").toString();
    }

    public void mo308a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
