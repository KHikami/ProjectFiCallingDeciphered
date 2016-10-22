package defpackage;

import android.graphics.PorterDuff.Mode;

/* compiled from: PG */
/* renamed from: vk */
final class vk extends ia {
    public vk(int i) {
        super(6);
    }

    static int a(int i, Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
