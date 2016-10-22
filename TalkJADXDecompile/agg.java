import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class agg extends BaseAdapter {
    public final bko a;
    private final Context b;
    private ArrayList<agh> c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;

    public agg(Context context) {
        this(context, (byte) 0);
    }

    private agg(Context context, byte b) {
        this.d = 0;
        this.e = true;
        this.f = true;
        this.b = context;
        this.c = new ArrayList();
    }

    public void a(agh agh) {
        this.c.add(agh);
        a();
        notifyDataSetChanged();
    }

    public agh a(int i) {
        return (agh) this.c.get(i);
    }

    protected void a() {
        this.e = false;
    }

    public int b() {
        return this.c.size();
    }

    protected void c() {
        if (!this.e) {
            this.d = 0;
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                agh agh = (agh) arrayList.get(i);
                Cursor cursor = agh.c;
                if (cursor == null || cursor.isClosed()) {
                    i = 0;
                } else {
                    i = cursor.getCount();
                }
                if (agh.b && (i != 0 || agh.a)) {
                    i++;
                }
                agh.e = i;
                this.d += i;
                i = i2;
            }
            this.e = true;
        }
    }

    public int getCount() {
        c();
        return this.d;
    }

    public Cursor b(int i) {
        return ((agh) this.c.get(i)).c;
    }

    public void a(int i, Cursor cursor) {
        Cursor cursor2 = ((agh) this.c.get(i)).c;
        if (cursor2 != cursor) {
            if (!(cursor2 == null || cursor2.isClosed())) {
                cursor2.close();
            }
            ((agh) this.c.get(i)).c = cursor;
            if (!(cursor == null || cursor.isClosed())) {
                ((agh) this.c.get(i)).d = cursor.getColumnIndex("_id");
            }
            a();
            notifyDataSetChanged();
        }
    }

    public int getViewTypeCount() {
        return 2;
    }

    public int getItemViewType(int i) {
        c();
        int size = this.c.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i3 + ((agh) this.c.get(i2)).e;
            if (i < i3 || i >= i4) {
                i2++;
                i3 = i4;
            } else {
                int i5;
                i3 = i - i3;
                if (((agh) this.c.get(i2)).b) {
                    i5 = i3 - 1;
                } else {
                    i5 = i3;
                }
                if (i5 == -1) {
                    return -1;
                }
                return 1;
            }
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 0;
        c();
        int size = this.c.size();
        int i3 = 0;
        while (i2 < size) {
            int i4 = ((agh) this.c.get(i2)).e + i3;
            if (i < i3 || i >= i4) {
                i2++;
                i3 = i4;
            } else {
                View a;
                size = i - i3;
                if (((agh) this.c.get(i2)).b) {
                    size--;
                }
                if (size == -1) {
                    a = a(i2, ((agh) this.c.get(i2)).c, view, viewGroup);
                } else if (((agh) this.c.get(i2)).c.moveToPosition(size)) {
                    a = a(i2, ((agh) this.c.get(i2)).c, size, view, viewGroup);
                } else {
                    throw new IllegalStateException("Couldn't move cursor to position " + size);
                }
                if (a != null) {
                    return a;
                }
                throw new NullPointerException("View should not be null, partition: " + i2 + " position: " + size);
            }
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    protected View a(int i, Cursor cursor, View view, ViewGroup viewGroup) {
        if (view != null) {
            return view;
        }
        return null;
    }

    protected View a(int i, Cursor cursor, int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = a(this.b);
        }
        a(view, i, cursor);
        return view;
    }

    public Object getItem(int i) {
        c();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            agh agh = (agh) obj;
            int i4 = agh.e + i3;
            if (i < i3 || i >= i4) {
                i3 = i4;
            } else {
                int i5 = i - i3;
                if (agh.b) {
                    i2 = i5 - 1;
                } else {
                    i2 = i5;
                }
                if (i2 == -1) {
                    return null;
                }
                Object obj2 = agh.c;
                if (obj2 == null || obj2.isClosed() || !obj2.moveToPosition(i2)) {
                    return null;
                }
                return obj2;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        c();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            agh agh = (agh) obj;
            int i4 = agh.e + i3;
            if (i < i3 || i >= i4) {
                i3 = i4;
            } else {
                int i5 = i - i3;
                if (agh.b) {
                    i5--;
                }
                if (i5 == -1) {
                    return 0;
                }
                if (agh.d == -1) {
                    return 0;
                }
                Cursor cursor = agh.c;
                if (cursor == null || cursor.isClosed() || !cursor.moveToPosition(i5)) {
                    return 0;
                }
                return cursor.getLong(agh.d);
            }
        }
        return 0;
    }

    public boolean areAllItemsEnabled() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((agh) obj).b) {
                return false;
            }
        }
        return true;
    }

    public boolean isEnabled(int i) {
        c();
        int size = this.c.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i3 + ((agh) this.c.get(i2)).e;
            if (i < i3 || i >= i4) {
                i2++;
                i3 = i4;
            } else {
                i3 = i - i3;
                if (((agh) this.c.get(i2)).b && i3 == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public void notifyDataSetChanged() {
        if (this.f) {
            this.g = false;
            super.notifyDataSetChanged();
            return;
        }
        this.g = true;
    }

    public View a(Context context) {
        return new gnj(context, this.a);
    }

    public void a(View view, int i, Cursor cursor) {
        gnj gnj = (gnj) view;
        dab dab = (dab) cursor;
        if (dab != null) {
            hwk a = dab.a();
            dac c = dab.c();
            int e = dab.e();
            int d = dab.d();
            CharSequence a2 = a(i).a();
            int i2 = 15;
            if (d == 1) {
                i2 = a(15, 8);
            }
            gnj.a(a2 == null ? null : a2.toString());
            if (a != null) {
                int i3;
                if (dab.f()) {
                    i3 = i2;
                } else {
                    i3 = a(i2, 3);
                }
                a(gnj, a, c, d, i3);
                return;
            }
            dak b = dab.b();
            switch (e) {
                case wi.w /*0*/:
                    int i4;
                    String string;
                    if (d == 1) {
                        glk.e("Babel", "Local contacts not returning AggregatedPerson!", new Object[0]);
                    }
                    String str = null;
                    if (d == 2) {
                        i4 = i2;
                        string = dab.getString(0);
                    } else {
                        String a3 = ((dap) b.f().get(0)).a(gwb.H());
                        str = dab.getString(2);
                        i4 = i2 | 16;
                        string = a3;
                    }
                    gnj.a(str, string, null, null, null, e, d, b, c, i4);
                default:
                    glk.e("Babel", "CallContactsAdapter is given an unsupported contact type!", new Object[0]);
            }
        }
    }

    public agg(Context context, bko bko) {
        this(context);
        this.a = bko;
    }

    public static int a(int i, int i2) {
        return (i2 ^ -1) & i;
    }

    public static void a(gnj gnj, hwk hwk, dac dac, int i, int i2) {
        String valueOf;
        String a;
        String b = dac == null ? null : dac.b();
        CharSequence e = hwk.e();
        if (!hwk.f() || TextUtils.isEmpty(e)) {
            Long l = (Long) hwk.b().iterator().next();
            valueOf = String.valueOf(l);
            a = frm.a(l);
        } else {
            a = hwk.h();
            valueOf = null;
        }
        String a2 = hwk.a();
        if (TextUtils.isEmpty(a2)) {
            a2 = dak.b(hwk);
        }
        gnj.a(valueOf, a2, null, a, a, 0, i, dak.a(gwb.H(), hwk, b), dac, i2);
    }

    public void a(czo czo) {
        int b = b();
        for (int i = 0; i < b; i++) {
            Cursor b2 = b(i);
            if (b2 != null) {
                ((dab) b2).a(czo);
            }
        }
    }
}
