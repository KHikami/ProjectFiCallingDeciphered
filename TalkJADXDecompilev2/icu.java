package defpackage;

import android.content.Intent;

public class icu extends icr {
    private final Intent a;

    public icu(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public icu(String str, Intent intent, Exception exception) {
        super(str, exception);
        this.a = intent;
    }

    public Intent a() {
        if (this.a == null) {
            return null;
        }
        return new Intent(this.a);
    }
}
