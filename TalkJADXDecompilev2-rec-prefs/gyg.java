package p000;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

public final class gyg implements OnClickListener {
    final /* synthetic */ Context f16374a;
    final /* synthetic */ int f16375b;

    public gyg(Context context, int i) {
        this.f16374a = context;
        this.f16375b = i;
    }

    public void onClick(View view) {
        this.f16374a.startActivity(gtt.m18582a(this.f16375b));
    }
}
