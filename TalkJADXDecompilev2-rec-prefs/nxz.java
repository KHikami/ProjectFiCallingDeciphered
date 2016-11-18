package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

final class nxz {
    static final Unsafe f31232a = nxz.m37054a();
    static final boolean f31233b = nxz.m37057c();
    static final boolean f31234c = nxz.m37056b();
    static final long f31235d;
    private static final long f31236e;

    static {
        int arrayBaseOffset;
        long j;
        if (f31234c) {
            arrayBaseOffset = f31232a.arrayBaseOffset(byte[].class);
        } else {
            arrayBaseOffset = -1;
        }
        f31235d = (long) arrayBaseOffset;
        Field a = nxz.m37053a(Buffer.class, "address");
        if (a == null || f31232a == null) {
            j = -1;
        } else {
            j = f31232a.objectFieldOffset(a);
        }
        f31236e = j;
    }

    static byte m37052a(byte[] bArr, long j) {
        return f31232a.getByte(bArr, j);
    }

    static void m37055a(byte[] bArr, long j, byte b) {
        f31232a.putByte(bArr, j, b);
    }

    private static Unsafe m37054a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new nya());
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean m37056b() {
        if (f31232a != null) {
            try {
                Class cls = f31232a.getClass();
                cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable th) {
            }
        }
        return false;
    }

    private static boolean m37057c() {
        if (f31232a != null) {
            try {
                Class cls = f31232a.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("getByte", new Class[]{Long.TYPE});
                cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
                cls.getMethod("getLong", new Class[]{Long.TYPE});
                cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable th) {
            }
        }
        return false;
    }

    private static Field m37053a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }
}
