package p000;

import java.io.Serializable;
import java.util.Iterator;

public abstract class nvn implements Serializable, Iterable<Byte> {
    public static final nvn f28705a = new nvu(nwv.c);
    private static final nvq f28706c;
    int f28707b = 0;

    public abstract byte m33389a(int i);

    protected abstract int m33390a(int i, int i2, int i3);

    public abstract nvn m33391a(int i, int i2);

    abstract void m33393a(nvm nvm);

    protected abstract void m33394a(byte[] bArr, int i, int i2, int i3);

    public abstract int m33395b();

    public abstract nvw m33396c();

    public abstract boolean equals(Object obj);

    public /* synthetic */ Iterator iterator() {
        return m33392a();
    }

    static {
        nvq nvv;
        Object obj = 1;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException e) {
            obj = null;
        }
        if (obj != null) {
            nvv = new nvv();
        } else {
            nvv = new nvo();
        }
        f28706c = nvv;
    }

    nvn() {
    }

    public final nvr m33392a() {
        return new nvr(this);
    }

    public static nvn m33385a(byte[] bArr, int i, int i2) {
        return new nvu(f28706c.a(bArr, i, i2));
    }

    static nvn m33384a(byte[] bArr) {
        return new nvu(bArr);
    }

    static nvn m33387b(byte[] bArr, int i, int i2) {
        return new nvp(bArr, i, i2);
    }

    public static nvn m33383a(String str) {
        return new nvu(str.getBytes(nwv.a));
    }

    public final int hashCode() {
        int i = this.f28707b;
        if (i == 0) {
            i = m33395b();
            i = m33390a(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.f28707b = i;
        }
        return i;
    }

    static nvs m33388b(int i) {
        return new nvs(i);
    }

    static int m33386b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((((i | i2) | i4) | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m33395b())});
    }
}
