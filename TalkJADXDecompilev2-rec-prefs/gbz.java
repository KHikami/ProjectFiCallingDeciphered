package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class gbz extends Binder implements gby {
    public final int f14631a;
    public final Context f14632b;

    public gbz() {
        attachInterface(this, "com.google.android.apps.hangouts.telephony.ITeleHangoutsService");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ITeleHangoutsService");
                mo2181a();
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ITeleHangoutsService");
                Bundle a = mo2182a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(1);
                a.writeToParcel(parcel2, 1);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.apps.hangouts.telephony.ITeleHangoutsService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    public gbz(Context context, int i) {
        this();
        this.f14632b = context;
        this.f14631a = i;
    }

    public Bundle mo2182a(String str) {
        gwb.m1453T(this.f14632b);
        Bundle bundle = new Bundle();
        String c = glq.m18012c(gwb.m1400H(), str);
        if (c == null) {
            glk.m17982e("Babel_telephony", "TeleHangoutsService.getCallRate, invalid number", new Object[0]);
            bundle.putBoolean("invalid_number", true);
        } else {
            try {
                exc b = m16882b(c);
                if (b == null) {
                    glk.m17982e("Babel_telephony", "TeleHangoutsService.getCallRate, no call rate response", new Object[0]);
                    bundle.putBoolean("no_response", true);
                } else {
                    bundle.putBoolean("is_free", b.m14738l());
                    bundle.putBoolean("does_rate_expire", b.m14740n());
                    bundle.putInt("rate_ttl_ms", b.m14739m());
                    bundle.putString("country_display", glq.m18031g(c));
                    CharSequence k = b.m14737k();
                    if (!(b.m14738l() || TextUtils.isEmpty(k))) {
                        bundle.putString("rate_display", this.f14632b.getString(gwb.vO, new Object[]{k}));
                        bundle.putString("rate_display_description", this.f14632b.getString(gwb.vP, new Object[]{k}));
                    }
                }
            } catch (Throwable e) {
                glk.m17980d("Babel_telephony", "TeleHangoutsService.getCallRate, timed out while making request", e);
                bundle.putBoolean("request_timeout", true);
            } catch (Throwable e2) {
                glk.m17980d("Babel_telephony", "TeleHangoutsService.getCallRate, interrupted while making request", e2);
                bundle.putBoolean("request_timeout", true);
            }
        }
        return bundle;
    }

    public int mo2181a() {
        gwb.m1453T(this.f14632b);
        return 1;
    }

    public exc m16882b(String str) {
        iil.m21876b();
        Semaphore semaphore = new Semaphore(0);
        exc[] excArr = new exc[1];
        fme a = ((fmf) jyn.m25426a(this.f14632b, fmf.class)).mo2035a();
        int a2 = a.m15674a();
        RealTimeChatService.m9101d(a, this.f14631a, str);
        fip ggj = new ggj(this, a2, excArr, semaphore);
        try {
            RealTimeChatService.m9040a(ggj);
            if (semaphore.tryAcquire(gwb.m1519a(this.f14632b, "babel_telephony_call_rate_lookup_timeout_ms", 10000), TimeUnit.MILLISECONDS)) {
                exc exc = excArr[0];
                return exc;
            }
            glk.m17982e("Babel_telephony", "TeleHangoutsService.getCallRateResponseBlocking, timeout reached", new Object[0]);
            throw new ggi();
        } finally {
            RealTimeChatService.m9077b(ggj);
        }
    }
}
