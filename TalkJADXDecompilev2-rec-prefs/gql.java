package p000;

import com.google.android.apps.hangouts.views.ParticipantsGalleryView;

public final class gql {
    private int f15918a = 0;
    private boolean f15919b = false;
    private final ParticipantsGalleryView f15920c;

    public gql(ParticipantsGalleryView participantsGalleryView, int i) {
        this.f15920c = participantsGalleryView;
        this.f15918a = i;
    }

    public void m18310a(boolean z) {
        boolean z2 = true;
        if (z) {
            this.f15919b = true;
        }
        int i = this.f15918a - 1;
        this.f15918a = i;
        if (i == 0) {
            boolean z3 = this.f15919b;
            ParticipantsGalleryView participantsGalleryView = this.f15920c;
            if (participantsGalleryView.f7163d != 0) {
                z2 = false;
            }
            if (z2 != participantsGalleryView.f7165f) {
                participantsGalleryView.f7165f = z2;
                if (participantsGalleryView.f7161b != null) {
                    participantsGalleryView.f7161b.mo919a(participantsGalleryView.f7165f);
                }
            }
            this.f15920c.f7166g.sendEmptyMessageDelayed(0, z3 ? (long) this.f15920c.f7162c : 0);
        }
    }
}
