package p000;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public abstract class np {
    private final DataSetObservable f30418a = new DataSetObservable();
    private DataSetObserver f30419b;

    public abstract int m35979a();

    public abstract boolean m35987a(View view, Object obj);

    public void m35984a(ViewGroup viewGroup) {
    }

    public Object m35981a(ViewGroup viewGroup, int i) {
        return m35980a((View) viewGroup, i);
    }

    public void m35985a(ViewGroup viewGroup, int i, Object obj) {
        m35983a((View) viewGroup, i, obj);
    }

    public void m35991b(ViewGroup viewGroup, int i, Object obj) {
        m35986a(obj);
    }

    public void m35990b(ViewGroup viewGroup) {
        m35989b();
    }

    @Deprecated
    public Object m35980a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void m35983a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    @Deprecated
    public void m35986a(Object obj) {
    }

    @Deprecated
    public void m35989b() {
    }

    public int m35988b(Object obj) {
        return -1;
    }

    public void m35993c() {
        synchronized (this) {
            if (this.f30419b != null) {
                this.f30419b.onChanged();
            }
        }
        this.f30418a.notifyChanged();
    }

    public void m35982a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f30419b = dataSetObserver;
        }
    }

    public CharSequence m35992c(int i) {
        return null;
    }
}
