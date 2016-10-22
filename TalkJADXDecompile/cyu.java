import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cyu extends czj<etp, eyp> {
    private final dw d;
    private final bko e;
    private final String f;
    private final String g;
    private final String h;
    private final boolean i;

    public cyu(dw dwVar, bko bko, String str, String str2, String str3, boolean z) {
        this.d = dwVar;
        this.e = bko;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = z;
    }

    public String a() {
        return this.d.getResources().getString(bc.E, new Object[]{gld.d(this.f)});
    }

    public void a(fme fme) {
        RealTimeChatService.a(fme, this.e.g(), this.g, this.h, this.f, true, true);
    }

    public void b() {
        Toast.makeText(this.d, this.d.getString(czj.i() ? bc.C : bc.D, new Object[]{this.f}), 0).show();
    }

    public void c() {
        if (this.i) {
            this.d.setResult(1);
            this.d.finish();
        }
    }

    public Class<etp> d() {
        return etp.class;
    }

    public Class<eyp> e() {
        return eyp.class;
    }
}
