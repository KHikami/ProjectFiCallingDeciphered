package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public abstract class np {
    private final DataSetObservable a = new DataSetObservable();
    private DataSetObserver b;

    public abstract int a();

    public abstract boolean a(View view, Object obj);

    public void a(ViewGroup viewGroup) {
    }

    public Object a(ViewGroup viewGroup, int i) {
        return a((View) viewGroup, i);
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        a((View) viewGroup, i, obj);
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        a(obj);
    }

    public void b(ViewGroup viewGroup) {
        b();
    }

    @Deprecated
    public Object a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    @Deprecated
    public void a(Object obj) {
    }

    @Deprecated
    public void b() {
    }

    public int b(Object obj) {
        return -1;
    }

    public void c() {
        synchronized (this) {
            if (this.b != null) {
                this.b.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public void a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public CharSequence c(int i) {
        return null;
    }
}
