package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.HashMap;

public abstract class ahc extends ahd {
    public Context a;
    public Cursor b;
    public int c;
    public SparseIntArray d;
    public final HashMap<Object, Integer> e = new HashMap();

    public abstract dr a(Cursor cursor, int i);

    public ahc(Context context, ed edVar, Cursor cursor) {
        int columnIndex;
        super(edVar);
        Object obj = cursor != null ? 1 : null;
        this.b = cursor;
        this.a = context;
        if (obj != null) {
            columnIndex = this.b.getColumnIndex("uri");
        } else {
            columnIndex = -1;
        }
        this.c = columnIndex;
    }

    public dr a(int i) {
        if (this.b == null || !b(i)) {
            return null;
        }
        return a(this.b, i);
    }

    public int a() {
        if (this.b != null) {
            return this.b.getCount();
        }
        return 0;
    }

    public Object a(View view, int i) {
        if (this.b == null) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        Object valueOf;
        if (b(i)) {
            valueOf = Integer.valueOf(this.b.getString(this.c).hashCode());
        } else {
            valueOf = null;
        }
        Object a = super.a(view, i);
        if (a != null) {
            this.e.put(a, valueOf);
        }
        return a;
    }

    public void a(View view, int i, Object obj) {
        this.e.remove(obj);
        super.a(view, i, obj);
    }

    public int b(Object obj) {
        Integer num = (Integer) this.e.get(obj);
        if (num == null || this.d == null) {
            return -2;
        }
        return this.d.get(num.intValue(), -2);
    }

    public Cursor d() {
        return this.b;
    }

    public Cursor a(Cursor cursor) {
        if (Log.isLoggable("BaseCursorPagerAdapter", 2)) {
            int i;
            int count = this.b == null ? -1 : this.b.getCount();
            if (cursor == null) {
                i = -1;
            } else {
                i = cursor.getCount();
            }
            new StringBuilder(43).append("swapCursor old=").append(count).append("; new=").append(i);
        }
        if (cursor == this.b) {
            return null;
        }
        Cursor cursor2 = this.b;
        this.b = cursor;
        if (cursor != null) {
            this.c = cursor.getColumnIndex("uri");
        } else {
            this.c = -1;
        }
        e();
        c();
        return cursor2;
    }

    protected String a(int i, int i2) {
        if (!b(i2)) {
            return super.a(i, i2);
        }
        return "android:pager:" + i + ":" + this.b.getString(this.c).hashCode();
    }

    private boolean b(int i) {
        if (this.b == null || this.b.isClosed()) {
            return false;
        }
        return this.b.moveToPosition(i);
    }

    private void e() {
        if (this.b == null || this.b.isClosed()) {
            this.d = null;
            return;
        }
        SparseIntArray sparseIntArray = new SparseIntArray(this.b.getCount());
        this.b.moveToPosition(-1);
        while (this.b.moveToNext()) {
            sparseIntArray.append(this.b.getString(this.c).hashCode(), this.b.getPosition());
        }
        this.d = sparseIntArray;
    }
}
