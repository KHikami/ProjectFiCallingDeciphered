package p000;

import com.google.android.apps.hangouts.elane.FilmstripParticipantView;

public final class ctg implements Runnable {
    final /* synthetic */ FilmstripParticipantView f9029a;
    final /* synthetic */ ctf f9030b;

    public ctg(ctf ctf, FilmstripParticipantView filmstripParticipantView) {
        this.f9030b = ctf;
        this.f9029a = filmstripParticipantView;
    }

    public void run() {
        this.f9030b.removeView(this.f9029a);
        this.f9030b.m10934a();
    }
}
