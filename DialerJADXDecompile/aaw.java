import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
public abstract class aaw extends BaseAdapter {
    public final Context a;
    public ArrayList b;
    public boolean c;
    private int d;
    private boolean e;

    public abstract View a(Context context, int i, Cursor cursor, int i2, ViewGroup viewGroup);

    public abstract void a(View view, int i, Cursor cursor, int i2);

    public aaw(Context context) {
        this(context, (byte) 0);
    }

    private aaw(Context context, byte b) {
        this.d = 0;
        this.c = true;
        this.e = true;
        this.a = context;
        this.b = new ArrayList();
    }

    public final void a(aax aax) {
        this.b.add(aax);
        this.c = false;
        notifyDataSetChanged();
    }

    public final void a(int i) {
        Cursor cursor = ((aax) this.b.get(i)).c;
        if (!(cursor == null || cursor.isClosed())) {
            cursor.close();
        }
        this.b.remove(i);
        this.c = false;
        notifyDataSetChanged();
    }

    public void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((aax) it.next()).c = null;
        }
        this.c = false;
        notifyDataSetChanged();
    }

    public final void a(int i, boolean z) {
        ((aax) this.b.get(i)).b = z;
        this.c = false;
    }

    public final aax b(int i) {
        return (aax) this.b.get(i);
    }

    public final void b() {
        if (!this.c) {
            this.d = 0;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                int i;
                aax aax = (aax) it.next();
                Cursor cursor = aax.c;
                if (cursor == null || cursor.isClosed()) {
                    i = 0;
                } else {
                    i = cursor.getCount();
                }
                if (aax.b && (i != 0 || aax.a)) {
                    i++;
                }
                aax.e = i;
                this.d += i;
            }
            this.c = true;
        }
    }

    public final boolean c(int i) {
        return ((aax) this.b.get(i)).b;
    }

    public int getCount() {
        b();
        return this.d;
    }

    public final Cursor d(int i) {
        return ((aax) this.b.get(i)).c;
    }

    public void a(int i, Cursor cursor) {
        Cursor cursor2 = ((aax) this.b.get(i)).c;
        if (cursor2 != cursor) {
            if (!(cursor2 == null || cursor2.isClosed())) {
                cursor2.close();
            }
            ((aax) this.b.get(i)).c = cursor;
            if (!(cursor == null || cursor.isClosed())) {
                ((aax) this.b.get(i)).d = cursor.getColumnIndex("_id");
            }
            this.c = false;
            notifyDataSetChanged();
        }
    }

    public final boolean e(int i) {
        Cursor cursor = ((aax) this.b.get(i)).c;
        return cursor == null || cursor.isClosed() || cursor.getCount() == 0;
    }

    public final int f(int i) {
        int i2 = 0;
        b();
        int size = this.b.size();
        int i3 = 0;
        while (i2 < size) {
            int i4 = ((aax) this.b.get(i2)).e + i3;
            if (i >= i3 && i < i4) {
                return i2;
            }
            i2++;
            i3 = i4;
        }
        return -1;
    }

    public final int g(int i) {
        b();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += ((aax) this.b.get(i3)).e;
        }
        return i2;
    }

    public int getViewTypeCount() {
        return 2;
    }

    public int a(int i, int i2) {
        return 1;
    }

    public int getItemViewType(int i) {
        b();
        int size = this.b.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i3 + ((aax) this.b.get(i2)).e;
            if (i < i3 || i >= i4) {
                i2++;
                i3 = i4;
            } else {
                int i5;
                i3 = i - i3;
                if (((aax) this.b.get(i2)).b) {
                    i5 = i3 - 1;
                } else {
                    i5 = i3;
                }
                if (i5 == -1) {
                    return -1;
                }
                return a(i2, i5);
            }
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 0;
        b();
        int size = this.b.size();
        int i3 = 0;
        while (i2 < size) {
            int i4 = ((aax) this.b.get(i2)).e + i3;
            if (i < i3 || i >= i4) {
                i2++;
                i3 = i4;
            } else {
                int i5 = i - i3;
                if (((aax) this.b.get(i2)).b) {
                    i5--;
                }
                if (i5 == -1) {
                    Cursor cursor = ((aax) this.b.get(i2)).c;
                    if (view == null) {
                        view = a(this.a, viewGroup);
                    }
                    a(view, i2);
                } else if (((aax) this.b.get(i2)).c.moveToPosition(i5)) {
                    Cursor cursor2 = ((aax) this.b.get(i2)).c;
                    if (view == null) {
                        view = a(this.a, i2, cursor2, i5, viewGroup);
                    }
                    a(view, i2, cursor2, i5);
                } else {
                    throw new IllegalStateException("Couldn't move cursor to position " + i5);
                }
                if (view != null) {
                    return view;
                }
                throw new NullPointerException("View should not be null, partition: " + i2 + " position: " + i5);
            }
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public View a(Context context, ViewGroup viewGroup) {
        return null;
    }

    public void a(View view, int i) {
    }

    public Object getItem(int i) {
        b();
        Iterator it = this.b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            aax aax = (aax) it.next();
            int i3 = aax.e + i2;
            if (i < i2 || i >= i3) {
                i2 = i3;
            } else {
                i2 = i - i2;
                if (aax.b) {
                    i2--;
                }
                if (i2 == -1) {
                    return null;
                }
                Object obj = aax.c;
                if (obj == null || obj.isClosed() || !obj.moveToPosition(i2)) {
                    return null;
                }
                return obj;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        b();
        Iterator it = this.b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            aax aax = (aax) it.next();
            int i3 = aax.e + i2;
            if (i < i2 || i >= i3) {
                i2 = i3;
            } else {
                i2 = i - i2;
                if (aax.b) {
                    i2--;
                }
                if (i2 == -1) {
                    return 0;
                }
                if (aax.d == -1) {
                    return 0;
                }
                Cursor cursor = aax.c;
                if (cursor == null || cursor.isClosed() || !cursor.moveToPosition(i2)) {
                    return 0;
                }
                return cursor.getLong(aax.d);
            }
        }
        return 0;
    }

    public boolean areAllItemsEnabled() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((aax) it.next()).b) {
                return false;
            }
        }
        return true;
    }

    public boolean isEnabled(int i) {
        b();
        int size = this.b.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i3 + ((aax) this.b.get(i2)).e;
            if (i < i3 || i >= i4) {
                i2++;
                i3 = i4;
            } else {
                i3 = i - i3;
                if (((aax) this.b.get(i2)).b && i3 == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public void notifyDataSetChanged() {
        if (this.e) {
            super.notifyDataSetChanged();
        }
    }
}
