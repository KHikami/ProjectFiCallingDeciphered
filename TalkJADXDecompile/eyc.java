import android.text.TextUtils;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class eyc extends evz {
    private static final long serialVersionUID = 2;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private final boolean F;
    private final boolean G;
    private final long H;
    private List<gkv<Integer, Boolean>> I;
    private List<eso> J;
    private byte[][] K;
    private int L;
    private final edk g;
    private final fbc h;
    private final int i;
    private Map<String, eqb> j;
    private transient ltt k;
    private String l;
    private Integer m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    private eyc(lrn lrn) {
        int i = 0;
        super(lrn, lrn.responseHeader, -1);
        this.L = 0;
        if (lrn.a != null) {
            String valueOf;
            int i2;
            lqc lqc = lrn.a;
            this.g = gwb.a(gwb.H(), lqc, null);
            if (lqc.f != null) {
                this.h = new fbc(lqc.f, this.g.b(), glj.a());
            } else {
                this.h = null;
            }
            this.i = gwb.a(lrn.q, 0);
            this.p = gwb.b(Boolean.valueOf(this.g.o));
            ltt ltt = lrn.g;
            this.j = new HashMap();
            for (lts lts : ltt.a) {
                if (evz.a) {
                    valueOf = String.valueOf(glk.b(lts.a.a));
                    String valueOf2 = String.valueOf(lts.c);
                    new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("phoneNumber=").append(valueOf).append(" verificationStatus=").append(valueOf2);
                }
                if (TextUtils.isEmpty(lts.a.a)) {
                    glk.d("Babel", "skipping empty phone number", new Object[0]);
                } else {
                    eqb eqb = new eqb(lts);
                    if (eqb.b()) {
                        this.j.put(eqb.a(), eqb);
                    }
                }
            }
            this.k = lrn.g;
            if (this.k.b != null) {
                this.K = new byte[this.k.b.length][];
                i2 = 0;
                for (nzf a : this.k.b) {
                    this.K[i2] = nzf.a(a);
                    i2++;
                }
            } else {
                this.K = new byte[0][];
            }
            this.w = gwb.b(Boolean.valueOf(this.g.u));
            this.x = gwb.b(Boolean.valueOf(this.g.v));
            this.J = new ArrayList(lrn.s.length);
            for (lqq eso : lrn.s) {
                this.J.add(new eso(eso));
            }
            if (evz.a) {
                new StringBuilder(48).append("GetSelfInfoResponse bitCount status: ").append(i2);
            }
            for (loi loi : lrn.h) {
                if (evz.a) {
                    String valueOf3 = String.valueOf(loi.a);
                    valueOf = String.valueOf(loi.b);
                    new StringBuilder((String.valueOf(valueOf3).length() + 34) + String.valueOf(valueOf).length()).append("GetSelfInfoResponse configBit: ").append(valueOf3).append(" : ").append(valueOf);
                }
                switch (gwb.a(loi.a)) {
                    case wi.l /*2*/:
                        this.n = gwb.b(loi.b);
                        break;
                    case wi.p /*5*/:
                        this.o = gwb.b(loi.b);
                        break;
                    case wi.s /*6*/:
                        this.r = gwb.b(loi.b);
                        break;
                    case wi.dM /*12*/:
                        this.t = gwb.b(loi.b);
                        break;
                    case wi.dD /*13*/:
                        this.u = gwb.b(loi.b);
                        break;
                    case wi.g /*14*/:
                        this.v = gwb.b(loi.b);
                        break;
                    case wi.dL /*19*/:
                        this.s = gwb.b(loi.b);
                        break;
                    case wi.dA /*24*/:
                        this.z = gwb.b(loi.b);
                        break;
                    case wi.dz /*25*/:
                    case wi.dx /*26*/:
                        this.q = gwb.b(loi.b);
                        break;
                    case wi.i /*27*/:
                        this.y = gwb.b(loi.b);
                        break;
                    case wi.o /*28*/:
                        this.A = gwb.b(loi.b);
                        break;
                    case 29:
                        this.B = gwb.b(loi.b);
                        break;
                    case 31:
                        this.C = gwb.b(loi.b);
                        break;
                    case 33:
                        this.D = gwb.b(loi.b);
                        break;
                    case 36:
                        this.E = gwb.b(loi.b);
                        break;
                    default:
                        break;
                }
            }
            this.F = lrn.d != null;
            if (this.F) {
                this.G = gwb.b(lrn.d.a);
                this.H = gwb.a(lrn.d.b);
            } else {
                this.G = false;
                this.H = 0;
            }
            luu luu = lrn.l;
            if (luu != null && luu.c.length > 0) {
                this.I = new ArrayList(luu.c.length);
                lus[] lusArr = luu.c;
                i2 = lusArr.length;
                while (i < i2) {
                    lus lus = lusArr[i];
                    this.I.add(new gkv(lus.a, lus.b));
                    i++;
                }
            }
            this.L = gwb.a(lrn.u);
        } else {
            this.g = null;
            this.h = null;
            this.i = 0;
            this.j = null;
            this.k = null;
            this.F = false;
            this.G = false;
            this.H = 0;
        }
        mut mut = lrn.r;
        if (mut != null) {
            this.l = mut.a;
            this.m = Integer.valueOf(gwb.a(mut.b));
            glq.a(this.l, this.m);
        }
        if (evz.a) {
            String valueOf4 = String.valueOf(lrn);
            new StringBuilder(String.valueOf(valueOf4).length() + 25).append("GetSelfInfoResponse from:").append(valueOf4);
        }
    }

    public static evz a(lrn lrn) {
        if (evz.a(lrn.responseHeader)) {
            return new ewv((nzf) lrn, lrn.responseHeader);
        }
        return new eyc(lrn);
    }

    public edk k() {
        return this.g;
    }

    public Map<String, eqb> l() {
        return this.j;
    }

    public byte[][] m() {
        return this.K;
    }

    public bkp n() {
        bkp bkp = new bkp();
        bkp.a = this.i;
        bkp.b = this.n;
        bkp.c = this.o;
        bkp.i = this.p;
        bkp.d = this.q;
        bkp.e = this.r;
        bkp.l = this.s;
        bkp.f = this.t;
        bkp.g = this.v;
        bkp.h = this.u;
        bkp.j = this.w;
        bkp.k = this.x;
        bkp.m = this.y;
        bkp.n = this.z;
        bkp.o = this.A;
        bkp.p = this.B;
        bkp.r = this.l;
        bkp.s = this.m;
        bkp.t = this.C;
        bkp.q = this.D;
        bkp.u = this.E;
        bkp.v = this.J;
        return bkp;
    }

    public boolean o() {
        return this.G;
    }

    public long p() {
        return this.H;
    }

    public List<gkv<Integer, Boolean>> q() {
        return this.I;
    }

    public List<eso> r() {
        return this.J;
    }

    public int s() {
        return this.L;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(nzf.a(this.k));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.k = (ltt) nzf.a(new ltt(), (byte[]) objectInputStream.readObject());
    }
}
