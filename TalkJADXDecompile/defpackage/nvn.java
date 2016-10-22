package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import nvm;
import nvo;
import nvp;
import nvq;
import nvr;
import nvs;
import nvu;
import nvv;
import nvw;
import nwv;

/* renamed from: nvn */
public abstract class nvn implements Serializable, Iterable<Byte> {
    public static final nvn a;
    private static final nvq c;
    int b;

    public abstract byte a(int i);

    protected abstract int a(int i, int i2, int i3);

    public abstract nvn a(int i, int i2);

    abstract void a(nvm nvm);

    protected abstract void a(byte[] bArr, int i, int i2, int i3);

    public abstract int b();

    public abstract nvw c();

    public abstract boolean equals(Object obj);

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    static {
        nvq nvv;
        a = new nvu(nwv.c);
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
        c = nvv;
    }

    nvn() {
        this.b = 0;
    }

    public final nvr a() {
        return new nvr(this);
    }

    public static nvn a(byte[] bArr, int i, int i2) {
        return new nvu(c.a(bArr, i, i2));
    }

    static nvn a(byte[] bArr) {
        return new nvu(bArr);
    }

    static nvn b(byte[] bArr, int i, int i2) {
        return new nvp(bArr, i, i2);
    }

    public static nvn a(String str) {
        return new nvu(str.getBytes(nwv.a));
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            i = b();
            i = a(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.b = i;
        }
        return i;
    }

    static nvs b(int i) {
        return new nvs(i);
    }

    static int b(int i, int i2, int i3) {
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
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b())});
    }
}
