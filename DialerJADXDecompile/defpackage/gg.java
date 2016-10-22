package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: gg */
class gg {
    public Intent a(ComponentName componentName) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentName);
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }

    gg() {
    }
}
