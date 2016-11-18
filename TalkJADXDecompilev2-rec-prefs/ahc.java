package p000;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.HashMap;

public abstract class ahc extends ahd {
    public Context f704a;
    public Cursor f705b;
    public int f706c;
    public SparseIntArray f707d;
    public final HashMap<Object, Integer> f708e = new HashMap();

    public abstract dr mo191a(Cursor cursor, int i);

    public ahc(Context context, ed edVar, Cursor cursor) {
        int columnIndex;
        super(edVar);
        Object obj = cursor != null ? 1 : null;
        this.f705b = cursor;
        this.f704a = context;
        if (obj != null) {
            columnIndex = this.f705b.getColumnIndex("uri");
        } else {
            columnIndex = -1;
        }
        this.f706c = columnIndex;
    }

    public dr mo185a(int i) {
        if (this.f705b == null || !m1182b(i)) {
            return null;
        }
        return mo191a(this.f705b, i);
    }

    public int m1184a() {
        if (this.f705b != null) {
            return this.f705b.getCount();
        }
        return 0;
    }

    public Object mo186a(View view, int i) {
        if (this.f705b == null) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        Object valueOf;
        if (m1182b(i)) {
            valueOf = Integer.valueOf(this.f705b.getString(this.f706c).hashCode());
        } else {
            valueOf = null;
        }
        Object a = super.mo186a(view, i);
        if (a != null) {
            this.f708e.put(a, valueOf);
        }
        return a;
    }

    public void mo188a(View view, int i, Object obj) {
        this.f708e.remove(obj);
        super.mo188a(view, i, obj);
    }

    public int m1191b(Object obj) {
        Integer num = (Integer) this.f708e.get(obj);
        if (num == null || this.f707d == null) {
            return -2;
        }
        return this.f707d.get(num.intValue(), -2);
    }

    public Cursor m1192d() {
        return this.f705b;
    }

    public Cursor mo190a(Cursor cursor) {
        if (Log.isLoggable("BaseCursorPagerAdapter", 2)) {
            int i;
            int count = this.f705b == null ? -1 : this.f705b.getCount();
            if (cursor == null) {
                i = -1;
            } else {
                i = cursor.getCount();
            }
            new StringBuilder(43).append("swapCursor old=").append(count).append("; new=").append(i);
        }
        if (cursor == this.f705b) {
            return null;
        }
        Cursor cursor2 = this.f705b;
        this.f705b = cursor;
        if (cursor != null) {
            this.f706c = cursor.getColumnIndex("uri");
        } else {
            this.f706c = -1;
        }
        mo192e();
        c();
        return cursor2;
    }

    protected String mo187a(int i, int i2) {
        if (!m1182b(i2)) {
            return super.mo187a(i, i2);
        }
        return "android:pager:" + i + ":" + this.f705b.getString(this.f706c).hashCode();
    }

    private boolean m1182b(int i) {
        if (this.f705b == null || this.f705b.isClosed()) {
            return false;
        }
        return this.f705b.moveToPosition(i);
    }

    private void mo192e() {
        if (this.f705b == null || this.f705b.isClosed()) {
            this.f707d = null;
            return;
        }
        SparseIntArray sparseIntArray = new SparseIntArray(this.f705b.getCount());
        this.f705b.moveToPosition(-1);
        while (this.f705b.moveToNext()) {
            sparseIntArray.append(this.f705b.getString(this.f706c).hashCode(), this.f705b.getPosition());
        }
        this.f707d = sparseIntArray;
    }
}
