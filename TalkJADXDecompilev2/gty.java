package defpackage;

import android.content.Intent;

public class gty extends Exception {
    private final Intent a;

    public gty(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public Intent b() {
        return new Intent(this.a);
    }
}
