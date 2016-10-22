import android.content.Context;
import java.util.concurrent.TimeUnit;

public class evk extends esw {
    private static final long serialVersionUID = 1;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;

    public evk(String str, boolean z, int i, boolean z2) {
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = true;
    }

    public nzf a(String str, int i, int i2) {
        nzf lvc = new lvc();
        lvc.requestHeader = euk.a(str, i, i2, this.i);
        lvc.b = this.c;
        lvc.a = Boolean.valueOf(this.d);
        lvc.c = Integer.valueOf(this.e);
        lvc.d = Boolean.valueOf(this.f);
        return lvc;
    }

    public String g() {
        return "clients/setactiveclient";
    }

    public long b() {
        return TimeUnit.SECONDS.toMillis(120);
    }

    public void a(Context context, bko bko, fdo fdo) {
        String str = "BabelClient";
        String str2 = "SetActiveClientPeriodicTask failed: ";
        String valueOf = String.valueOf(glk.b(bko.a()));
        glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        if (fdo.c() == 111) {
            ((fnc) jyn.a(context, fnc.class)).a(bko.g());
        }
    }

    public String K_() {
        return "background_queue";
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        return true;
    }

    public boolean a(int i) {
        return true;
    }
}
