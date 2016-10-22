import java.util.Arrays;
import java.util.IllegalFormatException;

public abstract class mon {
    private final mop a;

    public abstract String a(String str, Object obj);

    public mon(mop mop) {
        this.a = (mop) ba.a((Object) mop, "error strategy");
    }

    public final String b(String str, Object obj) {
        try {
            return a(str, obj);
        } catch (IllegalFormatException e) {
            if (this.a != mop.INLINE) {
                throw new mod(moe.d, null, e);
            }
            String valueOf = String.valueOf(e.getClass().getSimpleName());
            String valueOf2 = String.valueOf(e.getMessage());
            return new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()).append("[").append(valueOf).append(": ").append(valueOf2).append("]").toString();
        }
    }

    protected String a(Object obj) {
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

    public final String b(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return a(obj);
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

    public mps<Object> a(mpz mpz) {
        if (this.a != mop.INLINE) {
            throw new mod(moe.b, mpz, null);
        }
        return a(null, "[MISSING: index=" + mpz.b + "]");
    }

    public mps<Object> a(mpz mpz, Object obj) {
        if (this.a != mop.INLINE) {
            throw new mod(moe.a, mpz, obj);
        }
        StringBuilder append = new StringBuilder("[INVALID: index=").append(mpz.b).append(", format=").append(mpz.a());
        if (obj != null) {
            append.append(", type=").append(obj.getClass().getName()).append(", value=").append(b(obj)).append("]");
        } else {
            append.append(", value=null]");
        }
        return a(obj, append.toString());
    }

    private static mps<Object> a(Object obj, String str) {
        return new moo(obj, str);
    }
}
