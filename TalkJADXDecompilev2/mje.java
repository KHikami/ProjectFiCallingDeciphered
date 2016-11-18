package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class mje<K, V> extends mit<K, V> {
    private static final long serialVersionUID = 0;
    transient int c = 2;

    public /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.a(obj);
    }

    public /* bridge */ /* synthetic */ Map b() {
        return super.b();
    }

    /* synthetic */ Collection c() {
        return a();
    }

    public /* bridge */ /* synthetic */ boolean c(Object obj) {
        return super.c(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int f() {
        return super.f();
    }

    public /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    public /* bridge */ /* synthetic */ Set k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public mje() {
        super(new HashMap());
    }

    Set<V> a() {
        return ba.c(this.c);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        gwb.a((mmc) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 2;
        int a = gwb.a(objectInputStream);
        a(mls.c());
        gwb.a((mmc) this, objectInputStream, a);
    }
}
