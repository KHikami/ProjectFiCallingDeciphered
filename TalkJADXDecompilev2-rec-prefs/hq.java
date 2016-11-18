package p000;

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

public final class hq implements Iterable<Intent> {
    private static final hs f17127a;
    private final ArrayList<Intent> f17128b = new ArrayList();
    private final Context f17129c;

    static {
        if (VERSION.SDK_INT >= 11) {
            f17127a = new hu();
        } else {
            f17127a = new ht();
        }
    }

    private hq(Context context) {
        this.f17129c = context;
    }

    public static hq m20483a(Context context) {
        return new hq(context);
    }

    public hq m20489a(Intent intent) {
        this.f17128b.add(intent);
        return this;
    }

    public hq m20490b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f17129c.getPackageManager());
        }
        if (component != null) {
            m20482a(component);
        }
        m20489a(intent);
        return this;
    }

    public hq m20488a(Activity activity) {
        Intent b;
        Intent intent = null;
        if (activity instanceof hr) {
            intent = ((hr) activity).H_();
        }
        if (intent == null) {
            b = fk.m15533b(activity);
        } else {
            b = intent;
        }
        if (b != null) {
            ComponentName component = b.getComponent();
            if (component == null) {
                component = b.resolveActivity(this.f17129c.getPackageManager());
            }
            m20482a(component);
            m20489a(b);
        }
        return this;
    }

    private hq m20482a(ComponentName componentName) {
        int size = this.f17128b.size();
        try {
            Intent a = fk.m15530a(this.f17129c, componentName);
            while (a != null) {
                this.f17128b.add(size, a);
                a = fk.m15530a(this.f17129c, a.getComponent());
            }
            return this;
        } catch (Throwable e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public int m20485a() {
        return this.f17128b.size();
    }

    public Intent m20487a(int i) {
        return (Intent) this.f17128b.get(i);
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f17128b.iterator();
    }

    public void m20491b() {
        m20484a(null);
    }

    private void m20484a(Bundle bundle) {
        if (this.f17128b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f17128b.toArray(new Intent[this.f17128b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!ia.m10676a(this.f17129c, intentArr, null)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f17129c.startActivity(intent);
        }
    }

    public PendingIntent m20486a(int i, int i2) {
        return m20481a(i, i2, null);
    }

    private PendingIntent m20481a(int i, int i2, Bundle bundle) {
        if (this.f17128b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f17128b.toArray(new Intent[this.f17128b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return f17127a.mo2946a(this.f17129c, intentArr, i, i2);
    }
}
