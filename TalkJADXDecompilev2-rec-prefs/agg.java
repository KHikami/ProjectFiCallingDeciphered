package p000;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class agg extends BaseAdapter {
    public final bko f595a;
    private final Context f596b;
    private ArrayList<agh> f597c;
    private int f598d;
    private boolean f599e;
    private boolean f600f;
    private boolean f601g;

    public agg(Context context) {
        this(context, (byte) 0);
    }

    private agg(Context context, byte b) {
        this.f598d = 0;
        this.f599e = true;
        this.f600f = true;
        this.f596b = context;
        this.f597c = new ArrayList();
    }

    public void m1056a(agh agh) {
        this.f597c.add(agh);
        m1054a();
        notifyDataSetChanged();
    }

    public agh m1050a(int i) {
        return (agh) this.f597c.get(i);
    }

    protected void m1054a() {
        this.f599e = false;
    }

    public int m1059b() {
        return this.f597c.size();
    }

    protected void m1061c() {
        if (!this.f599e) {
            this.f598d = 0;
            ArrayList arrayList = this.f597c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                agh agh = (agh) arrayList.get(i);
                Cursor cursor = agh.f604c;
                if (cursor == null || cursor.isClosed()) {
                    i = 0;
                } else {
                    i = cursor.getCount();
                }
                if (agh.f603b && (i != 0 || agh.f602a)) {
                    i++;
                }
                agh.f606e = i;
                this.f598d += i;
                i = i2;
            }
            this.f599e = true;
        }
    }

    public int getCount() {
        m1061c();
        return this.f598d;
    }

    public Cursor m1060b(int i) {
        return ((agh) this.f597c.get(i)).f604c;
    }

    public void m1055a(int i, Cursor cursor) {
        Cursor cursor2 = ((agh) this.f597c.get(i)).f604c;
        if (cursor2 != cursor) {
            if (!(cursor2 == null || cursor2.isClosed())) {
                cursor2.close();
            }
            ((agh) this.f597c.get(i)).f604c = cursor;
            if (!(cursor == null || cursor.isClosed())) {
                ((agh) this.f597c.get(i)).f605d = cursor.getColumnIndex("_id");
            }
            m1054a();
            notifyDataSetChanged();
        }
    }

    public int getViewTypeCount() {
        return 2;
    }

    public int getItemViewType(int i) {
        m1061c();
        int size = this.f597c.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i3 + ((agh) this.f597c.get(i2)).f606e;
            if (i < i3 || i >= i4) {
                i2++;
                i3 = i4;
            } else {
                int i5;
                i3 = i - i3;
                if (((agh) this.f597c.get(i2)).f603b) {
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
        m1061c();
        int size = this.f597c.size();
        int i3 = 0;
        while (i2 < size) {
            int i4 = ((agh) this.f597c.get(i2)).f606e + i3;
            if (i < i3 || i >= i4) {
                i2++;
                i3 = i4;
            } else {
                View a;
                size = i - i3;
                if (((agh) this.f597c.get(i2)).f603b) {
                    size--;
                }
                if (size == -1) {
                    a = m1052a(i2, ((agh) this.f597c.get(i2)).f604c, view, viewGroup);
                } else if (((agh) this.f597c.get(i2)).f604c.moveToPosition(size)) {
                    a = m1051a(i2, ((agh) this.f597c.get(i2)).f604c, size, view, viewGroup);
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

    protected View m1052a(int i, Cursor cursor, View view, ViewGroup viewGroup) {
        if (view != null) {
            return view;
        }
        return null;
    }

    protected View m1051a(int i, Cursor cursor, int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = m1053a(this.f596b);
        }
        m1057a(view, i, cursor);
        return view;
    }

    public Object getItem(int i) {
        m1061c();
        ArrayList arrayList = this.f597c;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            agh agh = (agh) obj;
            int i4 = agh.f606e + i3;
            if (i < i3 || i >= i4) {
                i3 = i4;
            } else {
                int i5 = i - i3;
                if (agh.f603b) {
                    i2 = i5 - 1;
                } else {
                    i2 = i5;
                }
                if (i2 == -1) {
                    return null;
                }
                Object obj2 = agh.f604c;
                if (obj2 == null || obj2.isClosed() || !obj2.moveToPosition(i2)) {
                    return null;
                }
                return obj2;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        m1061c();
        ArrayList arrayList = this.f597c;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            agh agh = (agh) obj;
            int i4 = agh.f606e + i3;
            if (i < i3 || i >= i4) {
                i3 = i4;
            } else {
                int i5 = i - i3;
                if (agh.f603b) {
                    i5--;
                }
                if (i5 == -1) {
                    return 0;
                }
                if (agh.f605d == -1) {
                    return 0;
                }
                Cursor cursor = agh.f604c;
                if (cursor == null || cursor.isClosed() || !cursor.moveToPosition(i5)) {
                    return 0;
                }
                return cursor.getLong(agh.f605d);
            }
        }
        return 0;
    }

    public boolean areAllItemsEnabled() {
        ArrayList arrayList = this.f597c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((agh) obj).f603b) {
                return false;
            }
        }
        return true;
    }

    public boolean isEnabled(int i) {
        m1061c();
        int size = this.f597c.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i3 + ((agh) this.f597c.get(i2)).f606e;
            if (i < i3 || i >= i4) {
                i2++;
                i3 = i4;
            } else {
                i3 = i - i3;
                if (((agh) this.f597c.get(i2)).f603b && i3 == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public void notifyDataSetChanged() {
        if (this.f600f) {
            this.f601g = false;
            super.notifyDataSetChanged();
            return;
        }
        this.f601g = true;
    }

    public View m1053a(Context context) {
        return new gnj(context, this.f595a);
    }

    public void m1057a(View view, int i, Cursor cursor) {
        gnj gnj = (gnj) view;
        dab dab = (dab) cursor;
        if (dab != null) {
            hwk a = dab.mo627a();
            dac c = dab.mo630c();
            int e = dab.mo632e();
            int d = dab.mo631d();
            CharSequence a2 = m1050a(i).m1062a();
            int i2 = 15;
            if (d == 1) {
                i2 = agg.m1048a(15, 8);
            }
            gnj.m18172a(a2 == null ? null : a2.toString());
            if (a != null) {
                int i3;
                if (dab.mo633f()) {
                    i3 = i2;
                } else {
                    i3 = agg.m1048a(i2, 3);
                }
                agg.m1049a(gnj, a, c, d, i3);
                return;
            }
            dak b = dab.mo629b();
            switch (e) {
                case 0:
                    int i4;
                    String string;
                    if (d == 1) {
                        glk.m17982e("Babel", "Local contacts not returning AggregatedPerson!", new Object[0]);
                    }
                    String str = null;
                    if (d == 2) {
                        i4 = i2;
                        string = dab.getString(0);
                    } else {
                        String a3 = ((dap) b.m11392f().get(0)).m11396a(gwb.m1400H());
                        str = dab.getString(2);
                        i4 = i2 | 16;
                        string = a3;
                    }
                    gnj.m18173a(str, string, null, null, null, e, d, b, c, i4);
                    return;
                default:
                    glk.m17982e("Babel", "CallContactsAdapter is given an unsupported contact type!", new Object[0]);
                    return;
            }
        }
    }

    public agg(Context context, bko bko) {
        this(context);
        this.f595a = bko;
    }

    public static int m1048a(int i, int i2) {
        return (i2 ^ -1) & i;
    }

    public static void m1049a(gnj gnj, hwk hwk, dac dac, int i, int i2) {
        String valueOf;
        String a;
        String b = dac == null ? null : dac.m11362b();
        CharSequence e = hwk.mo2081e();
        if (!hwk.mo2082f() || TextUtils.isEmpty(e)) {
            Long l = (Long) hwk.mo2078b().iterator().next();
            valueOf = String.valueOf(l);
            a = frm.m16047a(l);
        } else {
            a = hwk.mo2084h();
            valueOf = null;
        }
        String a2 = hwk.mo2077a();
        if (TextUtils.isEmpty(a2)) {
            a2 = dak.m11384b(hwk);
        }
        gnj.m18173a(valueOf, a2, null, a, a, 0, i, dak.m11378a(gwb.m1400H(), hwk, b), dac, i2);
    }

    public void m1058a(czo czo) {
        int b = m1059b();
        for (int i = 0; i < b; i++) {
            Cursor b2 = m1060b(i);
            if (b2 != null) {
                ((dab) b2).mo628a(czo);
            }
        }
    }
}
