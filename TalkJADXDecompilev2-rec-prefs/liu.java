package p000;

import java.util.UUID;

abstract class liu implements ljo {
    final UUID f25063a;
    private final ljo f25064b;
    private final String f25065c;

    liu(String str, UUID uuid) {
        this.f25065c = str;
        this.f25064b = null;
        this.f25063a = uuid;
    }

    liu(String str, ljo ljo) {
        this.f25065c = str;
        this.f25064b = ljo;
        this.f25063a = ljo.mo3714b();
    }

    public final ljo mo3713a() {
        return this.f25064b;
    }

    public final UUID mo3714b() {
        return this.f25063a;
    }

    public final String mo3715c() {
        return this.f25065c;
    }

    public final String toString() {
        return lkb.m29212c(this);
    }
}
