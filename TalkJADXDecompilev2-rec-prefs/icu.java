package p000;

import android.content.Intent;

public class icu extends icr {
    private final Intent f17581a;

    public icu(String str, Intent intent) {
        super(str);
        this.f17581a = intent;
    }

    public icu(String str, Intent intent, Exception exception) {
        super(str, exception);
        this.f17581a = intent;
    }

    public Intent m21602a() {
        if (this.f17581a == null) {
            return null;
        }
        return new Intent(this.f17581a);
    }
}
