package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.hangouts.elane.FilmstripParticipantView;

/* renamed from: cta */
public final class cta implements cwp {
    final /* synthetic */ FilmstripParticipantView a;

    public cta(FilmstripParticipantView filmstripParticipantView) {
        this.a = filmstripParticipantView;
    }

    public void a(Bitmap bitmap) {
        ((ImageView) this.a.findViewById(gwb.oJ)).setImageBitmap(bitmap);
    }
}
