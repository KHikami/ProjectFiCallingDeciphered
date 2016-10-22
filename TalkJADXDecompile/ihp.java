import android.content.Intent;

public final class ihp extends iho implements ihl {
    private Intent a;

    public /* synthetic */ ihl a(int i) {
        return e(407);
    }

    public /* synthetic */ ihl a(String str) {
        return e(str);
    }

    public /* synthetic */ ihl b(int i) {
        return f(i);
    }

    public /* synthetic */ ihl b(String str) {
        return f(str);
    }

    public /* synthetic */ ihl c(int i) {
        return g(i);
    }

    public /* synthetic */ ihl c(String str) {
        return g(str);
    }

    public /* synthetic */ ihl d(int i) {
        return h(100);
    }

    public /* synthetic */ ihl d(String str) {
        return h(str);
    }

    public ihp() {
        this.a = new Intent();
        this.a.setPackage("com.google.android.gms");
        this.a.setAction("com.google.android.gms.people.smart_profile.ACTION_SHOW_PROFILE");
    }

    private ihp e(String str) {
        this.a.putExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME", str);
        return this;
    }

    private ihp f(String str) {
        this.a.putExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID", str);
        return this;
    }

    private ihp e(int i) {
        this.a.putExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", i);
        return this;
    }

    private ihp f(int i) {
        this.a.putExtra("com.google.android.gms.people.smart_profile.THEME_COLOR_INT", i);
        return this;
    }

    private ihp g(int i) {
        this.a.putExtra("com.google.android.gms.people.smart_profile.STATUS_BAR_COLOR", i);
        return this;
    }

    private ihp g(String str) {
        this.a.putExtra("com.google.android.gms.people.smart_profile.DISPLAY_NAME", str);
        return this;
    }

    private ihp h(String str) {
        this.a.putExtra("com.google.android.gms.people.smart_profile.AVATAR_URL", str);
        return this;
    }

    private ihp h(int i) {
        this.a.putExtra("com.google.android.gms.people.smart_profile.SLIDE_IN_PERCENTAGE", Math.min(Math.max(i, 0), 100));
        return this;
    }

    public Intent a() {
        return this.a;
    }
}
