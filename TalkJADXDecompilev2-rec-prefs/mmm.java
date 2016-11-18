package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class mmm<K, V> extends mib<K, V> {
    private static final long serialVersionUID = 0;
    transient iyr f27909c;

    protected /* synthetic */ Collection mo3785c() {
        return mo3885a();
    }

    public mmm(Map<K, Collection<V>> map, iyr iyr) {
        super(map);
        this.f27909c = (iyr) bm.m6122a((Object) iyr);
    }

    protected List<V> mo3885a() {
        return (List) this.f27909c.mo3325a();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f27909c);
        objectOutputStream.writeObject(m32178e());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f27909c = (iyr) objectInputStream.readObject();
        m32172a((Map) objectInputStream.readObject());
    }
}
