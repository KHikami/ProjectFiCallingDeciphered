package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: hq */
public final class hq implements Iterable<Intent> {
    private static final hs a;
    private final ArrayList<Intent> b;
    private final Context c;

    static {
        if (VERSION.SDK_INT >= 11) {
            a = new hu();
        } else {
            a = new ht();
        }
    }

    private hq(Context context) {
        this.b = new ArrayList();
        this.c = context;
    }

    public static hq a(Context context) {
        return new hq(context);
    }

    public hq a(Intent intent) {
        this.b.add(intent);
        return this;
    }

    public hq b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.c.getPackageManager());
        }
        if (component != null) {
            a(component);
        }
        a(intent);
        return this;
    }

    public hq a(Activity activity) {
        Intent b;
        Intent intent = null;
        if (activity instanceof hr) {
            intent = ((hr) activity).H_();
        }
        if (intent == null) {
            b = fk.b(activity);
        } else {
            b = intent;
        }
        if (b != null) {
            ComponentName component = b.getComponent();
            if (component == null) {
                component = b.resolveActivity(this.c.getPackageManager());
            }
            a(component);
            a(b);
        }
        return this;
    }

    private hq a(ComponentName componentName) {
        int size = this.b.size();
        try {
            Intent a = fk.a(this.c, componentName);
            while (a != null) {
                this.b.add(size, a);
                a = fk.a(this.c, a.getComponent());
            }
            return this;
        } catch (Throwable e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public int a() {
        return this.b.size();
    }

    public Intent a(int i) {
        return (Intent) this.b.get(i);
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.b.iterator();
    }

    public void b() {
        a(null);
    }

    private void a(Bundle bundle) {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.b.toArray(new Intent[this.b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!ia.a(this.c, intentArr, null)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.c.startActivity(intent);
        }
    }

    public PendingIntent a(int i, int i2) {
        return a(i, i2, null);
    }

    private PendingIntent a(int i, int i2, Bundle bundle) {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.b.toArray(new Intent[this.b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return a.a(this.c, intentArr, i, i2);
    }
}
