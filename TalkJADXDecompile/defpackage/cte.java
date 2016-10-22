package defpackage;

import com.google.android.apps.hangouts.elane.FilmstripParticipantView;
import com.google.android.apps.hangouts.elane.FilmstripViewController;

/* renamed from: cte */
public final class cte extends cvm {
    final /* synthetic */ FilmstripViewController a;

    public cte(FilmstripViewController filmstripViewController) {
        this.a = filmstripViewController;
    }

    public void a(lym lym) {
        this.a.a(lym);
    }

    public void b(lym lym) {
        ctf ctf = this.a.a;
        String str = lym.b;
        FilmstripParticipantView filmstripParticipantView = (FilmstripParticipantView) ctf.a.get(str);
        if (filmstripParticipantView != null) {
            ctf.a.remove(str);
            filmstripParticipantView.a(new ctg(ctf, filmstripParticipantView));
            ctf.c.a();
        }
    }
}
