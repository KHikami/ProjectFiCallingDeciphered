package p000;

import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cyu extends czj<etp, eyp> {
    private final dw f9354d;
    private final bko f9355e;
    private final String f9356f;
    private final String f9357g;
    private final String f9358h;
    private final boolean f9359i;

    public cyu(dw dwVar, bko bko, String str, String str2, String str3, boolean z) {
        this.f9354d = dwVar;
        this.f9355e = bko;
        this.f9356f = str;
        this.f9357g = str2;
        this.f9358h = str3;
        this.f9359i = z;
    }

    public String mo1479a() {
        return this.f9354d.getResources().getString(bc.f2921E, new Object[]{gld.m17947d(this.f9356f)});
    }

    public void mo1480a(fme fme) {
        RealTimeChatService.m9047a(fme, this.f9355e.m5638g(), this.f9357g, this.f9358h, this.f9356f, true, true);
    }

    public void mo1475b() {
        Toast.makeText(this.f9354d, this.f9354d.getString(czj.m11296i() ? bc.f2919C : bc.f2920D, new Object[]{this.f9356f}), 0).show();
    }

    public void mo1476c() {
        if (this.f9359i) {
            this.f9354d.setResult(1);
            this.f9354d.finish();
        }
    }

    public Class<etp> mo1481d() {
        return etp.class;
    }

    public Class<eyp> mo1482e() {
        return eyp.class;
    }
}
