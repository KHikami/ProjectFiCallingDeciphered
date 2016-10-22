package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fxp */
public final class fxp extends fxn {
    public static final String[] a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    private static int x;
    private int A;
    private int B;
    private String C;
    private String D;
    private String E;
    private boolean F;
    public long m;
    public int n;
    public String o;
    public int p;
    public long q;
    public long r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public List<fxq> w;
    private long y;
    private boolean z;

    public fxp() {
        this.w = new ArrayList();
        this.z = false;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = false;
    }

    static {
        a = new String[]{"_id", "msg_box", "sub", "sub_cs", "m_size", "date", "thread_id", "pri", "st", "read", "seen"};
        x = 0;
        x = 1;
        b = 0;
        int i = x;
        x = i + 1;
        c = i;
        i = x;
        x = i + 1;
        d = i;
        i = x;
        x = i + 1;
        e = i;
        i = x;
        x = i + 1;
        f = i;
        i = x;
        x = i + 1;
        g = i;
        i = x;
        x = i + 1;
        h = i;
        i = x;
        x = i + 1;
        i = i;
        i = x;
        x = i + 1;
        j = i;
        i = x;
        x = i + 1;
        k = i;
        i = x;
        x = i + 1;
        l = i;
    }

    private void b(Cursor cursor) {
        boolean z = true;
        this.m = cursor.getLong(b);
        this.n = cursor.getInt(c);
        this.o = cursor.getString(d);
        this.p = cursor.getInt(e);
        if (!TextUtils.isEmpty(this.o)) {
            this.o = gwb.a(gwb.c(this.o, 4), this.p);
        }
        this.y = cursor.getLong(f);
        this.q = (cursor.getLong(g) * 1000) * 1000;
        this.r = cursor.getLong(h);
        this.s = cursor.getInt(i);
        this.t = cursor.getInt(j);
        this.u = cursor.getInt(k) != 0;
        if (cursor.getInt(l) == 0) {
            z = false;
        }
        this.v = z;
        this.w.clear();
        this.z = false;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = false;
    }

    public static fxp a(Cursor cursor) {
        fxp fxp = new fxp();
        fxp.b(cursor);
        return fxp;
    }

    public void a(fxq fxq) {
        this.w.add(fxq);
    }

    public List<fxq> d() {
        return this.w;
    }

    public String e() {
        if (!this.z) {
            m();
        }
        if (this.C == null) {
            return "";
        }
        return this.C;
    }

    public String f() {
        if (!this.z) {
            m();
        }
        return this.D;
    }

    public String g() {
        if (!this.z) {
            m();
        }
        return this.E;
    }

    public long h() {
        if (!this.z) {
            m();
        }
        return this.y;
    }

    public boolean i() {
        if (!this.z) {
            m();
        }
        return this.F;
    }

    public int j() {
        if (!this.z) {
            m();
        }
        return this.A;
    }

    public int k() {
        if (!this.z) {
            m();
        }
        return this.B;
    }

    public List<foz> l() {
        if (!this.z) {
            m();
        }
        if (this.B <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (fxq fxq : this.w) {
            if (fxq.b()) {
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new fpc(new int[]{0}, null, null, null, null, null, fxq.d().toString(), fxq.l, fxq.m, fxq.i, 1, null, null, null, null));
            }
        }
        return arrayList;
    }

    private void m() {
        if (!this.z) {
            this.z = true;
            long j = 0;
            int i = 0;
            int i2 = 0;
            StringBuilder stringBuilder = null;
            StringBuilder stringBuilder2 = null;
            for (fxq fxq : this.w) {
                if (fxq.a()) {
                    this.A++;
                    if (this.C == null) {
                        this.C = fxq.j;
                    } else {
                        if (stringBuilder2 == null) {
                            stringBuilder2 = new StringBuilder();
                            if (!TextUtils.isEmpty(this.C)) {
                                stringBuilder2.append(this.C);
                            }
                        }
                        if (!TextUtils.isEmpty(fxq.j)) {
                            if (stringBuilder2.length() > 0) {
                                stringBuilder2.append(" ");
                            }
                            stringBuilder2.append(fxq.j);
                        }
                    }
                } else if (fxq.b()) {
                    this.B++;
                    if (fxq.c()) {
                        this.F = true;
                    }
                    if (this.D == null) {
                        this.D = fxq.d().toString();
                        this.E = fxq.i;
                        i2 = fxq.l;
                        i = fxq.m;
                    } else {
                        if (stringBuilder == null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(gwb.a(this.D, this.E, Integer.toString(i2), Integer.toString(i)));
                        }
                        stringBuilder.append('|').append(gwb.a(fxq.d().toString(), fxq.i, Integer.toString(fxq.l), Integer.toString(fxq.m)));
                    }
                }
                j += fxq.n;
            }
            if (this.B > 1) {
                this.E = "multipart/mixed";
            }
            if (stringBuilder2 != null) {
                this.C = stringBuilder2.toString();
            }
            if (stringBuilder != null) {
                this.D = stringBuilder.toString();
            }
            if (this.y <= 0) {
                this.y = this.o != null ? (long) this.o.getBytes().length : 0;
                this.y += j;
            }
        }
    }

    public long b() {
        return this.m;
    }

    public int a() {
        return 1;
    }

    public long c() {
        return this.q;
    }
}
