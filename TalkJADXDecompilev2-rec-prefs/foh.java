package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public final class foh {
    private static final boolean f13565a = false;

    static {
        kae kae = glk.f15569p;
    }

    public static byte[] m15795a(ead ead) {
        return foh.m15797a((Serializable) ead);
    }

    public static byte[] m15796a(evz evz) {
        return foh.m15797a((Serializable) evz);
    }

    private static byte[] m15797a(Serializable serializable) {
        String valueOf;
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            if (!f13565a) {
                return toByteArray;
            }
            Serializable c = foh.m15799c(toByteArray);
            valueOf = String.valueOf(serializable);
            String valueOf2 = String.valueOf(c);
            new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("encoded ").append(valueOf).append(" ==> ...;  testing decode... ").append(valueOf2);
            return toByteArray;
        } catch (Throwable e) {
            valueOf = String.valueOf(serializable);
            glk.m17980d("Babel_RequestWriter", new StringBuilder(String.valueOf(valueOf).length() + 33).append("got exception serializing object ").append(valueOf).toString(), e);
            return null;
        }
    }

    public static ead m15794a(byte[] bArr) {
        return (ead) foh.m15799c(bArr);
    }

    public static evz m15798b(byte[] bArr) {
        return (evz) foh.m15799c(bArr);
    }

    private static Serializable m15799c(byte[] bArr) {
        Throwable e;
        try {
            return (Serializable) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
        } catch (ClassNotFoundException e2) {
            e = e2;
        } catch (IOException e3) {
            e = e3;
        }
        glk.m17980d("Babel_RequestWriter", "error decoding serialized stream", e);
        return null;
    }
}
