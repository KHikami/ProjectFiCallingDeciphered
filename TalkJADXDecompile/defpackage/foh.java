package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* renamed from: foh */
public final class foh {
    private static final boolean a;

    static {
        kae kae = glk.p;
        a = false;
    }

    public static byte[] a(ead ead) {
        return foh.a((Serializable) ead);
    }

    public static byte[] a(evz evz) {
        return foh.a((Serializable) evz);
    }

    private static byte[] a(Serializable serializable) {
        String valueOf;
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            if (!a) {
                return toByteArray;
            }
            Serializable c = foh.c(toByteArray);
            valueOf = String.valueOf(serializable);
            String valueOf2 = String.valueOf(c);
            new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("encoded ").append(valueOf).append(" ==> ...;  testing decode... ").append(valueOf2);
            return toByteArray;
        } catch (Throwable e) {
            valueOf = String.valueOf(serializable);
            glk.d("Babel_RequestWriter", new StringBuilder(String.valueOf(valueOf).length() + 33).append("got exception serializing object ").append(valueOf).toString(), e);
            return null;
        }
    }

    public static ead a(byte[] bArr) {
        return (ead) foh.c(bArr);
    }

    public static evz b(byte[] bArr) {
        return (evz) foh.c(bArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.Serializable c(byte[] r3) {
        /*
        r0 = new java.io.ByteArrayInputStream;	 Catch:{ ClassNotFoundException -> 0x0011, IOException -> 0x001b }
        r0.<init>(r3);	 Catch:{ ClassNotFoundException -> 0x0011, IOException -> 0x001b }
        r1 = new java.io.ObjectInputStream;	 Catch:{ ClassNotFoundException -> 0x0011, IOException -> 0x001b }
        r1.<init>(r0);	 Catch:{ ClassNotFoundException -> 0x0011, IOException -> 0x001b }
        r0 = r1.readObject();	 Catch:{ ClassNotFoundException -> 0x0011, IOException -> 0x001b }
        r0 = (java.io.Serializable) r0;	 Catch:{ ClassNotFoundException -> 0x0011, IOException -> 0x001b }
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = move-exception;
    L_0x0012:
        r1 = "Babel_RequestWriter";
        r2 = "error decoding serialized stream";
        defpackage.glk.d(r1, r2, r0);
        r0 = 0;
        goto L_0x0010;
    L_0x001b:
        r0 = move-exception;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: foh.c(byte[]):java.io.Serializable");
    }
}
