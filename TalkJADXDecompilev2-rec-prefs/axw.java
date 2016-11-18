package p000;

import java.security.MessageDigest;
import java.util.UUID;

final class axw implements anv {
    private final UUID f2523b;

    public axw() {
        this(UUID.randomUUID());
    }

    private axw(UUID uuid) {
        this.f2523b = uuid;
    }

    public boolean equals(Object obj) {
        if (obj instanceof axw) {
            return ((axw) obj).f2523b.equals(this.f2523b);
        }
        return false;
    }

    public int hashCode() {
        return this.f2523b.hashCode();
    }

    public void mo308a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
