import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ConcurrentHashMap;

public final class fmt implements fmk {
    glf<Integer> a;
    ConcurrentHashMap<Integer, mfb<Intent, Long>> b;

    fmt() {
        this.a = new glf();
        this.b = new ConcurrentHashMap();
    }

    public ComponentName a(Context context, Intent intent, mfa<Intent> mfa_android_content_Intent) {
        if (mfa_android_content_Intent.a()) {
            Intent intent2 = (Intent) mfa_android_content_Intent.b();
            bm.a(intent2.hasExtra("android.support.content.wakelockid"));
            bm.a(!intent2.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK"));
            intent.putExtra("EXTRA_INTENT_HOLDING_WAKELOCK", intent2);
            this.a.a(Integer.valueOf(intent2.getIntExtra("android.support.content.wakelockid", -1)));
            a(intent2, true);
        }
        return context.startService(intent);
    }

    public void a(fmj fmj, Intent intent) {
        mfa b;
        boolean z = true;
        if (intent == null) {
            fmj.a(null, mdv.a);
            return;
        }
        if (intent.hasExtra("android.support.content.wakelockid")) {
            if (intent.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK")) {
                z = false;
            }
            bm.a(z, (Object) "Intent was both holding a wakelock and contained an extra intent holding a wakelock");
            b = mfa.b(intent);
        } else {
            b = intent.hasExtra("EXTRA_INTENT_HOLDING_WAKELOCK") ? mfa.b((Intent) intent.getParcelableExtra("EXTRA_INTENT_HOLDING_WAKELOCK")) : mdv.a;
        }
        try {
            if (b.a()) {
                this.a.b(Integer.valueOf(((Intent) b.b()).getIntExtra("android.support.content.wakelockid", -1)));
                a((Intent) b.b(), true);
            }
            intent.removeExtra("EXTRA_INTENT_HOLDING_WAKELOCK");
            fmj.a(intent, b);
        } finally {
            a(b);
        }
    }

    private void a(mfa<Intent> mfa_android_content_Intent) {
        if (mfa_android_content_Intent.a() && this.a.c(Integer.valueOf(((Intent) mfa_android_content_Intent.b()).getIntExtra("android.support.content.wakelockid", -1)))) {
            iw.a((Intent) mfa_android_content_Intent.b());
            a((Intent) mfa_android_content_Intent.b(), false);
        }
    }

    private void a(Intent intent, boolean z) {
        if (gld.a()) {
            int intExtra = intent.getIntExtra("android.support.content.wakelockid", -1);
            if (z) {
                this.b.putIfAbsent(Integer.valueOf(intExtra), mfb.a(intent, Long.valueOf(glj.b())));
            } else {
                this.b.remove(Integer.valueOf(intExtra));
            }
        }
    }
}
