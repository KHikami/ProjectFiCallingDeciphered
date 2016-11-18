package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

final class nxz {
    static final Unsafe a = nxz.a();
    static final boolean b = nxz.c();
    static final boolean c = nxz.b();
    static final long d;
    private static final long e;

    static {
        int arrayBaseOffset;
        long j;
        if (c) {
            arrayBaseOffset = a.arrayBaseOffset(byte[].class);
        } else {
            arrayBaseOffset = -1;
        }
        d = (long) arrayBaseOffset;
        Field a = nxz.a(Buffer.class, "address");
        if (a == null || a == null) {
            j = -1;
        } else {
            j = a.objectFieldOffset(a);
        }
        e = j;
    }

    static byte a(byte[] bArr, long j) {
        return a.getByte(bArr, j);
    }

    static void a(byte[] bArr, long j, byte b) {
        a.putByte(bArr, j, b);
    }

    private static Unsafe a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new nya());
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean b() {
        if (a != null) {
            try {
                Class cls = a.getClass();
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

    private static boolean c() {
        if (a != null) {
            try {
                Class cls = a.getClass();
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

    private static Field a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }
}
