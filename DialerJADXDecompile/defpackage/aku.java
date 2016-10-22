package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.android.dialer.app.DialtactsActivity;

/* compiled from: PG */
/* renamed from: aku */
public final class aku implements OnKeyListener {
    private /* synthetic */ DialtactsActivity a;

    public aku(DialtactsActivity dialtactsActivity) {
        this.a = dialtactsActivity;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            DialtactsActivity dialtactsActivity;
            if (TextUtils.isEmpty(this.a.p.getText().toString())) {
                dialtactsActivity = this.a;
                if (dialtactsActivity.i() && TextUtils.isEmpty(dialtactsActivity.q)) {
                    dialtactsActivity.n();
                    buf.y(dialtactsActivity.h);
                }
            } else {
                dialtactsActivity = this.a;
                dialtactsActivity.t.a(dialtactsActivity.getResources().getDrawable(cob.an), dialtactsActivity.getResources().getString(cob.aW));
                dialtactsActivity.t.a(dialtactsActivity.y(), false);
                dialtactsActivity.t.a(300);
            }
        }
        return false;
    }
}
