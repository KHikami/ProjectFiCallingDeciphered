package p000;

import android.net.Uri;
import android.widget.ImageView;

public final class ams<TranscodeType> implements Cloneable {
    private static final amy<?, ?> f1340a = new amy((byte) 0);
    private static final azh<?> f1341b = ((azl) ((azl) new azl().m4428a(apq.f2077c)).m4422a(amq.LOW)).m4432a(true);
    private final amk f1342c;
    private final amu f1343d;
    private final Class<TranscodeType> f1344e;
    private final azh<?> f1345f;
    private azh<?> f1346g;
    private amy<?, ? super TranscodeType> f1347h = f1340a;
    private Object f1348i;
    private azk<TranscodeType> f1349j;
    private ams<TranscodeType> f1350k;
    private Float f1351l;
    private boolean f1352m;
    private boolean f1353n;

    public /* synthetic */ Object clone() {
        return m2961a();
    }

    ams(amk amk, amu amu, Class<TranscodeType> cls) {
        this.f1343d = amu;
        this.f1342c = (amk) gwb.m1404I((Object) amk);
        this.f1344e = cls;
        this.f1345f = amu.m2984j();
        this.f1346g = this.f1345f;
    }

    public ams<TranscodeType> m2964a(azh<?> azh_) {
        gwb.m1404I((Object) azh_);
        this.f1346g = (this.f1345f == this.f1346g ? this.f1346g.m4419a() : this.f1346g).m4430a((azh) azh_);
        return this;
    }

    public ams<TranscodeType> m2962a(amy<?, ? super TranscodeType> amy____super_TranscodeType) {
        this.f1347h = (amy) gwb.m1404I((Object) amy____super_TranscodeType);
        return this;
    }

    public ams<TranscodeType> m2965a(azk<TranscodeType> azk_TranscodeType) {
        this.f1349j = azk_TranscodeType;
        return this;
    }

    public ams<TranscodeType> m2966a(Object obj) {
        return m2960b(obj);
    }

    private ams<TranscodeType> m2960b(Object obj) {
        this.f1348i = obj;
        this.f1352m = true;
        return this;
    }

    public ams<TranscodeType> m2967a(String str) {
        return m2960b(str);
    }

    public ams<TranscodeType> m2963a(Uri uri) {
        return m2960b(uri);
    }

