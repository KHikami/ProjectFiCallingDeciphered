package p000;

import android.text.TextUtils;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public final class fpg extends fou implements Serializable {
    private static final long serialVersionUID = 1;
    private esu f13658A;
    private final int f13659d;
    private final String f13660e;
    private final List<edo> f13661f;
    private final List<fbd> f13662g;
    private final List<esr> f13663h;
    private final String f13664i;
    private final int f13665j;
    private final int f13666k;
    private final int[] f13667l;
    private final edo f13668m;
    private final fbd f13669n;
    private final boolean f13670o;
    private final int f13671p;
    private final int f13672q;
    private final long f13673r;
    private final int f13674s;
    private final byte[] f13675t;
    private final int f13676u;
    private final boolean f13677v;
    private final Boolean f13678w;
    private final boolean f13679x;
    private final List<esu> f13680y;
    private long f13681z;

    public fpg(lom lom) {
        MessageDigest instance;
        int i = 0;
        super(lom.f25886a.f25931a, null, -1);
        try {
            instance = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            instance = null;
        }
        if (instance != null) {
            instance.update(nzf.m1029a((nzf) lom));
            this.f13675t = instance.digest();
        } else {
            this.f13675t = null;
        }
        this.f13659d = gwb.m1507a(lom.f25888c);
        this.f13660e = lom.f25889d;
        lxf[] lxfArr = lom.f25892g;
        List arrayList = new ArrayList();
        for (lxf fbd : lxfArr) {
            arrayList.add(new fbd(fbd));
        }
        this.f13662g = arrayList;
        this.f13663h = esr.m14385a(lom.f25897l);
        this.f13661f = gwb.m1694a(gwb.m1400H(), lom.f25896k, lom.f25897l);
        this.f13670o = gwb.m2061b(lom.f25893h);
        this.f13671p = gwb.m1507a(lom.f25894i);
        this.f13672q = gwb.m1508a(lom.f25895j, 1);
        this.f13674s = gwb.m1508a(lom.f25905t, 0);
        if (lom.f25891f != null) {
            String a;
            int[] iArr;
            fbd fbd2;
            Boolean bool;
            lon lon = lom.f25891f;
            if (gwb.m1523a(lon.f25907b) != 0) {
                a = blo.m5857a(gwb.m1523a(lon.f25907b));
            } else {
                a = null;
            }
            this.f13664i = a;
            this.f13665j = gwb.m1507a(lon.f25908c);
            this.f13666k = gwb.m1507a(lon.f25906a);
            if (lon.f25909d.length > 0) {
                iArr = lon.f25909d;
            } else {
                iArr = null;
            }
            this.f13667l = iArr;
            this.f13668m = gwb.m1604a(gwb.m1400H(), lon.f25910e, null);
            if (lon.f25912g != null) {
                fbd2 = new fbd(lon.f25912g);
            } else {
                fbd2 = null;
            }
            this.f13669n = fbd2;
            this.f13673r = gwb.m1523a(lon.f25913h);
            this.f13681z = gwb.m1523a(lon.f25915j);
            this.f13676u = gwb.m1507a(lon.f25916k);
            this.f13677v = gwb.m2061b(lon.f25921p);
            if (gwb.m2061b(lon.f25917l)) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
            this.f13678w = bool;
            this.f13679x = gwb.m2061b(lom.f25898m);
            if (lon.f25918m.length == 1) {
                this.f13680y = null;
                this.f13658A = new esu(lon.f25918m[0].f25923a);
                return;
            } else if (lon.f25918m.length > 1) {
                this.f13680y = new ArrayList(lon.f25918m.length);
                esu esu = null;
                while (i < lon.f25918m.length) {
                    esu esu2 = new esu(lon.f25918m[i].f25923a);
                    this.f13680y.add(esu2);
                    if (esu == null || gwb.m2061b(lon.f25918m[i].f25924b)) {
                        esu = esu2;
                    }
                    i++;
                }
                this.f13658A = esu;
                return;
            } else {
                this.f13680y = null;
                this.f13658A = null;
                return;
            }
        }
        this.f13664i = null;
        this.f13665j = 30;
        this.f13666k = 2;
        this.f13667l = null;
        this.f13668m = null;
        this.f13669n = null;
        this.f13673r = 0;
        this.f13681z = 0;
        this.f13676u = 2;
        this.f13677v = false;
        this.f13678w = null;
        this.f13679x = false;
        this.f13680y = null;
        this.f13658A = null;
    }

    public fpg(lom lom, byte b) {
        this(lom);
    }

    public int m15875d() {
        return this.f13659d;
    }

    public String m15876e() {
        return this.f13660e;
    }

    public Boolean m15877f() {
        return this.f13678w;
    }

    public List<fbd> m15878g() {
        return this.f13662g;
    }

    public List<esr> m15879h() {
        return this.f13663h;
    }

    public List<esu> m15880i() {
        return this.f13680y;
    }

    public esu m15881j() {
        return this.f13658A;
    }

    public List<edo> m15882k() {
        return this.f13661f;
    }

    public fbd m15883l() {
        return this.f13669n;
    }

    public boolean m15884m() {
        return this.f13670o;
    }

    public int m15885n() {
        return this.f13674s;
    }

    public String m15886o() {
        return this.f13664i;
    }

    public int m15887p() {
        return this.f13676u;
    }

    public edo m15888q() {
        return this.f13668m;
    }

    public int m15889r() {
        return this.f13665j;
    }

    public int m15890s() {
        return this.f13666k;
    }

    public int[] m15891t() {
        return this.f13667l;
    }

    public int m15892u() {
        return this.f13671p;
    }

    public int m15893v() {
        return this.f13672q;
    }

    public boolean m15894w() {
        return this.f13677v;
    }

    public long m15895x() {
        return this.f13673r;
    }

    public long m15896y() {
        return this.f13681z;
    }

    public byte[] m15897z() {
        return this.f13675t;
    }

    public boolean m15870A() {
        return this.f13679x;
    }

    public void m15874b(String str) {
        for (esr esr : this.f13663h) {
            if (!TextUtils.isEmpty(esr.f12188b)) {
                lpk lpk = new lpk();
                lpk.f26004a = Integer.valueOf(2);
                lpk.f26005b = new muu();
                lpk.f26005b.f28411a = str;
                this.f13658A = new esu(lpk);
                return;
            }
        }
    }

    public void m15872a(long j) {
        this.f13681z = j;
    }

    public boolean m15871B() {
        return this.f13681z > 0;
    }

    public String toString() {
        String str = "C[";
        String valueOf = String.valueOf(this.a);
        valueOf = String.valueOf(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        str = this.f13664i;
        valueOf = String.valueOf(new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(str).length()).append(valueOf).append("; clientGenerated=").append(str).toString());
        return String.valueOf(new StringBuilder(String.valueOf(valueOf).length() + 31).append(valueOf).append("; notificationLevel=").append(this.f13665j).toString()).concat("]");
    }

    protected void mo2061a(blo blo, fhc fhc) {
        if (blf.m5798a(blo.m6056g(), this)) {
            blo.m5958a();
            try {
                Object a = blf.m5799a(blo, this, 0, null, fhc, null, false);
                blo.m6015b();
                if (a != null) {
                    blf.m5820d(blo);
                }
            } finally {
                blo.m6028c();
            }
        } else {
            gwb.m1823a(blo.m6056g(), 1839);
        }
    }
}
