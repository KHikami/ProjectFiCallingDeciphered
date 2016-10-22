package defpackage;

import android.net.Uri;
import android.widget.ImageView;

/* renamed from: ams */
public final class ams<TranscodeType> implements Cloneable {
    private static final amy<?, ?> a;
    private static final azh<?> b;
    private final amk c;
    private final amu d;
    private final Class<TranscodeType> e;
    private final azh<?> f;
    private azh<?> g;
    private amy<?, ? super TranscodeType> h;
    private Object i;
    private azk<TranscodeType> j;
    private ams<TranscodeType> k;
    private Float l;
    private boolean m;
    private boolean n;

    public /* synthetic */ Object clone() {
        return a();
    }

    static {
        a = new amy((byte) 0);
        b = ((azl) ((azl) new azl().a(apq.c)).a(amq.LOW)).a(true);
    }

    ams(amk amk, amu amu, Class<TranscodeType> cls) {
        this.h = a;
        this.d = amu;
        this.c = (amk) gwb.I((Object) amk);
        this.e = cls;
        this.f = amu.j();
        this.g = this.f;
    }

    public ams<TranscodeType> a(azh<?> azh_) {
        gwb.I((Object) azh_);
        this.g = (this.f == this.g ? this.g.a() : this.g).a((azh) azh_);
        return this;
    }

    public ams<TranscodeType> a(amy<?, ? super TranscodeType> amy____super_TranscodeType) {
        this.h = (amy) gwb.I((Object) amy____super_TranscodeType);
        return this;
    }

    public ams<TranscodeType> a(azk<TranscodeType> azk_TranscodeType) {
        this.j = azk_TranscodeType;
        return this;
    }

    public ams<TranscodeType> a(Object obj) {
        return b(obj);
    }

    private ams<TranscodeType> b(Object obj) {
        this.i = obj;
        this.m = true;
        return this;
    }

    public ams<TranscodeType> a(String str) {
        return b(str);
    }

    public ams<TranscodeType> a(Uri uri) {
        return b(uri);
    }

    public ams<TranscodeType> a() {
        try {
            ams<TranscodeType> ams_TranscodeType = (ams) super.clone();
            ams_TranscodeType.g = ams_TranscodeType.g.a();
            ams_TranscodeType.h = ams_TranscodeType.h.a();
            return ams_TranscodeType;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public <Y extends azx<TranscodeType>> Y a(Y y) {
        baq.a();
        gwb.I((Object) y);
        if (this.m) {
            if (y.b() != null) {
                this.d.a((azx) y);
            }
            this.g.s = true;
            azi a = a(y, null, this.h, this.g.c, this.g.j, this.g.i);
            y.a(a);
            this.d.a(y, a);
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public azx<TranscodeType> a(ImageView imageView) {
        baq.a();
        gwb.I((Object) imageView);
        if (!(this.g.a(2048) || !this.g.m || imageView.getScaleType() == null)) {
            if (this.g.s) {
                this.g = this.g.a();
            }
            switch (amt.a[imageView.getScaleType().ordinal()]) {
                case wi.j /*1*/:
                    this.g.a(this.c);
                    break;
                case wi.l /*2*/:
                    this.g.d(this.c);
                    break;
                case wi.z /*3*/:
                case wi.h /*4*/:
                case wi.p /*5*/:
                    this.g.b(this.c);
                    break;
            }
        }
        return a(this.c.a(imageView, this.e));
    }

    private amq a(amq amq) {
        switch (amt.b[amq.ordinal()]) {
            case wi.j /*1*/:
                return amq.NORMAL;
            case wi.l /*2*/:
                return amq.HIGH;
            case wi.z /*3*/:
            case wi.h /*4*/:
                return amq.IMMEDIATE;
            default:
                String valueOf = String.valueOf(this.g.c);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 18).append("unknown priority: ").append(valueOf).toString());
        }
    }

    private azi a(azx<TranscodeType> azx_TranscodeType, azq azq, amy<?, ? super TranscodeType> amy____super_TranscodeType, amq amq, int i, int i2) {
        azi azq2;
        if (this.k != null) {
            if (this.n) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            amy<?, ? super TranscodeType> amy____super_TranscodeType2;
            amq amq2;
            int i3;
            int i4;
            azi a;
            azi a2;
            amy<?, ? super TranscodeType> amy____super_TranscodeType3 = this.k.h;
            if (a.equals(amy____super_TranscodeType3)) {
                amy____super_TranscodeType2 = amy____super_TranscodeType;
            } else {
                amy____super_TranscodeType2 = amy____super_TranscodeType3;
            }
            if (this.k.g.a(8)) {
                amq2 = this.k.g.c;
            } else {
                amq2 = a(amq);
            }
            int i5 = this.k.g.j;
            int i6 = this.k.g.i;
            if (baq.a(i, i2)) {
                azh azh = this.k.g;
                if (!baq.a(azh.j, azh.i)) {
                    i5 = this.g.j;
                    i3 = this.g.i;
                    i4 = i5;
                    azq2 = new azq(azq);
                    a = a(azx_TranscodeType, this.g, azq2, amy____super_TranscodeType, amq, i, i2);
                    this.n = true;
                    a2 = this.k.a(azx_TranscodeType, azq2, amy____super_TranscodeType2, amq2, i4, i3);
                    this.n = false;
                    azq2.a(a, a2);
                    return azq2;
                }
            }
            i3 = i6;
            i4 = i5;
            azq2 = new azq(azq);
            a = a(azx_TranscodeType, this.g, azq2, amy____super_TranscodeType, amq, i, i2);
            this.n = true;
            a2 = this.k.a(azx_TranscodeType, azq2, amy____super_TranscodeType2, amq2, i4, i3);
            this.n = false;
            azq2.a(a, a2);
            return azq2;
        } else if (this.l != null) {
            azq2 = new azq(azq);
            azq2.a(a(azx_TranscodeType, this.g, azq2, amy____super_TranscodeType, amq, i, i2), a(azx_TranscodeType, this.g.a().a(this.l.floatValue()), azq2, amy____super_TranscodeType, a(amq), i, i2));
            return azq2;
        } else {
            return a(azx_TranscodeType, this.g, azq, amy____super_TranscodeType, amq, i, i2);
        }
    }

    private azi a(azx<TranscodeType> azx_TranscodeType, azh<?> azh_, azj azj, amy<?, ? super TranscodeType> amy____super_TranscodeType, amq amq, int i, int i2) {
        azh_.s = true;
        amk amk = this.c;
        Object obj = this.i;
        Class cls = this.e;
        azk azk = this.j;
        apw b = this.c.b();
        bad bad = amy____super_TranscodeType.a;
        azi azi = (azn) azn.a.a();
        if (azi == null) {
            azi = new azn();
        }
        azi.c = amk;
        azi.d = obj;
        azi.e = cls;
        azi.f = azh_;
        azi.g = i;
        azi.h = i2;
        azi.i = amq;
        azi.j = azx_TranscodeType;
        azi.k = azk;
        azi.b = azj;
        azi.l = b;
        azi.m = bad;
        azi.n = azp.a;
        return azi;
    }
}
