package p000;

import com.google.android.apps.hangouts.views.OverlayedAvatarView;
import com.google.android.apps.hangouts.views.ParticipantsGalleryView;

public final class gqk implements Runnable {
    final /* synthetic */ OverlayedAvatarView f15912a;
    final /* synthetic */ edk f15913b;
    final /* synthetic */ gql f15914c;
    final /* synthetic */ int f15915d;
    final /* synthetic */ int f15916e;
    final /* synthetic */ ParticipantsGalleryView f15917f;

    public gqk(ParticipantsGalleryView participantsGalleryView, OverlayedAvatarView overlayedAvatarView, edk edk, gql gql, int i, int i2) {
        this.f15917f = participantsGalleryView;
        this.f15912a = overlayedAvatarView;
        this.f15913b = edk;
        this.f15914c = gql;
        this.f15915d = i;
        this.f15916e = i2;
    }

    public void run() {
        int c = this.f15912a.m9553c();
        this.f15912a.m9560f(0);
        if (c != 0) {
            this.f15912a.m9557e(c);
            this.f15917f.m9572a(this.f15912a, this.f15917f.m9584b(c), c, this.f15913b.f11216e, this.f15913b.f11219h);
        } else {
            synchronized (this.f15917f.f7164e) {
                this.f15917f.f7164e.remove(this.f15913b.f11213b);
            }
            this.f15917f.m9569a();
        }
        this.f15917f.m9598e(this.f15913b);
        this.f15914c.m18310a(true);
        if (ParticipantsGalleryView.f7160a) {
            ParticipantsGalleryView participantsGalleryView = this.f15917f;
            OverlayedAvatarView overlayedAvatarView = this.f15912a;
            int i = this.f15915d;
            participantsGalleryView.m9579a(null, overlayedAvatarView, "Move (end) " + i + " -> " + this.f15916e + "(actual " + c + ")");
        }
    }
}
