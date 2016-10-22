import android.content.Context;
import android.text.style.URLSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityManager;

public final class gka implements OnClickListener {
    final /* synthetic */ Context a;
    final /* synthetic */ URLSpan b;

    public gka(Context context, URLSpan uRLSpan) {
        this.a = context;
        this.b = uRLSpan;
    }

    public void onClick(View view) {
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            this.a.startActivity(gwb.z(this.b.getURL()));
        }
    }
}
