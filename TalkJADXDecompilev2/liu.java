package defpackage;

import java.util.UUID;

abstract class liu implements ljo {
    final UUID a;
    private final ljo b;
    private final String c;

    liu(String str, UUID uuid) {
        this.c = str;
        this.b = null;
        this.a = uuid;
    }

    liu(String str, ljo ljo) {
        this.c = str;
        this.b = ljo;
        this.a = ljo.b();
    }

    public final ljo a() {
        return this.b;
    }

    public final UUID b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String toString() {
        return lkb.c(this);
    }
}
