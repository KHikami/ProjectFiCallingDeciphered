package p000;

import android.content.Context;
import android.text.style.URLSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityManager;

public final class gka implements OnClickListener {
    final /* synthetic */ Context f15475a;
    final /* synthetic */ URLSpan f15476b;

    public gka(Context context, URLSpan uRLSpan) {
        this.f15475a = context;
        this.f15476b = uRLSpan;
    }

    public void onClick(View view) {
        if (((AccessibilityManager) this.f15475a.getSystemService("accessibility")).isEnabled()) {
            this.f15475a.startActivity(gwb.m2397z(this.f15476b.getURL()));
        }
    }
}
