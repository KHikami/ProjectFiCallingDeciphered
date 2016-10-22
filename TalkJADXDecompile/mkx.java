import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;

public class mkx<K, V> extends mkp<K, V> implements mmc<K, V> {
    private static final long serialVersionUID = 0;
    private final transient mks<V> a;

    public /* synthetic */ Collection b(Object obj) {
        return a(obj);
    }

    public /* synthetic */ mjk d(Object obj) {
        return a(obj);
    }

    public mks<V> a(K k) {
        return (mks) gwb.i((mks) this.b.get(k), this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(e());
        gwb.a((mmc) this, objectOutputStream);
    }

    Comparator<? super V> e() {
        if (this.a instanceof mlf) {
            return ((mlf) this.a).comparator();
        }
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
        mjz mjz = new mjz();
        int i = 0;
        int i2 = 0;
        while (i < readInt) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException("Invalid value count " + readInt2);
            }
            mkt mkt;
            if (comparator == null) {
                mkt = new mkt();
            } else {
                mkt = new mlg(comparator);
            }
            for (int i3 = 0; i3 < readInt2; i3++) {
                mkt.c(objectInputStream.readObject());
            }
            mks a = mkt.a();
            if (a.size() != readInt2) {
                String valueOf = String.valueOf(readObject);
                throw new InvalidObjectException(new StringBuilder(String.valueOf(valueOf).length() + 40).append("Duplicate key-value pairs exist for key ").append(valueOf).toString());
            }
            mjz.a(readObject, a);
            i++;
            i2 += readInt2;
        }
        try {
            Object obj;
            mkr.a.a((Object) this, mjz.a());
            mkr.b.a((Object) this, i2);
            mng mng = mkr.c;
            if (comparator == null) {
                obj = mnc.a;
            } else {
                obj = mlf.a(comparator);
            }
            mng.a((Object) this, obj);
        } catch (Throwable e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
