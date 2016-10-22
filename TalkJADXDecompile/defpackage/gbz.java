package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: gbz */
public class gbz extends Binder implements gby {
    public final int a;
    public final Context b;

    public gbz() {
        attachInterface(this, "com.google.android.apps.hangouts.telephony.ITeleHangoutsService");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ITeleHangoutsService");
                a();
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ITeleHangoutsService");
                Bundle a = a(parcel.readString());
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
        this.b = context;
        this.a = i;
    }

    public Bundle a(String str) {
        gwb.T(this.b);
        Bundle bundle = new Bundle();
        String c = glq.c(gwb.H(), str);
        if (c == null) {
            glk.e("Babel_telephony", "TeleHangoutsService.getCallRate, invalid number", new Object[0]);
            bundle.putBoolean("invalid_number", true);
        } else {
            try {
                exc b = b(c);
                if (b == null) {
                    glk.e("Babel_telephony", "TeleHangoutsService.getCallRate, no call rate response", new Object[0]);
                    bundle.putBoolean("no_response", true);
                } else {
                    bundle.putBoolean("is_free", b.l());
                    bundle.putBoolean("does_rate_expire", b.n());
                    bundle.putInt("rate_ttl_ms", b.m());
                    bundle.putString("country_display", glq.g(c));
                    CharSequence k = b.k();
                    if (!(b.l() || TextUtils.isEmpty(k))) {
                        bundle.putString("rate_display", this.b.getString(gwb.vO, new Object[]{k}));
                        bundle.putString("rate_display_description", this.b.getString(gwb.vP, new Object[]{k}));
                    }
                }
            } catch (Throwable e) {
                glk.d("Babel_telephony", "TeleHangoutsService.getCallRate, timed out while making request", e);
                bundle.putBoolean("request_timeout", true);
            } catch (Throwable e2) {
                glk.d("Babel_telephony", "TeleHangoutsService.getCallRate, interrupted while making request", e2);
                bundle.putBoolean("request_timeout", true);
            }
        }
        return bundle;
    }

    public int a() {
        gwb.T(this.b);
        return 1;
    }

    public exc b(String str) {
        iil.b();
        Semaphore semaphore = new Semaphore(0);
        exc[] excArr = new exc[1];
        fme a = ((fmf) jyn.a(this.b, fmf.class)).a();
        int a2 = a.a();
        RealTimeChatService.d(a, this.a, str);
        fip ggj = new ggj(this, a2, excArr, semaphore);
        try {
            RealTimeChatService.a(ggj);
            if (semaphore.tryAcquire(gwb.a(this.b, "babel_telephony_call_rate_lookup_timeout_ms", 10000), TimeUnit.MILLISECONDS)) {
                exc exc = excArr[0];
                return exc;
            }
            glk.e("Babel_telephony", "TeleHangoutsService.getCallRateResponseBlocking, timeout reached", new Object[0]);
            throw new ggi();
        } finally {
            RealTimeChatService.b(ggj);
        }
    }
}
