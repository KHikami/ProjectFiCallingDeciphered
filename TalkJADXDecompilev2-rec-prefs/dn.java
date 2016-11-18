package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

abstract class dn extends Activity {
    boolean f629a;

    abstract View mo151a(View view, String str, Context context, AttributeSet attributeSet);

    dn() {
    }

    public void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT < 11 && getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo151a(null, str, context, attributeSet);
        if (a == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return a;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!(this.f629a || i == -1)) {
            dn.m1083b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    static void m1083b(int i) {
        if ((-65536 & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }
}
