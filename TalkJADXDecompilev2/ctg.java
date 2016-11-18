package defpackage;

import com.google.android.apps.hangouts.elane.FilmstripParticipantView;

public final class ctg implements Runnable {
    final /* synthetic */ FilmstripParticipantView a;
    final /* synthetic */ ctf b;

    public ctg(ctf ctf, FilmstripParticipantView filmstripParticipantView) {
        this.b = ctf;
        this.a = filmstripParticipantView;
    }

    public void run() {
        this.b.removeView(this.a);
        this.b.a();
    }
}
