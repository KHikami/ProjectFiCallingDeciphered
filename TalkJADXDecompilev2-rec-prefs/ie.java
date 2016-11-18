package p000;

import android.content.ComponentName;
import android.content.Intent;

class ie {
    public Intent mo3173a(ComponentName componentName) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentName);
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }

    ie() {
    }
}
