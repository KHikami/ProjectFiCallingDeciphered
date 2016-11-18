package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.apps.hangouts.views.AvatarView;

public final class gnc extends azv<Bitmap> {
    final /* synthetic */ AvatarView f15695a;

    public gnc(AvatarView avatarView) {
        this.f15695a = avatarView;
    }

    public /* bridge */ /* synthetic */ void mo264a(Object obj, bac bac) {
        m18151a((Bitmap) obj);
    }

    public void mo432b(Drawable drawable) {
        boolean z = AvatarView.f6845a;
        this.f15695a.m9232a(this.f15695a.f6846b);
    }

    public void mo267d(Drawable drawable) {
        boolean z = AvatarView.f6845a;
        this.f15695a.m9232a(this.f15695a.f6846b);
    }

    private void m18151a(Bitmap bitmap) {
        this.f15695a.f6847c = true;
        this.f15695a.m9232a(bitmap);
    }
}
