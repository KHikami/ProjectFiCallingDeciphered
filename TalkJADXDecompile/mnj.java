import java.util.Iterator;
import java.util.List;

final class mnj<E> extends mjq<E> {
    final transient E a;

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    public /* synthetic */ List subList(int i, int i2) {
        return a(i, i2);
    }

    mnj(E e) {
        this.a = bm.a((Object) e);
    }

    public E get(int i) {
        bm.a(i, 1);
        return this.a;
    }

    public mny<E> a() {
        return mlj.a(this.a);
    }

    public int size() {
        return 1;
    }

    public mjq<E> a(int i, int i2) {
        bm.a(i, i2, 1);
        if (i == i2) {
            return mna.a;
        }
        return this;
    }

    public String toString() {
        String obj = this.a.toString();
        return new StringBuilder(obj.length() + 2).append('[').append(obj).append(']').toString();
    }

    boolean e() {
        return false;
    }
}
