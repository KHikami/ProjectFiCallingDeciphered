package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class agl extends dw implements agy {
    private agp n;
    private agi o;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = g();
        this.n.a(bundle);
    }

    public agp g() {
        return new agp(this);
    }

    public agp h() {
        return this.n;
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onResume() {
        super.onResume();
        this.n.j();
    }

    protected void onPause() {
        this.n.k();
        super.onPause();
    }

    protected void onStop() {
        super.onStop();
    }

    protected void onDestroy() {
        this.n.l();
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.n.m()) {
            super.onBackPressed();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.n.b(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.n.a(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public Context i() {
        return this;
    }

    public agi j() {
        if (this.o == null) {
            this.o = new agi(getActionBar());
        }
        return this.o;
    }
}
