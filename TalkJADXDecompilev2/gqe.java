package defpackage;

import android.view.View;
import com.google.android.apps.hangouts.views.MultiLineLayout;

public final class gqe extends gqg {
    final /* synthetic */ MultiLineLayout a;

    public gqe(MultiLineLayout multiLineLayout) {
        this.a = multiLineLayout;
        super(multiLineLayout);
    }

    protected void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }
}
