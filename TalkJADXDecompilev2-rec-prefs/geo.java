package p000;

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

final class geo implements gcd {
    private static gep f15066o = new gep();
    private final Context f15067a;
    private final String f15068b;
    private final String f15069c;
    private final String f15070d;
    private final boolean f15071e;
    private final ikh f15072f;
    private final iim f15073g;
    private final geq f15074h;
    private final gen f15075i;
    private Uri f15076j;
    private long f15077k = -1;
    private long f15078l = -1;
    private long f15079m = -1;
    private gcw f15080n;

    geo(Context context, String str, Uri uri, String str2, String str3, boolean z) {
        this.f15067a = context;
        this.f15068b = str;
        this.f15076j = uri;
        this.f15070d = str2;
        this.f15071e = z;
        iub iub = new iub();
        this.f15069c = iub.m23296a();
        if (str3 == null) {
            iub = new iub();
            str3 = iub.m23296a();
        }
        this.f15074h = new geq(str3, this.f15069c);
        this.f15072f = new ikh(this.f15074h);
        this.f15072f.m22156a();
        this.f15073g = new iim(context);
        this.f15075i = new gen(context);
    }

    void m17402a(Uri uri) {
        this.f15076j = uri;
    }

    void m17401a(int i) {
        this.f15072f.m22164b(i);
    }

    void m17405a(gcw gcw) {
        this.f15080n = gcw;
    }

    String m17400a() {
        return this.f15069c;
    }

    long m17406b() {
        if (this.f15078l == -1) {
            return -1;
        }
        long j = this.f15079m;
        if (j == -1) {
            j = glj.m17963b();
        }
        return j - this.f15078l;
    }

    public void mo2188a(gcc gcc, int i) {
        if (gcc.mo2206a() != null) {
            this.f15072f.m22157a(gcc.mo2206a().m16961h().m17121c());
        }
        switch (i) {
            case 1:
            case 3:
                if (this.f15078l == -1) {
                    this.f15077k = System.currentTimeMillis();
                    this.f15078l = glj.m17963b();
                }
                if (i == 3) {
                    this.f15072f.m22166c();
                }
                m17399b(gcc.mo2220d());
                return;
            case 2:
                this.f15072f.m22166c();
                m17399b(gcc.mo2220d());
                return;
            case 4:
                this.f15074h.m17412a(true);
                this.f15072f.m22163b();
                m17399b(gcc.mo2220d());
                return;
            default:
                return;
        }
    }

    public void mo2189a(gcc gcc, DisconnectCause disconnectCause) {
        if (this.f15079m == -1) {
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
            this.f15079m = glj.m17963b();
            m17399b(gcc.mo2220d());
            bko e = fde.m15018e(ggc.m17608a(this.f15067a).m17618b());
            if (e != null) {
                if (e.m5638g() == ggc.m17608a(this.f15067a).m17630f()) {
                    z = true;
                } else if (this.f15068b != null) {
                    z = true;
                }
                if (z) {
                    f = glq.m18025f(gwb.m1400H());
                    a = gcc.mo2206a();
                    if (a == null) {
                        extractNetworkPortion = PhoneNumberUtils.extractNetworkPortion(glq.m18026f(gwb.m1400H(), a.m16959f().m17141c()));
                    } else {
                        extractNetworkPortion = "";
                    }
                    if (this.f15068b != null) {
                        this.f15072f.m22158a(1, this.f15068b);
                    }
                    if (this.f15071e) {
                        i = 103;
                    } else {
                        i = 104;
                    }
                    a2 = this.f15072f.m22155a(this.f15067a, i, 1, this.f15077k, this.f15069c).m22175a(fde.m15023g(e.m5638g()));
                    schemeSpecificPart = this.f15076j != null ? "unknown" : this.f15076j.getSchemeSpecificPart();
                    au = this.f15070d != null ? gwb.au() : this.f15070d;
                    a3 = a2.m22180b(String.format("%s/%s", new Object[]{schemeSpecificPart, au})).m22178a(this.f15074h.m17413a(), gwb.m2336r(disconnectCause.getCode()), 0).m22176a(f, extractNetworkPortion, disconnectCause.getReason()).m22177a(true).m22179a();
                    iil.m21869a(Integer.valueOf(a3.size()), Integer.valueOf(1));
                    mav = (mav) a3.get(0);
                    if (this.f15080n != null) {
                        mav.f27171n = new String[]{this.f15080n.m16992a()};
                    }
                    if (mav.f27163f == null) {
                        au = this.f15069c;
                        j = this.f15077k;
                        j2 = this.f15078l;
                        lko = new lko();
                        lko.f25158a = au;
                        simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        lko.f25159b = simpleDateFormat.format(Long.valueOf(j));
                        lko.f25160c = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(glj.m17963b() - j2));
                        mav.f27163f = lko;
                    }
                    mav.f27163f.f25166i = this.f15075i.m17199a();
                    f15066o.m17407a(e, this.f15069c, mav);
                }
            }
            z = false;
            if (z) {
                f = glq.m18025f(gwb.m1400H());
                a = gcc.mo2206a();
                if (a == null) {
                    extractNetworkPortion = "";
                } else {
                    extractNetworkPortion = PhoneNumberUtils.extractNetworkPortion(glq.m18026f(gwb.m1400H(), a.m16959f().m17141c()));
                }
                if (this.f15068b != null) {
                    this.f15072f.m22158a(1, this.f15068b);
                }
                if (this.f15071e) {
                    i = 103;
                } else {
                    i = 104;
                }
                a2 = this.f15072f.m22155a(this.f15067a, i, 1, this.f15077k, this.f15069c).m22175a(fde.m15023g(e.m5638g()));
                if (this.f15076j != null) {
                }
                if (this.f15070d != null) {
                }
                a3 = a2.m22180b(String.format("%s/%s", new Object[]{schemeSpecificPart, au})).m22178a(this.f15074h.m17413a(), gwb.m2336r(disconnectCause.getCode()), 0).m22176a(f, extractNetworkPortion, disconnectCause.getReason()).m22177a(true).m22179a();
                iil.m21869a(Integer.valueOf(a3.size()), Integer.valueOf(1));
                mav = (mav) a3.get(0);
                if (this.f15080n != null) {
                    mav.f27171n = new String[]{this.f15080n.m16992a()};
                }
                if (mav.f27163f == null) {
                    au = this.f15069c;
                    j = this.f15077k;
                    j2 = this.f15078l;
                    lko = new lko();
                    lko.f25158a = au;
                    simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                    lko.f25159b = simpleDateFormat.format(Long.valueOf(j));
                    lko.f25160c = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(glj.m17963b() - j2));
                    mav.f27163f = lko;
                }
                mav.f27163f.f25166i = this.f15075i.m17199a();
                f15066o.m17407a(e, this.f15069c, mav);
            }
        }
        this.f15075i.m17200b();
    }

    private void m17399b(int i) {
        int i2 = 1;
        Stats connectionInfoStats = new ConnectionInfoStats(1, "", "", "", "", "", "", 0, 0, 0, 0, 0, 0);
        iim iim = this.f15073g;
        if (i != 2) {
            i2 = 0;
        }
        connectionInfoStats.setMediaNetworkType(iim.m21886b(i2));
        this.f15072f.m22159a(connectionInfoStats);
    }
}
