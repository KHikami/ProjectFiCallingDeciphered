import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

public class mjw<K, V> extends mkp<K, V> implements mmc<K, V> {
    private static final long serialVersionUID = 0;

    public /* synthetic */ Collection b(Object obj) {
        return a(obj);
    }

    public /* synthetic */ mjk d(Object obj) {
        return a(obj);
    }

    mjw(mjx<K, mjq<V>> mjx_K__mjq_V, int i) {
        super(mjx_K__mjq_V, i);
    }

    public mjq<V> a(K k) {
        mjq<V> mjq_V = (mjq) this.b.get(k);
        if (mjq_V == null) {
            return mna.a;
        }
        return mjq_V;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        gwb.a((mmc) this, objectOutputStream);
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
                mjs.c(objectInputStream.readObject());
            }
            mjz.a(readObject, mjs.a());
            i += readInt2;
        }
        try {
            mkr.a.a((Object) this, mjz.a());
            mkr.b.a((Object) this, i);
        } catch (Throwable e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
