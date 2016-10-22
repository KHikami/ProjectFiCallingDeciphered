package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* compiled from: PG */
/* renamed from: arh */
public class arh extends PreferenceActivity {
    public boolean a;
    private qb b;

    public void onCreate(Bundle bundle) {
        a().h();
        a().a(bundle);
        super.onCreate(bundle);
        this.a = true;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a().c();
    }

    public MenuInflater getMenuInflater() {
        return a().b();
    }

    public void setContentView(int i) {
        a().b(i);
    }

    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    protected void onPostResume() {
        super.onPostResume();
        a().e();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        a().a(charSequence);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a().a(configuration);
    }

    protected void onStop() {
        super.onStop();
        a().d();
    }

    protected void onDestroy() {
        super.onDestroy();
        a().g();
    }

    public void invalidateOptionsMenu() {
        a().f();
    }

    public final qb a() {
        if (this.b == null) {
            this.b = qb.a((Activity) this, null);
        }
        return this.b;
    }

    protected void onStart() {
        super.onStart();
        this.a = true;
    }

    public void onResume() {
        super.onResume();
        this.a = true;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a = false;
    }
}
