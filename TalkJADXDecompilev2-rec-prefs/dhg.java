package p000;

import com.google.android.apps.hangouts.hangout.FocusedParticipantView;

public final class dhg extends itg {
    final /* synthetic */ FocusedParticipantView f9750a;

    public dhg(FocusedParticipantView focusedParticipantView) {
        this.f9750a = focusedParticipantView;
        super('\u0000');
    }

    public void mo1549d(itl itl) {
        if (this.f9750a.f6318c != null && this.f9750a.f6318c.m23229a().equals(itl.m23229a())) {
            this.f9750a.f6318c = itl;
            this.f9750a.m8557b();
        }
    }

    public void mo1439a(int i, String str) {
        if (this.f9750a.f6319d != null && this.f9750a.f6318c != null && this.f9750a.f6318c.m23229a().equals(str)) {
            dpb dpb = this.f9750a.f6319d;
            if (this.f9750a.f6318c.m23238d() && this.f9750a.f6318c.m23242f()) {
                i = 0;
            }
            dpb.mo1633a(i);
        }
    }

    public void mo1557a(boolean z) {
        this.f9750a.m8558c();
    }
}
