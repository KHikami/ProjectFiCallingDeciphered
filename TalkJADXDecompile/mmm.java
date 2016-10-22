import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class mmm<K, V> extends mib<K, V> {
    private static final long serialVersionUID = 0;
    transient iyr c;

    protected /* synthetic */ Collection c() {
        return a();
    }

    public mmm(Map<K, Collection<V>> map, iyr iyr) {
        super(map);
        this.c = (iyr) bm.a((Object) iyr);
    }

    protected List<V> a() {
        return (List) this.c.a();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(e());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (iyr) objectInputStream.readObject();
        a((Map) objectInputStream.readObject());
    }
}
