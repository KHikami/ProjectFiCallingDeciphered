import com.google.android.apps.hangouts.hangout.FocusedParticipantView;

public final class dhg extends itg {
    final /* synthetic */ FocusedParticipantView a;

    public dhg(FocusedParticipantView focusedParticipantView) {
        this.a = focusedParticipantView;
        super('\u0000');
    }

    public void d(itl itl) {
        if (this.a.c != null && this.a.c.a().equals(itl.a())) {
            this.a.c = itl;
            this.a.b();
        }
    }

    public void a(int i, String str) {
        if (this.a.d != null && this.a.c != null && this.a.c.a().equals(str)) {
            dpb dpb = this.a.d;
            if (this.a.c.d() && this.a.c.f()) {
                i = 0;
            }
            dpb.a(i);
        }
    }

    public void a(boolean z) {
        this.a.c();
    }
}
