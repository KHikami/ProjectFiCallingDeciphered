package defpackage;

import android.content.Intent;

/* renamed from: idu */
public class idu extends Exception {
    private final Intent a;

    public idu(String str, Intent intent, Throwable th) {
        super(str, th);
        this.a = intent;
    }
}
