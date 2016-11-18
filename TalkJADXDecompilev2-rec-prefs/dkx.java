package p000;

import android.content.res.Configuration;
import android.text.TextUtils;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;

public final class dkx extends dkf {
    private final dkj f10050p = new dkj(this);
    private final dky f10051q = new dky(this);
    private boolean f10052r;

    public dkx(djd djd, itl itl, ParticipantTrayView participantTrayView, FocusedParticipantView focusedParticipantView) {
        boolean z = true;
        super(djd, itl, participantTrayView, focusedParticipantView);
        m12100a(getResources().getString(bc.fk));
        if (getResources().getConfiguration().orientation != 1) {
            z = false;
        }
        this.f10052r = z;
    }

    public void mo1110a(dhu dhu) {
        int i;
        super.mo1110a(dhu);
        this.b.m11701a(this.f10050p);
        mo1589n();
        iry l = this.b.m11720l();
        if (l == null || !l.mo1322g()) {
            i = 1;
        } else {
            i = 3;
        }
        mo1586d(i);
    }

    public void y_() {
        iry l = this.b.m11720l();
        if (l != null) {
            l.m23062b(this.f10051q);
        }
        this.b.m11705b(this.f10050p);
    }

    public void mo1585c() {
        this.b.m11705b(this.f10050p);
        super.mo1585c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = new Object[]{Boolean.valueOf(this.f10052r), Boolean.valueOf(configuration.orientation == 1)};
        this.f10052r = configuration.orientation == 1;
        super.onConfigurationChanged(configuration);
    }

    protected int mo1592c(int i) {
        int i2;
        iry l = this.b.m11720l();
        if (l != null) {
            i2 = (int) ((((float) l.m23071i()) / ((float) l.m23072j())) * ((float) i));
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            iuc iuc;
            iuc iuc2 = new iuc(16, 10);
            if (this.f10052r) {
                iuc = new iuc(iuc2.f19033b, iuc2.f19032a);
            } else {
                iuc = iuc2;
            }
            i2 = (int) ((((float) iuc.f19032a) / ((float) iuc.f19033b)) * ((float) i));
        }
        Object[] objArr = new Object[]{Integer.valueOf(i2), Integer.valueOf(i)};
        return i2;
    }

    protected void mo1586d(int i) {
        super.mo1586d(i);
        if (this.m == null && i == 1) {
            Object p = this.c.m11848a().m5647p();
            if (!TextUtils.isEmpty(p)) {
                m12107c((String) p);
            }
        }
    }

    protected String mo1588m() {
        return "localParticipant";
    }

    public void mo1589n() {
        iry l = this.b.m11720l();
        if (l != null) {
            l.m23062b(this.f10051q);
            l.m23056a(this.f10051q);
        }
    }
}
