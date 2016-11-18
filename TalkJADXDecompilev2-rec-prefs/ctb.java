package p000;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.elane.FilmstripParticipantView;

public final class ctb implements OnClickListener {
    final /* synthetic */ FilmstripParticipantView f9021a;

    public ctb(FilmstripParticipantView filmstripParticipantView) {
        this.f9021a = filmstripParticipantView;
    }

    public void onClick(View view) {
        if (TextUtils.equals(this.f9021a.f6139b, this.f9021a.f6141d.m10944c())) {
            this.f9021a.f6141d.m10940a(null);
        } else {
            this.f9021a.f6141d.m10940a(this.f9021a.f6139b);
        }
    }
}
