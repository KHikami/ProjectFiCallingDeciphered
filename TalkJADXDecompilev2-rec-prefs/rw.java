package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class rw extends BaseAdapter implements Filterable, sa {
    public boolean f35083a;
    public boolean f35084b;
    public Cursor f35085c;
    public Context f35086d;
    public int f35087e;
    public rx f35088f;
    public DataSetObserver f35089g;
    public rz f35090h;
    public FilterQueryProvider f35091i;

    public abstract View m40578a(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void m40581a(View view, Cursor cursor);

    @Deprecated
    public rw(Context context, Cursor cursor) {
        m40579a(context, cursor, 1);
    }

    public rw(Context context, Cursor cursor, int i) {
        m40579a(context, cursor, 0);
    }

    void m40579a(Context context, Cursor cursor, int i) {
        boolean z = true;
        if ((i & 1) == 1) {
            i |= 2;
            this.f35084b = true;
        } else {
            this.f35084b = false;
        }
        if (cursor == null) {
            z = false;
        }
        this.f35085c = cursor;
        this.f35083a = z;
        this.f35086d = context;
        this.f35087e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f35088f = new rx(this);
            this.f35089g = new ry(this);
        } else {
            this.f35088f = null;
            this.f35089g = null;
        }
        if (z) {
            if (this.f35088f != null) {
                cursor.registerContentObserver(this.f35088f);
            }
            if (this.f35089g != null) {
                cursor.registerDataSetObserver(this.f35089g);
            }
        }
    }

    public Cursor mo4349a() {
        return this.f35085c;
    }

    public int getCount() {
        if (!this.f35083a || this.f35085c == null) {
            return 0;
        }
        return this.f35085c.getCount();
    }

    public Object getItem(int i) {
        if (!this.f35083a || this.f35085c == null) {
            return null;
        }
        this.f35085c.moveToPosition(i);
        return this.f35085c;
    }

    public long getItemId(int i) {
        if (this.f35083a && this.f35085c != null && this.f35085c.moveToPosition(i)) {
            return this.f35085c.getLong(this.f35087e);
        }
        return 0;
    }

    public boolean hasStableIds() {
        return true;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f35083a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f35085c.moveToPosition(i)) {
            if (view == null) {
                view = m40578a(this.f35086d, this.f35085c, viewGroup);
            }
            m40581a(view, this.f35085c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f35083a) {
            return null;
        }
        this.f35085c.moveToPosition(i);
        if (view == null) {
            view = m40583b(this.f35086d, this.f35085c, viewGroup);
        }
        m40581a(view, this.f35085c);
        return view;
    }

    public View m40583b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return m40578a(context, cursor, viewGroup);
    }

    public void mo4351a(Cursor cursor) {
        Cursor b = m40582b(cursor);
        if (b != null) {
            b.close();
        }
    }

    public Cursor m40582b(Cursor cursor) {
        if (cursor == this.f35085c) {
            return null;
        }
        Cursor cursor2 = this.f35085c;
        if (cursor2 != null) {
            if (this.f35088f != null) {
                cursor2.unregisterContentObserver(this.f35088f);
            }
            if (this.f35089g != null) {
                cursor2.unregisterDataSetObserver(this.f35089g);
            }
        }
        this.f35085c = cursor;
        if (cursor != null) {
            if (this.f35088f != null) {
                cursor.registerContentObserver(this.f35088f);
            }
            if (this.f35089g != null) {
                cursor.registerDataSetObserver(this.f35089g);
            }
            this.f35087e = cursor.getColumnIndexOrThrow("_id");
            this.f35083a = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.f35087e = -1;
        this.f35083a = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    public CharSequence mo4352c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor mo4350a(CharSequence charSequence) {
        if (this.f35091i != null) {
            return this.f35091i.runQuery(charSequence);
        }
        return this.f35085c;
    }

    public Filter getFilter() {
        if (this.f35090h == null) {
            this.f35090h = new rz(this);
        }
        return this.f35090h;
    }

    protected void m40584b() {
        if (this.f35084b && this.f35085c != null && !this.f35085c.isClosed()) {
            this.f35083a = this.f35085c.requery();
        }
    }
}
