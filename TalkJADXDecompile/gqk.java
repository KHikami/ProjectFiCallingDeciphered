import com.google.android.apps.hangouts.views.OverlayedAvatarView;
import com.google.android.apps.hangouts.views.ParticipantsGalleryView;

public final class gqk implements Runnable {
    final /* synthetic */ OverlayedAvatarView a;
    final /* synthetic */ edk b;
    final /* synthetic */ gql c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ ParticipantsGalleryView f;

    public gqk(ParticipantsGalleryView participantsGalleryView, OverlayedAvatarView overlayedAvatarView, edk edk, gql gql, int i, int i2) {
        this.f = participantsGalleryView;
        this.a = overlayedAvatarView;
        this.b = edk;
        this.c = gql;
        this.d = i;
        this.e = i2;
    }

    public void run() {
        int c = this.a.c();
        this.a.f(0);
        if (c != 0) {
            this.a.e(c);
            this.f.a(this.a, this.f.b(c), c, this.b.e, this.b.h);
        } else {
            synchronized (this.f.e) {
                this.f.e.remove(this.b.b);
            }
            this.f.a();
        }
        this.f.e(this.b);
        this.c.a(true);
        if (ParticipantsGalleryView.a) {
            ParticipantsGalleryView participantsGalleryView = this.f;
            OverlayedAvatarView overlayedAvatarView = this.a;
            int i = this.d;
            participantsGalleryView.a(null, overlayedAvatarView, "Move (end) " + i + " -> " + this.e + "(actual " + c + ")");
        }
    }
}
