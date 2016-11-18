package defpackage;

import android.os.Handler;
import android.telecom.DisconnectCause;
import android.telephony.PhoneNumberUtils;
import java.lang.reflect.Method;

final class geg implements gcd {
    private final gcc a;
    private final Handler b = new Handler();
    private int c;
    private int d = 0;
    private final Runnable e = new geh(this);

    geg(gcc gcc) {
        this.a = gcc;
    }

    public void a(gcc gcc, int i) {
        if (i == 4 && this.d == 0) {
            this.d = 1;
            a();
        }
    }

    public void a(gcc gcc, DisconnectCause disconnectCause) {
        b();
    }

    void a(boolean z) {
        if (this.d != 2) {
            return;
        }
        if (z) {
            this.d = 1;
            a();
            return;
        }
        b();
    }

    void a() {
        String str;
        gcq a = this.a.a();
        if (a == null || a.getState() != 4) {
            str = null;
        } else {
            str = a.f().g();
        }
        if (str == null || this.c >= str.length()) {
            b();
            return;
        }
        Method declaredMethod;
        char charAt = str.charAt(this.c);
        String str2 = "Babel_telephony";
        String str3 = "TelePostDialHelper.processNextCharacter, processing: ";
        String valueOf = String.valueOf(glk.b(String.valueOf(charAt)));
        glk.c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        this.c++;
        if (PhoneNumberUtils.is12Key(charAt)) {
            this.a.a(charAt);
            a((long) did.L());
        } else if (charAt == ',') {
            a(3000);
        } else if (charAt == ';') {
            a.setPostDialWait(str.substring(this.c));
            this.d = 2;
        } else {
            a(0);
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
                glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 58).append("setNextPostDialCharacter, calling setNextPostDial failed: ").append(valueOf).toString(), new Object[0]);
            }
        }
    }

    private void a(long j) {
        this.b.postDelayed(this.e, j);
    }

    private void b() {
        this.d = 3;
        this.b.removeCallbacksAndMessages(null);
    }
}
