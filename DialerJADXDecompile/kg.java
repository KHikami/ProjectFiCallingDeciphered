import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
public abstract class kg {
    public final DataSetObservable a;
    public DataSetObserver b;

    public abstract int a();

    public abstract boolean a(View view, Object obj);

    public kg() {
        this.a = new DataSetObservable();
    }

    public void a(ViewGroup viewGroup) {
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
    }

    public void b(ViewGroup viewGroup) {
    }

    public int a(Object obj) {
        return -1;
    }

    public final void a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public CharSequence c(int i) {
        return null;
    }

    public Object a(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }
}
