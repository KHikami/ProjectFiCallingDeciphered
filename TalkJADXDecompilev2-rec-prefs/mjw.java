package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

public class mjw<K, V> extends mkp<K, V> implements mmc<K, V> {
    private static final long serialVersionUID = 0;

    public /* synthetic */ Collection mo3780b(Object obj) {
        return m32299a(obj);
    }

    public /* synthetic */ mjk mo3828d(Object obj) {
        return m32299a(obj);
    }

    mjw(mjx<K, mjq<V>> mjx_K__mjq_V, int i) {
        super(mjx_K__mjq_V, i);
    }

    public mjq<V> m32299a(K k) {
        mjq<V> mjq_V = (mjq) this.b.get(k);
        if (mjq_V == null) {
            return mna.f27928a;
        }
        return mjq_V;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        gwb.m1883a((mmc) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
        mjz mjz = new mjz();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException("Invalid value count " + readInt2);
            }
            mjs mjs = new mjs();
            for (int i3 = 0; i3 < readInt2; i3++) {
                mjs.m32366c(objectInputStream.readObject());
            }
            mjz.mo3837a(readObject, mjs.m32364a());
            i += readInt2;
        }
        try {
            mkr.f27862a.m32567a((Object) this, mjz.mo3836a());
            mkr.f27863b.m32566a((Object) this, i);
        } catch (Throwable e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
