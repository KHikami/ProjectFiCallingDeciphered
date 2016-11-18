package p000;

import com.google.android.apps.hangouts.elane.FilmstripParticipantView;
import com.google.android.apps.hangouts.elane.FilmstripViewController;

public final class cte extends cvm {
    final /* synthetic */ FilmstripViewController f9024a;

    public cte(FilmstripViewController filmstripViewController) {
        this.f9024a = filmstripViewController;
    }

    public void mo1387a(lym lym) {
        this.f9024a.m8410a(lym);
    }

    public void mo1388b(lym lym) {
        ctf ctf = this.f9024a.f6161a;
        String str = lym.f26907b;
        FilmstripParticipantView filmstripParticipantView = (FilmstripParticipantView) ctf.f9025a.get(str);
        if (filmstripParticipantView != null) {
            ctf.f9025a.remove(str);
            filmstripParticipantView.m8395a(new ctg(ctf, filmstripParticipantView));
            ctf.f9027c.m8408a();
        }
    }
}
