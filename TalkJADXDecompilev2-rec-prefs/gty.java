package p000;

import android.content.Intent;

public class gty extends Exception {
    private final Intent f16134a;

    public gty(String str, Intent intent) {
        super(str);
        this.f16134a = intent;
    }

    public Intent m18566b() {
        return new Intent(this.f16134a);
    }
}