    public ams<TranscodeType> m2961a() {
        try {
            ams<TranscodeType> ams_TranscodeType = (ams) super.clone();
            ams_TranscodeType.f1346g = ams_TranscodeType.f1346g.m4419a();
            ams_TranscodeType.f1347h = ams_TranscodeType.f1347h.m2990a();
            return ams_TranscodeType;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public <Y extends azx<TranscodeType>> Y m2969a(Y y) {
        baq.m4685a();
        gwb.m1404I((Object) y);
        if (this.f1352m) {
            if (y.mo266b() != null) {
                this.f1343d.m2974a((azx) y);
            }
            this.f1346g.f2605s = true;
            azi a = m2959a(y, null, this.f1347h, this.f1346g.f2589c, this.f1346g.f2596j, this.f1346g.f2595i);
            y.mo265a(a);
            this.f1343d.m2975a(y, a);
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public azx<TranscodeType> m2968a(ImageView imageView) {
        baq.m4685a();
        gwb.m1404I((Object) imageView);
        if (!(this.f1346g.m4433a(2048) || !this.f1346g.f2599m || imageView.getScaleType() == null)) {
            if (this.f1346g.f2605s) {
                this.f1346g = this.f1346g.m4419a();
            }
            switch (amt.f1354a[imageView.getScaleType().ordinal()]) {
                case 1:
                    this.f1346g.m4423a(this.f1342c);
                    break;
                case 2:
                    this.f1346g.m4439d(this.f1342c);
                    break;
                case 3:
                case 4:
                case 5:
                    this.f1346g.m4435b(this.f1342c);
                    break;
            }
        }
        return m2969a(this.f1342c.m2915a(imageView, this.f1344e));
    }

    private amq m2957a(amq amq) {
        switch (amt.f1355b[amq.ordinal()]) {
            case 1:
                return amq.NORMAL;
            case 2:
                return amq.HIGH;
            case 3:
            case 4:
                return amq.IMMEDIATE;
            default:
                String valueOf = String.valueOf(this.f1346g.f2589c);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 18).append("unknown priority: ").append(valueOf).toString());
        }
    }

    private azi m2959a(azx<TranscodeType> azx_TranscodeType, azq azq, amy<?, ? super TranscodeType> amy____super_TranscodeType, amq amq, int i, int i2) {
        azi azq2;
        if (this.f1350k != null) {
            if (this.f1353n) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            amy<?, ? super TranscodeType> amy____super_TranscodeType2;
            amq amq2;
            int i3;
            int i4;
            azi a;
            azi a2;
            amy<?, ? super TranscodeType> amy____super_TranscodeType3 = this.f1350k.f1347h;
            if (f1340a.equals(amy____super_TranscodeType3)) {
                amy____super_TranscodeType2 = amy____super_TranscodeType;
            } else {
                amy____super_TranscodeType2 = amy____super_TranscodeType3;
            }
            if (this.f1350k.f1346g.m4433a(8)) {
                amq2 = this.f1350k.f1346g.f2589c;
            } else {
                amq2 = m2957a(amq);
            }
            int i5 = this.f1350k.f1346g.f2596j;
            int i6 = this.f1350k.f1346g.f2595i;
            if (baq.m4686a(i, i2)) {
                azh azh = this.f1350k.f1346g;
                if (!baq.m4686a(azh.f2596j, azh.f2595i)) {
                    i5 = this.f1346g.f2596j;
                    i3 = this.f1346g.f2595i;
                    i4 = i5;
                    azq2 = new azq(azq);
                    a = m2958a(azx_TranscodeType, this.f1346g, azq2, amy____super_TranscodeType, amq, i, i2);
                    this.f1353n = true;
                    a2 = this.f1350k.m2959a(azx_TranscodeType, azq2, amy____super_TranscodeType2, amq2, i4, i3);
                    this.f1353n = false;
                    azq2.m4485a(a, a2);
                    return azq2;
                }
            }
            i3 = i6;
            i4 = i5;
            azq2 = new azq(azq);
            a = m2958a(azx_TranscodeType, this.f1346g, azq2, amy____super_TranscodeType, amq, i, i2);
            this.f1353n = true;
            a2 = this.f1350k.m2959a(azx_TranscodeType, azq2, amy____super_TranscodeType2, amq2, i4, i3);
            this.f1353n = false;
            azq2.m4485a(a, a2);
            return azq2;
        } else if (this.f1351l != null) {
            azq2 = new azq(azq);
            azq2.m4485a(m2958a(azx_TranscodeType, this.f1346g, azq2, amy____super_TranscodeType, amq, i, i2), m2958a(azx_TranscodeType, this.f1346g.m4419a().m4420a(this.f1351l.floatValue()), azq2, amy____super_TranscodeType, m2957a(amq), i, i2));
            return azq2;
        } else {
            return m2958a(azx_TranscodeType, this.f1346g, azq, amy____super_TranscodeType, amq, i, i2);
        }
    }

    private azi m2958a(azx<TranscodeType> azx_TranscodeType, azh<?> azh_, azj azj, amy<?, ? super TranscodeType> amy____super_TranscodeType, amq amq, int i, int i2) {
        azh_.f2605s = true;
        amk amk = this.f1342c;
        Object obj = this.f1348i;
        Class cls = this.f1344e;
        azk azk = this.f1349j;
        apw b = this.f1342c.m2916b();
        bad bad = amy____super_TranscodeType.f1376a;
        azi azi = (azn) azn.f2611a.mo436a();
        if (azi == null) {
            azi = new azn();
        }
        azi.f2613c = amk;
        azi.f2614d = obj;
        azi.f2615e = cls;
        azi.f2616f = azh_;
        azi.f2617g = i;
        azi.f2618h = i2;
        azi.f2619i = amq;
        azi.f2620j = azx_TranscodeType;
        azi.f2621k = azk;
        azi.f2612b = azj;
        azi.f2622l = b;
        azi.f2623m = bad;
        azi.f2624n = azp.f2635a;
        return azi;
    }
}
