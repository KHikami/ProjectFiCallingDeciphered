import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.util.SparseIntArray;

/* compiled from: PG */
abstract class ank extends ys {
    private ContentObserver c;
    private DataSetObserver d;
    private Cursor e;
    private SparseIntArray f;
    private int g;

    protected abstract void a(Cursor cursor);

    protected abstract void b();

    protected abstract void b(Cursor cursor);

    public ank(Context context) {
        this.c = new anl(this, new Handler());
        this.d = new anm(this);
        c();
    }

    public void d(Cursor cursor) {
        a(cursor, false);
    }

    public void c(Cursor cursor) {
        a(cursor, true);
    }

    public void a(Cursor cursor, boolean z) {
        if (cursor != this.e) {
            if (this.e != null) {
                this.e.unregisterContentObserver(this.c);
                this.e.unregisterDataSetObserver(this.d);
                this.e.close();
            }
            c();
            this.e = cursor;
            if (cursor != null) {
                if (z) {
                    b(this.e);
                } else {
                    a(this.e);
                }
                this.g = this.f.size();
                cursor.registerContentObserver(this.c);
                cursor.registerDataSetObserver(this.d);
                this.a.b();
            }
        }
    }

    public void a(int i, int i2) {
        int size = this.f.size() - 1;
        if (size < 0 || i <= this.f.keyAt(size)) {
            this.f.put(i, i2);
        } else {
            this.f.append(i, i2);
        }
    }

    public int a() {
        return this.g;
    }

    public int e(int i) {
        if (i < 0 || i >= this.f.size()) {
            return 0;
        }
        return this.f.valueAt(i);
    }

    public Object d(int i) {
        if (this.e == null || i < 0 || i >= this.f.size()) {
            return null;
        }
        if (this.e.moveToPosition(this.f.keyAt(i))) {
            return this.e;
        }
        return null;
    }

    private final void c() {
        this.g = 0;
        this.f = new SparseIntArray();
    }
}
