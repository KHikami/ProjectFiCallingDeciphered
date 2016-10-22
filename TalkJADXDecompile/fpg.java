import android.text.TextUtils;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public final class fpg extends fou implements Serializable {
    private static final long serialVersionUID = 1;
    private esu A;
    private final int d;
    private final String e;
    private final List<edo> f;
    private final List<fbd> g;
    private final List<esr> h;
    private final String i;
    private final int j;
    private final int k;
    private final int[] l;
    private final edo m;
    private final fbd n;
    private final boolean o;
    private final int p;
    private final int q;
    private final long r;
    private final int s;
    private final byte[] t;
    private final int u;
    private final boolean v;
    private final Boolean w;
    private final boolean x;
    private final List<esu> y;
    private long z;

    public fpg(lom lom) {
        MessageDigest instance;
        int i = 0;
        super(lom.a.a, null, -1);
        try {
            instance = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            instance = null;
        }
        if (instance != null) {
            instance.update(nzf.a((nzf) lom));
            this.t = instance.digest();
        } else {
            this.t = null;
        }
        this.d = gwb.a(lom.c);
        this.e = lom.d;
        lxf[] lxfArr = lom.g;
        List arrayList = new ArrayList();
        for (lxf fbd : lxfArr) {
            arrayList.add(new fbd(fbd));
        }
        this.g = arrayList;
        this.h = esr.a(lom.l);
        this.f = gwb.a(gwb.H(), lom.k, lom.l);
        this.o = gwb.b(lom.h);
        this.p = gwb.a(lom.i);
        this.q = gwb.a(lom.j, 1);
        this.s = gwb.a(lom.t, 0);
        if (lom.f != null) {
            String a;
            int[] iArr;
            fbd fbd2;
            Boolean bool;
            lon lon = lom.f;
            if (gwb.a(lon.b) != 0) {
                a = blo.a(gwb.a(lon.b));
            } else {
                a = null;
            }
            this.i = a;
            this.j = gwb.a(lon.c);
            this.k = gwb.a(lon.a);
            if (lon.d.length > 0) {
                iArr = lon.d;
            } else {
                iArr = null;
            }
            this.l = iArr;
            this.m = gwb.a(gwb.H(), lon.e, null);
            if (lon.g != null) {
                fbd2 = new fbd(lon.g);
            } else {
                fbd2 = null;
            }
            this.n = fbd2;
            this.r = gwb.a(lon.h);
            this.z = gwb.a(lon.j);
            this.u = gwb.a(lon.k);
            this.v = gwb.b(lon.p);
            if (gwb.b(lon.l)) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
            this.w = bool;
            this.x = gwb.b(lom.m);
            if (lon.m.length == 1) {
                this.y = null;
                this.A = new esu(lon.m[0].a);
                return;
            } else if (lon.m.length > 1) {
                this.y = new ArrayList(lon.m.length);
                esu esu = null;
                while (i < lon.m.length) {
                    esu esu2 = new esu(lon.m[i].a);
                    this.y.add(esu2);
                    if (esu == null || gwb.b(lon.m[i].b)) {
                        esu = esu2;
                    }
                    i++;
                }
                this.A = esu;
                return;
            } else {
                this.y = null;
                this.A = null;
                return;
            }
        }
        this.i = null;
        this.j = 30;
        this.k = 2;
        this.l = null;
        this.m = null;
        this.n = null;
        this.r = 0;
        this.z = 0;
        this.u = 2;
        this.v = false;
        this.w = null;
        this.x = false;
        this.y = null;
        this.A = null;
    }

    public fpg(lom lom, byte b) {
        this(lom);
    }

    public int d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public Boolean f() {
        return this.w;
    }

    public List<fbd> g() {
        return this.g;
    }

    public List<esr> h() {
        return this.h;
    }

    public List<esu> i() {
        return this.y;
    }

    public esu j() {
        return this.A;
    }

    public List<edo> k() {
        return this.f;
    }

    public fbd l() {
        return this.n;
    }

    public boolean m() {
        return this.o;
    }

    public int n() {
        return this.s;
    }

    public String o() {
        return this.i;
    }

    public int p() {
        return this.u;
    }

    public edo q() {
        return this.m;
    }

    public int r() {
        return this.j;
    }

    public int s() {
        return this.k;
    }

    public int[] t() {
        return this.l;
    }

    public int u() {
        return this.p;
    }

    public int v() {
        return this.q;
    }

    public boolean w() {
        return this.v;
    }

    public long x() {
        return this.r;
    }

    public long y() {
        return this.z;
    }

    public byte[] z() {
        return this.t;
    }

    public boolean A() {
        return this.x;
    }

    public void b(String str) {
        for (esr esr : this.h) {
            if (!TextUtils.isEmpty(esr.b)) {
                lpk lpk = new lpk();
                lpk.a = Integer.valueOf(2);
                lpk.b = new muu();
                lpk.b.a = str;
                this.A = new esu(lpk);
                return;
            }
        }
    }

    public void a(long j) {
        this.z = j;
    }

    public boolean B() {
        return this.z > 0;
    }

    public String toString() {
        String str = "C[";
        String valueOf = String.valueOf(this.a);
        valueOf = String.valueOf(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        str = this.i;
        valueOf = String.valueOf(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(str).length()).append(valueOf).append("; clientGenerated=").append(str).toString());
        return String.valueOf(new StringBuilder(String.valueOf(valueOf).length() + 31).append(valueOf).append("; notificationLevel=").append(this.j).toString()).concat("]");
    }

    protected void a(blo blo, fhc fhc) {
        if (blf.a(blo.g(), this)) {
            blo.a();
            try {
                Object a = blf.a(blo, this, 0, null, fhc, null, false);
                blo.b();
                if (a != null) {
                    blf.d(blo);
                }
            } finally {
                blo.c();
            }
        } else {
            gwb.a(blo.g(), 1839);
        }
    }
}
