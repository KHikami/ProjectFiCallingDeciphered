package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public abstract class fjy<W extends fok> implements ead {
    private static final gma c = gma.a("BabelClient");
    public final W a;
    public transient euj b;

    public abstract euj a(Context context, int i, int i2);

    public abstract void a(Context context, int i, fdo fdo);

    public fjy(W w) {
        this.a = w;
    }

    public void a(Context context, eaf eaf) {
        this.b = a(context, eaf.b(), eaf.d());
        this.b.f();
        gma gma = c;
        String valueOf = String.valueOf(this.a.getClass().getSimpleName());
        gma.c(new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append("_").append(this.a.L_()).toString());
    }

    public void a_(Context context, int i, fdo fdo) {
        bko e = fde.e(i);
        if (e != null) {
            a(context, i, fdo);
            RealTimeChatService.a(e, this.a, fdo);
        } else if (glk.a("Babel_ServerOpNetReq", 3)) {
            glk.a("Babel_ServerOpNetReq", "Skipping request failure for invalid account: " + i, new Object[0]);
        }
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return fjy.a(context, eaf, fdo.c());
    }

    public static boolean a(Context context, eaf eaf, int i) {
        biw biw = (biw) jyn.a(context, biw.class);
        int a = biw.a("babel_max_unexpected_error_retries", 2);
        int a2 = biw.a("babel_max_upload_error_retries", 10);
        switch (i) {
            case 100:
            case 138:
                return false;
            case 101:
            case 102:
            case 103:
                return true;
            case 104:
                return false;
            case 105:
                return true;
            case 106:
            case 107:
            case 108:
                return eaf.d() < a;
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
                return false;
            case 114:
                return false;
            case 120:
            case 121:
                return false;
            case 122:
                return eaf.c() < a2;
            case 139:
                return false;
            default:
                glk.d("Babel_ServerOpNetReq", "Default no retry on BabelClientError: " + i, new Object[0]);
                return false;
        }
    }

    public final String toString() {
        String str = "ServerOperationNetworkRequest ";
        String valueOf = String.valueOf(this.a.toString());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public W g() {
        return this.a;
    }

    public void f() {
        if (this.b != null) {
            this.b.h();
        }
    }

    public List<bhc> e() {
        return null;
    }
}
