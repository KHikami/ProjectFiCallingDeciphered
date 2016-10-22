package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: alf */
public class alf extends pz {
    public boolean u;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.u = true;
    }

    protected void onStart() {
        super.onStart();
        this.u = true;
    }

    public void onResume() {
        super.onResume();
        this.u = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.u = false;
    }
}
