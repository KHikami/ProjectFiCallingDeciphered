package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: PG */
/* renamed from: ata */
public class ata {
    static final String a;
    public final atc b;
    boolean c;
    atb d;
    public Context e;

    static {
        a = ata.class.getSimpleName();
    }

    ata(Context context) {
        this.e = context;
        this.b = new atc(this);
        this.c = ((AudioManager) context.getSystemService("audio")).isWiredHeadsetOn();
    }
}
