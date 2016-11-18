package defpackage;

import java.security.MessageDigest;
import java.util.UUID;

final class axw implements anv {
    private final UUID b;

    public axw() {
        this(UUID.randomUUID());
    }

    private axw(UUID uuid) {
        this.b = uuid;
    }

    public boolean equals(Object obj) {
        if (obj instanceof axw) {
            return ((axw) obj).b.equals(this.b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
