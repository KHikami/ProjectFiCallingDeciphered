package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* renamed from: cy */
abstract class cy extends cx {
    cy() {
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = a(view, str, context, attributeSet);
        if (a != null || VERSION.SDK_INT < 11) {
            return a;
        }
        return super.onCreateView(view, str, context, attributeSet);
    }
}
