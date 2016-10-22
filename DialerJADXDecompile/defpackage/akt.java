package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dialer.app.DialtactsActivity;

/* compiled from: PG */
/* renamed from: akt */
public final class akt implements OnClickListener {
    private /* synthetic */ DialtactsActivity a;

    public akt(DialtactsActivity dialtactsActivity) {
        this.a = dialtactsActivity;
    }

    public final void onClick(View view) {
        if (!this.a.i()) {
            this.a.s.a();
            this.a.a(false, this.a.p.getText().toString(), true);
        }
    }
}
