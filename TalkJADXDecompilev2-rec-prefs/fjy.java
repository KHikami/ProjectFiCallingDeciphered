package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public abstract class fjy<W extends fok> implements ead {
    private static final gma f5719c = gma.m18073a("BabelClient");
    public final W f5720a;
    public transient euj f5721b;

    public abstract euj mo1013a(Context context, int i, int i2);

    public abstract void mo1014a(Context context, int i, fdo fdo);

    public fjy(W w) {
        this.f5720a = w;
    }

    public void mo1007a(Context context, eaf eaf) {
        this.f5721b = mo1013a(context, eaf.m13268b(), eaf.m13270d());
        this.f5721b.m8108f();
        gma gma = f5719c;
        String valueOf = String.valueOf(this.f5720a.getClass().getSimpleName());
        gma.m18079c(new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append("_").append(this.f5720a.L_()).toString());
    }

    public void a_(Context context, int i, fdo fdo) {
        bko e = fde.m15018e(i);
        if (e != null) {
            mo1014a(context, i, fdo);
            RealTimeChatService.m9016a(e, this.f5720a, fdo);
        } else if (glk.m17973a("Babel_ServerOpNetReq", 3)) {
            glk.m17970a("Babel_ServerOpNetReq", "Skipping request failure for invalid account: " + i, new Object[0]);
        }
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return fjy.m8000a(context, eaf, fdo.m15084c());
    }

    public static boolean m8000a(Context context, eaf eaf, int i) {
        biw biw = (biw) jyn.m25426a(context, biw.class);
        int a = biw.mo560a("babel_max_unexpected_error_retries", 2);
        int a2 = biw.mo560a("babel_max_upload_error_retries", 10);
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
                return eaf.m13270d() < a;
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
                return eaf.m13269c() < a2;
            case 139:
                return false;
            default:
                glk.m17981d("Babel_ServerOpNetReq", "Default no retry on BabelClientError: " + i, new Object[0]);
                return false;
        }
    }

    public final String toString() {
        String str = "ServerOperationNetworkRequest ";
        String valueOf = String.valueOf(this.f5720a.toString());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public W m8007g() {
        return this.f5720a;
    }

    public void mo1011f() {
        if (this.f5721b != null) {
            this.f5721b.m8070h();
        }
    }

    public List<bhc> mo1010e() {
        return null;
    }
}
