package defpackage;

import android.content.Intent;

public class gsy extends gsr {
    private final Intent a;

    public gsy(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public Intent b() {
        return this.a == null ? null : new Intent(this.a);
    }
}
