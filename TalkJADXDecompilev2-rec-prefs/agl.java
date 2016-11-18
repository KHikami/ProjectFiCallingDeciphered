package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class agl extends dw implements agy {
    private agp f642n;
    private agi f643o;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f642n = mo1161g();
        this.f642n.mo1892a(bundle);
    }

    public agp mo1161g() {
        return new agp(this);
    }

    public agp mo160h() {
        return this.f642n;
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onResume() {
        super.onResume();
        this.f642n.m1159j();
    }

    protected void onPause() {
        this.f642n.m1160k();
        super.onPause();
    }

    protected void onStop() {
        super.onStop();
    }

    protected void onDestroy() {
        this.f642n.m1161l();
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f642n.m1162m()) {
            super.onBackPressed();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f642n.m1145b(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f642n.m1140a(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public Context mo161i() {
        return this;
    }

    public agi mo162j() {
        if (this.f643o == null) {
            this.f643o = new agi(getActionBar());
        }
        return this.f643o;
    }
}
