package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: abr */
public class abr extends Activity {
    public boolean a;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = true;
    }

    public void onStart() {
        super.onStart();
        this.a = true;
    }

    public void onResume() {
        super.onResume();
        this.a = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a = false;
    }
}
