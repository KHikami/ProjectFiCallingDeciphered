package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ConcurrentHashMap;

public final class fmt implements fmk {
    glf<Integer> f13476a = new glf();
    ConcurrentHashMap<Integer, mfb<Intent, Long>> f13477b = new ConcurrentHashMap();

    fmt() {
    }

    public ComponentName mo2037a(Context context, Intent intent, mfa<Intent> mfa_android_content_Intent) {
        if (mfa_android_content_Intent.mo3733a()) {
            Intent intent2 = (Intent) mfa_android_content_Intent.mo3734b();
            bm.m6137a(intent2.hasExtra("android.support.content.wakelockid"));
            bm.m6137a(!intent2.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK"));
            intent.putExtra("EXTRA_INTENT_HOLDING_WAKELOCK", intent2);
            this.f13476a.m17950a(Integer.valueOf(intent2.getIntExtra("android.support.content.wakelockid", -1)));
            m15682a(intent2, true);
        }
        return context.startService(intent);
    }

    public void mo2038a(fmj fmj, Intent intent) {
        mfa b;
        boolean z = true;
        if (intent == null) {
            fmj.mo1136a(null, mdv.f27537a);
            return;
        }
        if (intent.hasExtra("android.support.content.wakelockid")) {
            if (intent.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK")) {
                z = false;
            }
            bm.m6138a(z, (Object) "Intent was both holding a wakelock and contained an extra intent holding a wakelock");
            b = mfa.m31910b(intent);
        } else {
            b = intent.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK") ? mfa.m31910b((Intent) intent.getParcelableExtra("EXTRA_INTENT_HOLDING_WAKELOCK")) : mdv.f27537a;
        }
        try {
            if (b.mo3733a()) {
                this.f13476a.m17951b(Integer.valueOf(((Intent) b.mo3734b()).getIntExtra("android.support.content.wakelockid", -1)));
                m15682a((Intent) b.mo3734b(), true);
            }
            intent.removeExtra("EXTRA_INTENT_HOLDING_WAKELOCK");
            fmj.mo1136a(intent, b);
        } finally {
            m15683a(b);
        }
    }

    private void m15683a(mfa<Intent> mfa_android_content_Intent) {
        if (mfa_android_content_Intent.mo3733a() && this.f13476a.m17952c(Integer.valueOf(((Intent) mfa_android_content_Intent.mo3734b()).getIntExtra("android.support.content.wakelockid", -1)))) {
            iw.m8984a((Intent) mfa_android_content_Intent.mo3734b());
            m15682a((Intent) mfa_android_content_Intent.mo3734b(), false);
        }
    }

    private void m15682a(Intent intent, boolean z) {
        if (gld.m17936a()) {
            int intExtra = intent.getIntExtra("android.support.content.wakelockid", -1);
            if (z) {
                this.f13477b.putIfAbsent(Integer.valueOf(intExtra), mfb.m31979a(intent, Long.valueOf(glj.m17963b())));
            } else {
                this.f13477b.remove(Integer.valueOf(intExtra));
            }
        }
    }
}
