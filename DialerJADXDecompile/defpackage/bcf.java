package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import java.util.Calendar;
import java.util.List;

/* compiled from: PG */
/* renamed from: bcf */
public class bcf {
    private static final String e;
    Context a;
    bch b;
    View c;
    LayoutInflater d;
    private boolean f;

    static {
        e = bcf.class.getSimpleName();
    }

    public bcf(Context context, boolean z) {
        this.a = context;
        this.d = (LayoutInflater) context.getSystemService("layout_inflater");
        a(z);
    }

    public final boolean a(boolean z) {
        if (this.f == z && this.b != null) {
            return false;
        }
        int i;
        this.f = z;
        Context context = this.a;
        if (this.f) {
            i = buf.kR;
        } else {
            i = buf.kZ;
        }
        this.b = new bch(this, context, i);
        return true;
    }

    final bcg a(List list) {
        int i = 0;
        try {
            Calendar instance = Calendar.getInstance();
            if (instance == null || list == null || list.size() == 0) {
                return null;
            }
            int i2;
            String string;
            bcg bcg = new bcg((byte) 0);
            bcg.a = buf.kB;
            int i3 = 0;
            int i4 = 0;
            for (Pair pair : list) {
                int i5;
                if (((Calendar) pair.first).compareTo(instance) <= 0 && instance.compareTo((Calendar) pair.second) < 0) {
                    i4 = 1;
                }
                if (instance.get(6) == ((Calendar) pair.first).get(6)) {
                    i2 = i + 1;
                } else {
                    i2 = i;
                }
                if (instance.compareTo((Calendar) pair.second) > 0) {
                    i5 = i3 + 1;
                } else {
                    i5 = i3;
                }
                i = i2;
                i3 = i5;
            }
            if (i4 != 0) {
                string = this.a.getString(aq.df);
            } else {
                string = this.a.getString(aq.cl);
            }
            bcg.b = string;
            if (i4 == 0) {
                i2 = i - 1;
                if (i == 0) {
                    bcg.c = this.a.getString(aq.dj, new Object[]{a((Calendar) ((Pair) list.get(0)).first)});
                } else if (instance.after(((Pair) list.get(i2)).second)) {
                    if (i < list.size()) {
                        bcg.c = this.a.getString(aq.dj, new Object[]{a((Calendar) ((Pair) list.get(i)).first)});
                    } else {
                        bcg.c = this.a.getString(aq.cm, new Object[]{a((Calendar) ((Pair) list.get(i2)).second)});
                    }
                } else if (i3 < list.size()) {
                    bcg.c = this.a.getString(aq.di, new Object[]{a((Calendar) ((Pair) list.get(i3)).first)});
                }
            } else if (i == 1) {
                bcg.c = a((Pair) list.get(0));
            } else if (i == 2) {
                bcg.c = this.a.getString(aq.dh, new Object[]{a((Pair) list.get(0)), a((Pair) list.get(1))});
            } else if (i3 < list.size()) {
                bcg.c = this.a.getString(aq.cn, new Object[]{a((Calendar) ((Pair) list.get(i3)).second)});
            }
            return bcg;
        } catch (Exception e) {
            bdf.a(e, "Error constructing hours info: ", e);
            return null;
        }
    }

    private String a(Calendar calendar) {
        return DateFormat.getTimeFormat(this.a).format(calendar.getTime());
    }

    private String a(Pair pair) {
        return this.a.getString(aq.dg, new Object[]{a((Calendar) pair.first), a((Calendar) pair.second)});
    }
}
