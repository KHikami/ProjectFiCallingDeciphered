package p000;

import android.content.Intent;

public final class ihp extends iho implements ihl {
    private Intent f17689a = new Intent();

    public /* synthetic */ ihl mo3202a(int i) {
        return m21810e(407);
    }

    public /* synthetic */ ihl mo3203a(String str) {
        return m21811e(str);
    }

    public /* synthetic */ ihl mo3204b(int i) {
        return m21812f(i);
    }

    public /* synthetic */ ihl mo3205b(String str) {
        return m21813f(str);
    }

    public /* synthetic */ ihl mo3206c(int i) {
        return m21814g(i);
    }

    public /* synthetic */ ihl mo3207c(String str) {
        return m21815g(str);
    }

    public /* synthetic */ ihl mo3208d(int i) {
        return m21816h(100);
    }

    public /* synthetic */ ihl mo3209d(String str) {
        return m21817h(str);
    }

    public ihp() {
        this.f17689a.setPackage("com.google.android.gms");
        this.f17689a.setAction("com.google.android.gms.people.smart_profile.ACTION_SHOW_PROFILE");
    }

    private ihp m21811e(String str) {
        this.f17689a.putExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME", str);
        return this;
    }

    private ihp m21813f(String str) {
        this.f17689a.putExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID", str);
        return this;
    }

    private ihp m21810e(int i) {
        this.f17689a.putExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", i);
        return this;
    }

    private ihp m21812f(int i) {
        this.f17689a.putExtra("com.google.android.gms.people.smart_profile.THEME_COLOR_INT", i);
        return this;
    }

    private ihp m21814g(int i) {
        this.f17689a.putExtra("com.google.android.gms.people.smart_profile.STATUS_BAR_COLOR", i);
        return this;
    }

    private ihp m21815g(String str) {
        this.f17689a.putExtra("com.google.android.gms.people.smart_profile.DISPLAY_NAME", str);
        return this;
    }

    private ihp m21817h(String str) {
        this.f17689a.putExtra("com.google.android.gms.people.smart_profile.AVATAR_URL", str);
        return this;
    }

    private ihp m21816h(int i) {
        this.f17689a.putExtra("com.google.android.gms.people.smart_profile.SLIDE_IN_PERCENTAGE", Math.min(Math.max(i, 0), 100));
        return this;
    }

    public Intent mo3201a() {
        return this.f17689a;
    }
}
