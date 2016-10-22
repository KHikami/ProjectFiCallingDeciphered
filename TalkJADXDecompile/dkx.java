import android.content.res.Configuration;
import android.text.TextUtils;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;

public final class dkx extends dkf {
    private final dkj p;
    private final dky q;
    private boolean r;

    public dkx(djd djd, itl itl, ParticipantTrayView participantTrayView, FocusedParticipantView focusedParticipantView) {
        boolean z = true;
        super(djd, itl, participantTrayView, focusedParticipantView);
        this.p = new dkj(this);
        this.q = new dky(this);
        a(getResources().getString(bc.fk));
        if (getResources().getConfiguration().orientation != 1) {
            z = false;
        }
        this.r = z;
    }

    public void a(dhu dhu) {
        int i;
        super.a(dhu);
        this.b.a(this.p);
        n();
        iry l = this.b.l();
        if (l == null || !l.g()) {
            i = 1;
        } else {
            i = 3;
        }
        d(i);
    }

    public void y_() {
        iry l = this.b.l();
        if (l != null) {
            l.b(this.q);
        }
        this.b.b(this.p);
    }

    public void c() {
        this.b.b(this.p);
        super.c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = new Object[]{Boolean.valueOf(this.r), Boolean.valueOf(configuration.orientation == 1)};
        this.r = configuration.orientation == 1;
        super.onConfigurationChanged(configuration);
    }

    protected int c(int i) {
        int i2;
        iry l = this.b.l();
        if (l != null) {
            i2 = (int) ((((float) l.i()) / ((float) l.j())) * ((float) i));
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            iuc iuc;
            iuc iuc2 = new iuc(16, 10);
            if (this.r) {
                iuc = new iuc(iuc2.b, iuc2.a);
            } else {
                iuc = iuc2;
            }
            i2 = (int) ((((float) iuc.a) / ((float) iuc.b)) * ((float) i));
        }
        Object[] objArr = new Object[]{Integer.valueOf(i2), Integer.valueOf(i)};
        return i2;
    }

    protected void d(int i) {
        super.d(i);
        if (this.m == null && i == 1) {
            Object p = this.c.a().p();
            if (!TextUtils.isEmpty(p)) {
                c((String) p);
            }
        }
    }

    protected String m() {
        return "localParticipant";
    }

    public void n() {
        iry l = this.b.l();
        if (l != null) {
            l.b(this.q);
            l.a(this.q);
        }
    }
}
