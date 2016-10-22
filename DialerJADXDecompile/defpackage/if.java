package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: if */
final class if implements Iterator, Entry {
    private int a;
    private int b;
    private boolean c;
    private /* synthetic */ ib d;

    if(ib ibVar) {
        this.d = ibVar;
        this.c = false;
        this.a = ibVar.a() - 1;
        this.b = -1;
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final void remove() {
        if (this.c) {
            this.d.a(this.b);
            this.b--;
            this.a--;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object getKey() {
        if (this.c) {
            return this.d.a(this.b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.c) {
            return this.d.a(this.b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.a(this.b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Entry)) {
            return false;
        } else {
            Entry entry = (Entry) obj;
            if (hx.a(entry.getKey(), this.d.a(this.b, 0)) && hx.a(entry.getValue(), this.d.a(this.b, 1))) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int i = 0;
        if (this.c) {
            Object a = this.d.a(this.b, 0);
            Object a2 = this.d.a(this.b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }

    public final /* synthetic */ Object next() {
        this.b++;
        this.c = true;
        return this;
    }
}
