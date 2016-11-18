package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class agk {
    private final Intent f611a;
    private Integer f612b;
    private String f613c;
    private String f614d;
    private String f615e;
    private String[] f616f;
    private String f617g;
    private String f618h;
    private Float f619i;
    private boolean f620j = true;
    private boolean f621k;
    private boolean f622l = false;
    private int f623m;
    private int f624n;
    private int f625o;
    private int f626p;
    private boolean f627q = false;
    private boolean f628r = false;

    public agk(Context context, Class<?> cls) {
        this.f611a = new Intent(context, cls);
    }

    public agk m1074a(String str) {
        this.f613c = str;
        return this;
    }

    public agk m1078b(String str) {
        this.f614d = str;
        return this;
    }

    public agk m1076a(String[] strArr) {
        this.f616f = strArr;
        return this;
    }

    public agk m1080c(String str) {
        this.f615e = str;
        return this;
    }

    public agk m1081d(String str) {
        this.f617g = str;
        return this;
    }

    public agk m1082e(String str) {
        this.f618h = str;
        return this;
    }

    public agk m1072a(float f) {
        this.f619i = Float.valueOf(f);
        return this;
    }

    public agk m1073a(int i, int i2, int i3, int i4) {
        this.f622l = true;
        this.f623m = i;
        this.f624n = i2;
        this.f625o = i3;
        this.f626p = i4;
        return this;
    }

    public agk m1075a(boolean z) {
        this.f627q = true;
        return this;
    }

    public agk m1079b(boolean z) {
        this.f628r = z;
        return this;
    }

    public Intent m1077a() {
        this.f611a.setAction("android.intent.action.VIEW");
        this.f611a.setFlags(67633152);
        if (this.f612b != null) {
            this.f611a.putExtra("photo_index", this.f612b.intValue());
        }
        if (this.f613c != null) {
            this.f611a.putExtra("initial_photo_uri", this.f613c);
        }
        if (this.f613c == null || this.f612b == null) {
            if (this.f614d != null) {
                this.f611a.putExtra("photos_uri", this.f614d);
                this.f611a.setData(Uri.parse(this.f614d));
            }
            if (this.f615e != null) {
                this.f611a.putExtra("resolved_photo_uri", this.f615e);
            }
            if (this.f616f != null) {
                this.f611a.putExtra("projection", this.f616f);
            }
            if (this.f617g != null) {
                this.f611a.putExtra("thumbnail_uri", this.f617g);
            }
            if (this.f618h != null) {
                this.f611a.putExtra("content_description", this.f618h);
            }
            if (this.f619i != null) {
                this.f611a.putExtra("max_scale", this.f619i);
            }
            this.f611a.putExtra("watch_network", this.f621k);
            this.f611a.putExtra("scale_up_animation", this.f622l);
            if (this.f622l) {
                this.f611a.putExtra("start_x_extra", this.f623m);
                this.f611a.putExtra("start_y_extra", this.f624n);
                this.f611a.putExtra("start_width_extra", this.f625o);
                this.f611a.putExtra("start_height_extra", this.f626p);
            }
            this.f611a.putExtra("action_bar_hidden_initially", this.f627q);
            this.f611a.putExtra("display_thumbs_fullscreen", this.f628r);
            this.f611a.putExtra("enable_timer_lights_out", this.f620j);
            return this.f611a;
        }
        throw new IllegalStateException("specified both photo index and photo uri");
    }
}
