package p000;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;

public final class gjz extends ClickableSpan {
    final /* synthetic */ Context f15473a;
    final /* synthetic */ URLSpan f15474b;

    public gjz(Context context, URLSpan uRLSpan) {
        this.f15473a = context;
        this.f15474b = uRLSpan;
    }

    public void onClick(View view) {
        this.f15473a.startActivity(gwb.m2397z(this.f15474b.getURL()));
    }
}
