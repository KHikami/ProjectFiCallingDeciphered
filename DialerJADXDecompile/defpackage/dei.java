package defpackage;

/* compiled from: PG */
/* renamed from: dei */
public final class dei {
    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof dei)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = null;
        return ((35557 + obj.hashCode()) * 31) * 31;
    }

    protected final void a(Object obj, def def) {
        try {
            def.c(0);
            throw new IllegalArgumentException("Unknown type 0");
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    protected final int a(Object obj) {
        throw new IllegalArgumentException("Unknown type 0");
    }
}
