package p000;

import android.text.TextUtils;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class eyc extends evz {
    private static final long serialVersionUID = 2;
    private boolean f12466A;
    private boolean f12467B;
    private boolean f12468C;
    private boolean f12469D;
    private boolean f12470E;
    private final boolean f12471F;
    private final boolean f12472G;
    private final long f12473H;
    private List<gkv<Integer, Boolean>> f12474I;
    private List<eso> f12475J;
    private byte[][] f12476K;
    private int f12477L = 0;
    private final edk f12478g;
    private final fbc f12479h;
    private final int f12480i;
    private Map<String, eqb> f12481j;
    private transient ltt f12482k;
    private String f12483l;
    private Integer f12484m;
    private boolean f12485n;
    private boolean f12486o;
    private boolean f12487p;
    private boolean f12488q;
    private boolean f12489r;
    private boolean f12490s;
    private boolean f12491t;
    private boolean f12492u;
    private boolean f12493v;
    private boolean f12494w;
    private boolean f12495x;
    private boolean f12496y;
    private boolean f12497z;

    private eyc(lrn lrn) {
        int i = 0;
        super(lrn, lrn.responseHeader, -1);
        if (lrn.f26223a != null) {
            String valueOf;
            int i2;
            lqc lqc = lrn.f26223a;
            this.f12478g = gwb.m1600a(gwb.m1400H(), lqc, null);
            if (lqc.f26066f != null) {
                this.f12479h = new fbc(lqc.f26066f, this.f12478g.m13590b(), glj.m17956a());
            } else {
                this.f12479h = null;
            }
            this.f12480i = gwb.m1508a(lrn.f26239q, 0);
            this.f12487p = gwb.m2061b(Boolean.valueOf(this.f12478g.f11226o));
            ltt ltt = lrn.f26229g;
            this.f12481j = new HashMap();
            for (lts lts : ltt.f26411a) {
                if (evz.f5798a) {
                    valueOf = String.valueOf(glk.m17974b(lts.f26405a.f28411a));
                    String valueOf2 = String.valueOf(lts.f26407c);
                    new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("phoneNumber=").append(valueOf).append(" verificationStatus=").append(valueOf2);
                }
                if (TextUtils.isEmpty(lts.f26405a.f28411a)) {
                    glk.m17981d("Babel", "skipping empty phone number", new Object[0]);
                } else {
                    eqb eqb = new eqb(lts);
                    if (eqb.m14241b()) {
                        this.f12481j.put(eqb.m14240a(), eqb);
                    }
                }
            }
            this.f12482k = lrn.f26229g;
            if (this.f12482k.f26412b != null) {
                this.f12476K = new byte[this.f12482k.f26412b.length][];
                i2 = 0;
                for (nzf a : this.f12482k.f26412b) {
                    this.f12476K[i2] = nzf.m1029a(a);
                    i2++;
                }
            } else {
                this.f12476K = new byte[0][];
            }
            this.f12494w = gwb.m2061b(Boolean.valueOf(this.f12478g.f11232u));
            this.f12495x = gwb.m2061b(Boolean.valueOf(this.f12478g.f11233v));
            this.f12475J = new ArrayList(lrn.f26241s.length);
            for (lqq eso : lrn.f26241s) {
                this.f12475J.add(new eso(eso));
            }
            if (evz.f5798a) {
                new StringBuilder(48).append("GetSelfInfoResponse bitCount status: ").append(i2);
            }
            for (loi loi : lrn.f26230h) {
                if (evz.f5798a) {
                    String valueOf3 = String.valueOf(loi.f25873a);
                    valueOf = String.valueOf(loi.f25874b);
                    new StringBuilder((String.valueOf(valueOf3).length() + 34) + String.valueOf(valueOf).length()).append("GetSelfInfoResponse configBit: ").append(valueOf3).append(" : ").append(valueOf);
                }
                switch (gwb.m1507a(loi.f25873a)) {
                    case 2:
                        this.f12485n = gwb.m2061b(loi.f25874b);
                        break;
                    case 5:
                        this.f12486o = gwb.m2061b(loi.f25874b);
                        break;
                    case 6:
                        this.f12489r = gwb.m2061b(loi.f25874b);
                        break;
                    case 12:
                        this.f12491t = gwb.m2061b(loi.f25874b);
                        break;
                    case 13:
                        this.f12492u = gwb.m2061b(loi.f25874b);
                        break;
                    case 14:
                        this.f12493v = gwb.m2061b(loi.f25874b);
                        break;
                    case wi.dL /*19*/:
                        this.f12490s = gwb.m2061b(loi.f25874b);
                        break;
                    case wi.dA /*24*/:
                        this.f12497z = gwb.m2061b(loi.f25874b);
                        break;
                    case wi.dz /*25*/:
                    case wi.dx /*26*/:
                        this.f12488q = gwb.m2061b(loi.f25874b);
                        break;
                    case 27:
                        this.f12496y = gwb.m2061b(loi.f25874b);
                        break;
                    case 28:
                        this.f12466A = gwb.m2061b(loi.f25874b);
                        break;
                    case 29:
                        this.f12467B = gwb.m2061b(loi.f25874b);
                        break;
                    case 31:
                        this.f12468C = gwb.m2061b(loi.f25874b);
                        break;
                    case 33:
                        this.f12469D = gwb.m2061b(loi.f25874b);
                        break;
                    case 36:
                        this.f12470E = gwb.m2061b(loi.f25874b);
                        break;
                    default:
                        break;
                }
            }
            this.f12471F = lrn.f26226d != null;
            if (this.f12471F) {
                this.f12472G = gwb.m2061b(lrn.f26226d.f26027a);
                this.f12473H = gwb.m1523a(lrn.f26226d.f26028b);
            } else {
                this.f12472G = false;
                this.f12473H = 0;
            }
            luu luu = lrn.f26234l;
            if (luu != null && luu.f26534c.length > 0) {
                this.f12474I = new ArrayList(luu.f26534c.length);
                lus[] lusArr = luu.f26534c;
                i2 = lusArr.length;
                while (i < i2) {
                    lus lus = lusArr[i];
                    this.f12474I.add(new gkv(lus.f26529a, lus.f26530b));
                    i++;
                }
            }
            this.f12477L = gwb.m1507a(lrn.f26243u);
        } else {
            this.f12478g = null;
            this.f12479h = null;
            this.f12480i = 0;
            this.f12481j = null;
            this.f12482k = null;
            this.f12471F = false;
            this.f12472G = false;
            this.f12473H = 0;
        }
        mut mut = lrn.f26240r;
        if (mut != null) {
            this.f12483l = mut.f28408a;
            this.f12484m = Integer.valueOf(gwb.m1507a(mut.f28409b));
            glq.m18005a(this.f12483l, this.f12484m);
        }
        if (evz.f5798a) {
            String valueOf4 = String.valueOf(lrn);
            new StringBuilder(String.valueOf(valueOf4).length() + 25).append("GetSelfInfoResponse from:").append(valueOf4);
        }
    }

    public static evz m14769a(lrn lrn) {
        if (evz.m8120a(lrn.responseHeader)) {
            return new ewv((nzf) lrn, lrn.responseHeader);
        }
        return new eyc(lrn);
    }

    public edk m14770k() {
        return this.f12478g;
    }

    public Map<String, eqb> m14771l() {
        return this.f12481j;
    }

    public byte[][] m14772m() {
        return this.f12476K;
    }

    public bkp m14773n() {
        bkp bkp = new bkp();
        bkp.f3637a = this.f12480i;
        bkp.f3638b = this.f12485n;
        bkp.f3639c = this.f12486o;
        bkp.f3645i = this.f12487p;
        bkp.f3640d = this.f12488q;
        bkp.f3641e = this.f12489r;
        bkp.f3648l = this.f12490s;
        bkp.f3642f = this.f12491t;
        bkp.f3643g = this.f12493v;
        bkp.f3644h = this.f12492u;
        bkp.f3646j = this.f12494w;
        bkp.f3647k = this.f12495x;
        bkp.f3649m = this.f12496y;
        bkp.f3650n = this.f12497z;
        bkp.f3651o = this.f12466A;
        bkp.f3652p = this.f12467B;
        bkp.f3654r = this.f12483l;
        bkp.f3655s = this.f12484m;
        bkp.f3656t = this.f12468C;
        bkp.f3653q = this.f12469D;
        bkp.f3657u = this.f12470E;
        bkp.f3658v = this.f12475J;
        return bkp;
    }

    public boolean m14774o() {
        return this.f12472G;
    }

    public long m14775p() {
        return this.f12473H;
    }

    public List<gkv<Integer, Boolean>> m14776q() {
        return this.f12474I;
    }

    public List<eso> m14777r() {
        return this.f12475J;
    }

    public int m14778s() {
        return this.f12477L;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(nzf.m1029a(this.f12482k));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f12482k = (ltt) nzf.m1027a(new ltt(), (byte[]) objectInputStream.readObject());
    }
}
