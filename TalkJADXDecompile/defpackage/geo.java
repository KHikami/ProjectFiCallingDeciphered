package defpackage;

import android.content.Context;
import android.net.Uri;
import android.telecom.DisconnectCause;
import android.telephony.PhoneNumberUtils;
import com.google.android.libraries.hangouts.video.internal.Stats;
import com.google.android.libraries.hangouts.video.internal.Stats.ConnectionInfoStats;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: geo */
final class geo implements gcd {
    private static gep o;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final ikh f;
    private final iim g;
    private final geq h;
    private final gen i;
    private Uri j;
    private long k;
    private long l;
    private long m;
    private gcw n;

    static {
        o = new gep();
    }

    geo(Context context, String str, Uri uri, String str2, String str3, boolean z) {
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.a = context;
        this.b = str;
        this.j = uri;
        this.d = str2;
        this.e = z;
        iub iub = new iub();
        this.c = iub.a();
        if (str3 == null) {
            iub = new iub();
            str3 = iub.a();
        }
        this.h = new geq(str3, this.c);
        this.f = new ikh(this.h);
        this.f.a();
        this.g = new iim(context);
        this.i = new gen(context);
    }

    void a(Uri uri) {
        this.j = uri;
    }

    void a(int i) {
        this.f.b(i);
    }

    void a(gcw gcw) {
        this.n = gcw;
    }

    String a() {
        return this.c;
    }

    long b() {
        if (this.l == -1) {
            return -1;
        }
        long j = this.m;
        if (j == -1) {
            j = glj.b();
        }
        return j - this.l;
    }

    public void a(gcc gcc, int i) {
        if (gcc.a() != null) {
            this.f.a(gcc.a().h().c());
        }
        switch (i) {
            case wi.j /*1*/:
            case wi.z /*3*/:
                if (this.l == -1) {
                    this.k = System.currentTimeMillis();
                    this.l = glj.b();
                }
                if (i == 3) {
                    this.f.c();
                }
                b(gcc.d());
            case wi.l /*2*/:
                this.f.c();
                b(gcc.d());
            case wi.h /*4*/:
                this.h.a(true);
                this.f.b();
                b(gcc.d());
            default:
        }
    }

    public void a(gcc gcc, DisconnectCause disconnectCause) {
        if (this.m == -1) {
            boolean z;
            String f;
            gcq a;
            String extractNetworkPortion;
            int i;
            iki a2;
            String schemeSpecificPart;
            String au;
            List a3;
            mav mav;
            long j;
            long j2;
            lko lko;
            SimpleDateFormat simpleDateFormat;
            this.m = glj.b();
            b(gcc.d());
            bko e = fde.e(ggc.a(this.a).b());
            if (e != null) {
                if (e.g() == ggc.a(this.a).f()) {
                    z = true;
                } else if (this.b != null) {
                    z = true;
                }
                if (z) {
                    f = glq.f(gwb.H());
                    a = gcc.a();
                    if (a == null) {
                        extractNetworkPortion = PhoneNumberUtils.extractNetworkPortion(glq.f(gwb.H(), a.f().c()));
                    } else {
                        extractNetworkPortion = "";
                    }
                    if (this.b != null) {
                        this.f.a(1, this.b);
                    }
                    if (this.e) {
                        i = 103;
                    } else {
                        i = 104;
                    }
                    a2 = this.f.a(this.a, i, 1, this.k, this.c).a(fde.g(e.g()));
                    schemeSpecificPart = this.j != null ? "unknown" : this.j.getSchemeSpecificPart();
                    au = this.d != null ? gwb.au() : this.d;
                    a3 = a2.b(String.format("%s/%s", new Object[]{schemeSpecificPart, au})).a(this.h.a(), gwb.r(disconnectCause.getCode()), 0).a(f, extractNetworkPortion, disconnectCause.getReason()).a(true).a();
                    iil.a(Integer.valueOf(a3.size()), Integer.valueOf(1));
                    mav = (mav) a3.get(0);
                    if (this.n != null) {
                        mav.n = new String[]{this.n.a()};
                    }
                    if (mav.f == null) {
                        au = this.c;
                        j = this.k;
                        j2 = this.l;
                        lko = new lko();
                        lko.a = au;
                        simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        lko.b = simpleDateFormat.format(Long.valueOf(j));
                        lko.c = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(glj.b() - j2));
                        mav.f = lko;
                    }
                    mav.f.i = this.i.a();
                    o.a(e, this.c, mav);
                }
            }
            z = false;
            if (z) {
                f = glq.f(gwb.H());
                a = gcc.a();
                if (a == null) {
                    extractNetworkPortion = "";
                } else {
                    extractNetworkPortion = PhoneNumberUtils.extractNetworkPortion(glq.f(gwb.H(), a.f().c()));
                }
                if (this.b != null) {
                    this.f.a(1, this.b);
                }
                if (this.e) {
                    i = 103;
                } else {
                    i = 104;
                }
                a2 = this.f.a(this.a, i, 1, this.k, this.c).a(fde.g(e.g()));
                if (this.j != null) {
                }
                if (this.d != null) {
                }
                a3 = a2.b(String.format("%s/%s", new Object[]{schemeSpecificPart, au})).a(this.h.a(), gwb.r(disconnectCause.getCode()), 0).a(f, extractNetworkPortion, disconnectCause.getReason()).a(true).a();
                iil.a(Integer.valueOf(a3.size()), Integer.valueOf(1));
                mav = (mav) a3.get(0);
                if (this.n != null) {
                    mav.n = new String[]{this.n.a()};
                }
                if (mav.f == null) {
                    au = this.c;
                    j = this.k;
                    j2 = this.l;
                    lko = new lko();
                    lko.a = au;
                    simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                    lko.b = simpleDateFormat.format(Long.valueOf(j));
                    lko.c = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(glj.b() - j2));
                    mav.f = lko;
                }
                mav.f.i = this.i.a();
                o.a(e, this.c, mav);
            }
        }
        this.i.b();
    }

    private void b(int i) {
        int i2 = 1;
        Stats connectionInfoStats = new ConnectionInfoStats(1, "", "", "", "", "", "", 0, 0, 0, 0, 0, 0);
        iim iim = this.g;
        if (i != 2) {
            i2 = 0;
        }
        connectionInfoStats.setMediaNetworkType(iim.b(i2));
        this.f.a(connectionInfoStats);
    }
}
