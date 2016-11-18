package defpackage;

import com.google.android.apps.hangouts.views.OverlayedAvatarView;

public final class gqi implements Runnable {
    final /* synthetic */ OverlayedAvatarView a;

    public gqi(OverlayedAvatarView overlayedAvatarView) {
        this.a = overlayedAvatarView;
    }

    public void run() {
        this.a.b.a();
    }
}
