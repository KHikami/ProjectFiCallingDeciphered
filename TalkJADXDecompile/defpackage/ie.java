package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: ie */
class ie {
    public Intent a(ComponentName componentName) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentName);
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }

    ie() {
    }
}
