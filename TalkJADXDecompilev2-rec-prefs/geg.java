package p000;

import android.os.Handler;
import android.telecom.DisconnectCause;
import android.telephony.PhoneNumberUtils;
import java.lang.reflect.Method;

final class geg implements gcd {
    private final gcc f14847a;
    private final Handler f14848b = new Handler();
    private int f14849c;
    private int f14850d = 0;
    private final Runnable f14851e = new geh(this);

    geg(gcc gcc) {
        this.f14847a = gcc;
    }

    public void mo2188a(gcc gcc, int i) {
        if (i == 4 && this.f14850d == 0) {
            this.f14850d = 1;
            m17158a();
        }
    }

    public void mo2189a(gcc gcc, DisconnectCause disconnectCause) {
        m17157b();
    }

    void m17161a(boolean z) {
        if (this.f14850d != 2) {
            return;
        }
        if (z) {
            this.f14850d = 1;
            m17158a();
            return;
        }
        m17157b();
    }

    void m17158a() {
        String str;
        gcq a = this.f14847a.mo2206a();
        if (a == null || a.getState() != 4) {
            str = null;
        } else {
            str = a.m16959f().m17145g();
        }
        if (str == null || this.f14849c >= str.length()) {
            m17157b();
            return;
        }
        Method declaredMethod;
        char charAt = str.charAt(this.f14849c);
        String str2 = "Babel_telephony";
        String str3 = "TelePostDialHelper.processNextCharacter, processing: ";
        String valueOf = String.valueOf(glk.m17974b(String.valueOf(charAt)));
        glk.m17979c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        this.f14849c++;
        if (PhoneNumberUtils.is12Key(charAt)) {
            this.f14847a.mo2207a(charAt);
            m17156a((long) did.m11927L());
        } else if (charAt == ',') {
            m17156a(3000);
        } else if (charAt == ';') {
            a.setPostDialWait(str.substring(this.f14849c));
            this.f14850d = 2;
        } else {
            m17156a(0);
        }
        try {
            declaredMethod = a.getClass().getDeclaredMethod("setNextPostDialWaitChar", new Class[]{Character.TYPE});
        } catch (NoSuchMethodException e) {
            declaredMethod = a.getClass().getDeclaredMethod("setNextPostDialChar", new Class[]{Character.TYPE});
        }
        if (declaredMethod != null) {
            try {
                declaredMethod.invoke(a, new Object[]{Character.valueOf(charAt)});
            } catch (Exception e2) {
                valueOf = String.valueOf(e2);
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 58).append("setNextPostDialCharacter, calling setNextPostDial failed: ").append(valueOf).toString(), new Object[0]);
            }
        }
    }

    private void m17156a(long j) {
        this.f14848b.postDelayed(this.f14851e, j);
    }

    private void m17157b() {
        this.f14850d = 3;
        this.f14848b.removeCallbacksAndMessages(null);
    }
}
