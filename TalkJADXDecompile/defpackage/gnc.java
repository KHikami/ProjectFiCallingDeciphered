package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.apps.hangouts.views.AvatarView;

/* renamed from: gnc */
public final class gnc extends azv<Bitmap> {
    final /* synthetic */ AvatarView a;

    public gnc(AvatarView avatarView) {
        this.a = avatarView;
    }

    public /* bridge */ /* synthetic */ void a(Object obj, bac bac) {
        a((Bitmap) obj);
    }

    public void b(Drawable drawable) {
        boolean z = AvatarView.a;
        this.a.a(this.a.b);
    }

    public void d(Drawable drawable) {
        boolean z = AvatarView.a;
        this.a.a(this.a.b);
    }

    private void a(Bitmap bitmap) {
        this.a.c = true;
        this.a.a(bitmap);
    }
}
