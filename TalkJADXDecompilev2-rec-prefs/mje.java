package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class mje<K, V> extends mit<K, V> {
    private static final long serialVersionUID = 0;
    transient int f27819c = 2;

    public /* bridge */ /* synthetic */ Set mo3830a(Object obj) {
        return super.mo3830a(obj);
    }

    public /* bridge */ /* synthetic */ Map mo3777b() {
        return super.mo3777b();
    }

    /* synthetic */ Collection mo3785c() {
        return mo3829a();
    }

    public /* bridge */ /* synthetic */ boolean mo3781c(Object obj) {
        return super.mo3781c(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int mo3782f() {
        return super.mo3782f();
    }

    public /* bridge */ /* synthetic */ void mo3831g() {
        super.mo3831g();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean mo3778j() {
        return super.mo3778j();
    }

    public /* bridge */ /* synthetic */ Set mo3779k() {
        return super.mo3779k();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public mje() {
        super(new HashMap());
    }

    Set<V> mo3829a() {
        return ba.m4619c(this.f27819c);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        gwb.m1883a((mmc) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f27819c = 2;
        int a = gwb.m1506a(objectInputStream);
        m32172a(mls.m32489c());
        gwb.m1882a((mmc) this, objectInputStream, a);
    }
}
