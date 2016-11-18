package defpackage;

import android.content.Intent;

public final class gsx extends gsy {
    private final int a;

    gsx(int i, String str, Intent intent) {
        super(str, intent);
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
