package p000;

import java.util.Arrays;
import java.util.IllegalFormatException;

public abstract class mon {
    private final mop f28018a;

    public abstract String mo3909a(String str, Object obj);

    public mon(mop mop) {
        this.f28018a = (mop) ba.m4538a((Object) mop, "error strategy");
    }

    public final String m32634b(String str, Object obj) {
        try {
            return mo3909a(str, obj);
        } catch (IllegalFormatException e) {
            if (this.f28018a != mop.INLINE) {
                throw new mod(moe.f27978d, null, e);
            }
            String valueOf = String.valueOf(e.getClass().getSimpleName());
            String valueOf2 = String.valueOf(e.getMessage());
            return new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()).append("[").append(valueOf).append(": ").append(valueOf2).append("]").toString();
        }
    }

    protected String m32629a(Object obj) {
        if (!obj.getClass().isArray()) {
            return String.valueOf(obj);
        }
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.toString((long[]) obj);
        }
        if (obj instanceof byte[]) {
            return Arrays.toString((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return Arrays.toString((char[]) obj);
        }
        if (obj instanceof short[]) {
            return Arrays.toString((short[]) obj);
        }
        if (obj instanceof float[]) {
            return Arrays.toString((float[]) obj);
        }
        if (obj instanceof double[]) {
            return Arrays.toString((double[]) obj);
        }
        if (obj instanceof boolean[]) {
            return Arrays.toString((boolean[]) obj);
        }
        return Arrays.toString((Object[]) obj);
    }

    public final String m32633b(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return m32629a(obj);
        } catch (RuntimeException e) {
            String runtimeException;
            try {
                runtimeException = e.toString();
            } catch (RuntimeException e2) {
                runtimeException = e2.getClass().getSimpleName();
            }
            String valueOf = String.valueOf(obj.getClass().getName());
            return new StringBuilder((String.valueOf(valueOf).length() + 16) + String.valueOf(runtimeException).length()).append("{").append(valueOf).append("@").append(System.identityHashCode(obj)).append(": ").append(runtimeException).append("}").toString();
        }
    }

    public mps<Object> m32631a(mpz mpz) {
        if (this.f28018a != mop.INLINE) {
            throw new mod(moe.f27976b, mpz, null);
        }
        return mon.m32628a(null, "[MISSING: index=" + mpz.f28058b + "]");
    }

    public mps<Object> m32632a(mpz mpz, Object obj) {
        if (this.f28018a != mop.INLINE) {
            throw new mod(moe.f27975a, mpz, obj);
        }
        StringBuilder append = new StringBuilder("[INVALID: index=").append(mpz.f28058b).append(", format=").append(mpz.mo3911a());
        if (obj != null) {
            append.append(", type=").append(obj.getClass().getName()).append(", value=").append(m32633b(obj)).append("]");
        } else {
            append.append(", value=null]");
        }
        return mon.m32628a(obj, append.toString());
    }

    private static mps<Object> m32628a(Object obj, String str) {
        return new moo(obj, str);
    }
}
