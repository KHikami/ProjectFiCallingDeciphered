import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class agk {
    private final Intent a;
    private Integer b;
    private String c;
    private String d;
    private String e;
    private String[] f;
    private String g;
    private String h;
    private Float i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public agk(Context context, Class<?> cls) {
        this.a = new Intent(context, cls);
        this.l = false;
        this.q = false;
        this.r = false;
        this.j = true;
    }

    public agk a(String str) {
        this.c = str;
        return this;
    }

    public agk b(String str) {
        this.d = str;
        return this;
    }

    public agk a(String[] strArr) {
        this.f = strArr;
        return this;
    }

    public agk c(String str) {
        this.e = str;
        return this;
    }

    public agk d(String str) {
        this.g = str;
        return this;
    }

    public agk e(String str) {
        this.h = str;
        return this;
    }

    public agk a(float f) {
        this.i = Float.valueOf(f);
        return this;
    }

    public agk a(int i, int i2, int i3, int i4) {
        this.l = true;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        return this;
    }

    public agk a(boolean z) {
        this.q = true;
        return this;
    }

    public agk b(boolean z) {
        this.r = z;
        return this;
    }

    public Intent a() {
        this.a.setAction("android.intent.action.VIEW");
        this.a.setFlags(67633152);
        if (this.b != null) {
            this.a.putExtra("photo_index", this.b.intValue());
        }
        if (this.c != null) {
            this.a.putExtra("initial_photo_uri", this.c);
        }
        if (this.c == null || this.b == null) {
            if (this.d != null) {
                this.a.putExtra("photos_uri", this.d);
                this.a.setData(Uri.parse(this.d));
            }
            if (this.e != null) {
                this.a.putExtra("resolved_photo_uri", this.e);
            }
            if (this.f != null) {
                this.a.putExtra("projection", this.f);
            }
            if (this.g != null) {
                this.a.putExtra("thumbnail_uri", this.g);
            }
            if (this.h != null) {
                this.a.putExtra("content_description", this.h);
            }
            if (this.i != null) {
                this.a.putExtra("max_scale", this.i);
            }
            this.a.putExtra("watch_network", this.k);
            this.a.putExtra("scale_up_animation", this.l);
            if (this.l) {
                this.a.putExtra("start_x_extra", this.m);
                this.a.putExtra("start_y_extra", this.n);
                this.a.putExtra("start_width_extra", this.o);
                this.a.putExtra("start_height_extra", this.p);
            }
            this.a.putExtra("action_bar_hidden_initially", this.q);
            this.a.putExtra("display_thumbs_fullscreen", this.r);
            this.a.putExtra("enable_timer_lights_out", this.j);
            return this.a;
        }
        throw new IllegalStateException("specified both photo index and photo uri");
    }
}
