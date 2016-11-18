package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.elane.FilmstripParticipantView;

public final class ctb implements OnClickListener {
    final /* synthetic */ FilmstripParticipantView a;

    public ctb(FilmstripParticipantView filmstripParticipantView) {
        this.a = filmstripParticipantView;
    }

    public void onClick(View view) {
        if (TextUtils.equals(this.a.b, this.a.d.c())) {
            this.a.d.a(null);
        } else {
            this.a.d.a(this.a.b);
        }
    }
}
