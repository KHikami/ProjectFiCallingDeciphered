package p000;

import android.content.Intent;

public class gsy extends gsr {
    private final Intent f16035a;

    public gsy(String str, Intent intent) {
        super(str);
        this.f16035a = intent;
    }

    public Intent m18497b() {
        return this.f16035a == null ? null : new Intent(this.f16035a);
    }
}
