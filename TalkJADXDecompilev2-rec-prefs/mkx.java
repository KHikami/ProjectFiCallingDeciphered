package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;

public class mkx<K, V> extends mkp<K, V> implements mmc<K, V> {
    private static final long serialVersionUID = 0;
    private final transient mks<V> f27867a;

    public /* synthetic */ Collection mo3780b(Object obj) {
        return m32408a(obj);
    }

    public /* synthetic */ mjk mo3828d(Object obj) {
        return m32408a(obj);
    }

    public mks<V> m32408a(K k) {
        return (mks) gwb.m2248i((mks) this.b.get(k), this.f27867a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(m32411e());
        gwb.m1883a((mmc) this, objectOutputStream);
    }

    Comparator<? super V> m32411e() {
        if (this.f27867a instanceof mlf) {
            return ((mlf) this.f27867a).comparator();
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
                mkt.mo3879c(objectInputStream.readObject());
            }
            mks a = mkt.mo3877a();
            if (a.size() != readInt2) {
                String valueOf = String.valueOf(readObject);
                throw new InvalidObjectException(new StringBuilder(String.valueOf(valueOf).length() + 40).append("Duplicate key-value pairs exist for key ").append(valueOf).toString());
            }
            mjz.mo3837a(readObject, a);
            i++;
            i2 += readInt2;
        }
        try {
            Object obj;
            mkr.f27862a.m32567a((Object) this, mjz.mo3836a());
            mkr.f27863b.m32566a((Object) this, i2);
            mng mng = mkr.f27864c;
            if (comparator == null) {
                obj = mnc.f27935a;
            } else {
                obj = mlf.m32263a(comparator);
            }
            mng.m32567a((Object) this, obj);
        } catch (Throwable e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
