package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;

/* renamed from: gjz */
public final class gjz extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ URLSpan b;

    public gjz(Context context, URLSpan uRLSpan) {
        this.a = context;
        this.b = uRLSpan;
    }

    public void onClick(View view) {
        this.a.startActivity(gwb.z(this.b.getURL()));
    }
}
