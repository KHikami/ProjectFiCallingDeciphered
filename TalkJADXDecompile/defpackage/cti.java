package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.hangouts.elane.FocusedParticipantAvatarView;

/* renamed from: cti */
public final class cti implements cwp {
    final /* synthetic */ FocusedParticipantAvatarView a;

    public cti(FocusedParticipantAvatarView focusedParticipantAvatarView) {
        this.a = focusedParticipantAvatarView;
    }

    public void a(Bitmap bitmap) {
        this.a.b.setImageBitmap(gkd.a(bitmap));
    }
}
