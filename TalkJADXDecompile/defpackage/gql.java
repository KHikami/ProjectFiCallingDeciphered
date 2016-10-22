package defpackage;

import com.google.android.apps.hangouts.views.ParticipantsGalleryView;

/* renamed from: gql */
public final class gql {
    private int a;
    private boolean b;
    private final ParticipantsGalleryView c;

    public gql(ParticipantsGalleryView participantsGalleryView, int i) {
        this.a = 0;
        this.b = false;
        this.c = participantsGalleryView;
        this.a = i;
    }

    public void a(boolean z) {
        boolean z2 = true;
        if (z) {
            this.b = true;
        }
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            boolean z3 = this.b;
            ParticipantsGalleryView participantsGalleryView = this.c;
            if (participantsGalleryView.d != 0) {
                z2 = false;
            }
            if (z2 != participantsGalleryView.f) {
                participantsGalleryView.f = z2;
                if (participantsGalleryView.b != null) {
                    participantsGalleryView.b.a(participantsGalleryView.f);
                }
            }
            this.c.g.sendEmptyMessageDelayed(0, z3 ? (long) this.c.c : 0);
        }
    }
}
