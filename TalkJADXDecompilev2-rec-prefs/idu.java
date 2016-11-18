package p000;

import android.content.Intent;

public class idu extends Exception {
    private final Intent f17600a;

    public idu(String str, Intent intent, Throwable th) {
        super(str, th);
        this.f17600a = intent;
    }
}
