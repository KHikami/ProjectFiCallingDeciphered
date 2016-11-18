package p000;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class fxp extends fxn {
    public static final String[] f14258a = new String[]{"_id", "msg_box", "sub", "sub_cs", "m_size", "date", "thread_id", "pri", "st", "read", "seen"};
    public static final int f14259b = 0;
    public static final int f14260c;
    public static final int f14261d;
    public static final int f14262e;
    public static final int f14263f;
    public static final int f14264g;
    public static final int f14265h;
    public static final int f14266i;
    public static final int f14267j;
    public static final int f14268k;
    public static final int f14269l;
    private static int f14270x;
    private int f14271A = 0;
    private int f14272B = 0;
    private String f14273C = null;
    private String f14274D = null;
    private String f14275E = null;
    private boolean f14276F = false;
    public long f14277m;
    public int f14278n;
    public String f14279o;
    public int f14280p;
    public long f14281q;
    public long f14282r;
    public int f14283s;
    public int f14284t;
    public boolean f14285u;
    public boolean f14286v;
    public List<fxq> f14287w = new ArrayList();
    private long f14288y;
    private boolean f14289z = false;

    static {
        f14270x = 0;
        f14270x = 1;
        int i = f14270x;
        f14270x = i + 1;
        f14260c = i;
        i = f14270x;
        f14270x = i + 1;
        f14261d = i;
        i = f14270x;
        f14270x = i + 1;
        f14262e = i;
        i = f14270x;
        f14270x = i + 1;
        f14263f = i;
        i = f14270x;
        f14270x = i + 1;
        f14264g = i;
        i = f14270x;
        f14270x = i + 1;
        f14265h = i;
        i = f14270x;
        f14270x = i + 1;
        f14266i = i;
        i = f14270x;
        f14270x = i + 1;
        f14267j = i;
        i = f14270x;
        f14270x = i + 1;
        f14268k = i;
        i = f14270x;
        f14270x = i + 1;
        f14269l = i;
    }

    private void m16484b(Cursor cursor) {
        boolean z = true;
        this.f14277m = cursor.getLong(f14259b);
        this.f14278n = cursor.getInt(f14260c);
        this.f14279o = cursor.getString(f14261d);
        this.f14280p = cursor.getInt(f14262e);
        if (!TextUtils.isEmpty(this.f14279o)) {
            this.f14279o = gwb.m1676a(gwb.m2118c(this.f14279o, 4), this.f14280p);
        }
        this.f14288y = cursor.getLong(f14263f);
        this.f14281q = (cursor.getLong(f14264g) * 1000) * 1000;
        this.f14282r = cursor.getLong(f14265h);
        this.f14283s = cursor.getInt(f14266i);
        this.f14284t = cursor.getInt(f14267j);
        this.f14285u = cursor.getInt(f14268k) != 0;
        if (cursor.getInt(f14269l) == 0) {
            z = false;
        }
        this.f14286v = z;
        this.f14287w.clear();
        this.f14289z = false;
        this.f14271A = 0;
        this.f14272B = 0;
        this.f14273C = null;
        this.f14274D = null;
        this.f14275E = null;
        this.f14276F = false;
    }

    public static fxp m16483a(Cursor cursor) {
        fxp fxp = new fxp();
        fxp.m16484b(cursor);
        return fxp;
    }

    public void m16487a(fxq fxq) {
        this.f14287w.add(fxq);
    }

    public List<fxq> m16490d() {
        return this.f14287w;
    }

    public String m16491e() {
        if (!this.f14289z) {
            m16485m();
        }
        if (this.f14273C == null) {
            return "";
        }
        return this.f14273C;
    }

    public String m16492f() {
        if (!this.f14289z) {
            m16485m();
        }
        return this.f14274D;
    }

    public String m16493g() {
        if (!this.f14289z) {
            m16485m();
        }
        return this.f14275E;
    }

    public long m16494h() {
        if (!this.f14289z) {
            m16485m();
        }
        return this.f14288y;
    }

    public boolean m16495i() {
        if (!this.f14289z) {
            m16485m();
        }
        return this.f14276F;
    }

    public int m16496j() {
        if (!this.f14289z) {
            m16485m();
        }
        return this.f14271A;
    }

    public int m16497k() {
        if (!this.f14289z) {
            m16485m();
        }
        return this.f14272B;
    }

    public List<foz> m16498l() {
        if (!this.f14289z) {
            m16485m();
        }
        if (this.f14272B <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (fxq fxq : this.f14287w) {
            if (fxq.m16503b()) {
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new fpc(new int[]{0}, null, null, null, null, null, fxq.m16505d().toString(), fxq.f14302l, fxq.f14303m, fxq.f14299i, 1, null, null, null, null));
            }
        }
        return arrayList;
    }

    private void m16485m() {
        if (!this.f14289z) {
            this.f14289z = true;
            long j = 0;
            int i = 0;
            int i2 = 0;
            StringBuilder stringBuilder = null;
            StringBuilder stringBuilder2 = null;
            for (fxq fxq : this.f14287w) {
                if (fxq.m16502a()) {
                    this.f14271A++;
                    if (this.f14273C == null) {
                        this.f14273C = fxq.f14300j;
                    } else {
                        if (stringBuilder2 == null) {
                            stringBuilder2 = new StringBuilder();
                            if (!TextUtils.isEmpty(this.f14273C)) {
                                stringBuilder2.append(this.f14273C);
                            }
                        }
                        if (!TextUtils.isEmpty(fxq.f14300j)) {
                            if (stringBuilder2.length() > 0) {
                                stringBuilder2.append(" ");
                            }
                            stringBuilder2.append(fxq.f14300j);
                        }
                    }
                } else if (fxq.m16503b()) {
                    this.f14272B++;
                    if (fxq.m16504c()) {
                        this.f14276F = true;
                    }
                    if (this.f14274D == null) {
                        this.f14274D = fxq.m16505d().toString();
                        this.f14275E = fxq.f14299i;
                        i2 = fxq.f14302l;
                        i = fxq.f14303m;
                    } else {
                        if (stringBuilder == null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(gwb.m1678a(this.f14274D, this.f14275E, Integer.toString(i2), Integer.toString(i)));
                        }
                        stringBuilder.append('|').append(gwb.m1678a(fxq.m16505d().toString(), fxq.f14299i, Integer.toString(fxq.f14302l), Integer.toString(fxq.f14303m)));
                    }
                }
                j += fxq.f14304n;
            }
            if (this.f14272B > 1) {
                this.f14275E = "multipart/mixed";
            }
            if (stringBuilder2 != null) {
                this.f14273C = stringBuilder2.toString();
            }
            if (stringBuilder != null) {
                this.f14274D = stringBuilder.toString();
            }
            if (this.f14288y <= 0) {
                this.f14288y = this.f14279o != null ? (long) this.f14279o.getBytes().length : 0;
                this.f14288y += j;
            }
        }
    }

    public long mo2113b() {
        return this.f14277m;
    }

    public int mo2112a() {
        return 1;
    }

    public long mo2114c() {
        return this.f14281q;
    }
}
