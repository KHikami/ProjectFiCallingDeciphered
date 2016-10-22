import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public final class fov implements fqd {
    private static final long serialVersionUID = 1;
    private final List<fow> a;

    public fov(lnu lnu) {
        this.a = new ArrayList();
        for (lnv lnv : lnu.a) {
            this.a.add(new fow(lnv.a.b, gwb.a(lnv.b)));
        }
    }

    public List<fow> a() {
        return this.a;
    }

    public void a(int i, mfa<Intent> mfa_android_content_Intent) {
        fhc fhc = new fhc();
        new fdu(this).a(new blo(gwb.H(), i));
        fhc.c();
    }
}
