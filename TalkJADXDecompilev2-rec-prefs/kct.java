package p000;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class kct extends uq implements kbt {
    public final kcz f6041F = new kcz();
    private int f6042n;

    public kct() {
        super((byte) 0);
    }

    public final kbu getLifecycle() {
        return this.f6041F;
    }

    public void onCreate(Bundle bundle) {
        this.f6041F.m25526c(bundle);
        super.onCreate(bundle);
    }

    protected void onPostCreate(Bundle bundle) {
        this.f6041F.m25534a(bundle);
        super.onPostCreate(bundle);
    }

    public void onStart() {
        ba.m4570a(J_());
        this.f6041F.m25528i();
        super.onStart();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.f6041F.m25541b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        ba.m4570a(J_());
        this.f6041F.m25529j();
        super.onResume();
    }

    public void onPostResume() {
        this.f6041F.m25532a();
        super.onPostResume();
    }

    public void onPause() {
        this.f6041F.mo3637b();
        super.onPause();
    }

    public void onStop() {
        this.f6041F.m25530k();
        super.onStop();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f6041F.m25527d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        this.f6041F.mo3638c();
        super.onDestroy();
    }

    public void onAttachedToWindow() {
        this.f6041F.m25545d();
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f6041F.m25546e();
        super.onDetachedFromWindow();
    }

    public void onWindowFocusChanged(boolean z) {
        this.f6041F.m25536a(z);
        super.onWindowFocusChanged(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f6041F.m25517a(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f6041F.m25515a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f6041F.m25516a(i, strArr, iArr);
    }

    public void onLowMemory() {
        this.f6041F.m25531l();
        super.onLowMemory();
    }

    public void startActivity(Intent intent) {
        mo1157c(intent);
        super.startActivity(intent);
        mo1085j();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        mo1157c(intent);
        super.startActivity(intent, bundle);
        mo1085j();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        mo1157c(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
        mo1085j();
    }

    public void startActivityForResult(Intent intent, int i) {
        mo1157c(intent);
        super.startActivityForResult(intent, i);
        mo1085j();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        mo1157c(intent);
        super.startActivityForResult(intent, i, bundle);
        mo1085j();
    }

    private void mo1157c(Intent intent) {
        int i = this.f6042n;
        this.f6042n = i + 1;
        if (i == 0) {
            this.f6041F.m25540b(intent);
        }
    }

    private void mo1085j() {
        this.f6042n--;
    }

    public void onNewIntent(Intent intent) {
        this.f6041F.m25533a(intent);
        super.onNewIntent(intent);
    }

    protected void onUserLeaveHint() {
        this.f6041F.m25547f();
        super.onUserLeaveHint();
    }

    public void finish() {
        this.f6041F.m25548g();
        super.finish();
    }

    public void mo1062a(wx wxVar) {
        this.f6041F.m25574a(wxVar);
        super.mo1062a(wxVar);
    }

    public void mo1064b(wx wxVar) {
        this.f6041F.m25575b(wxVar);
        super.mo1064b(wxVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f6041F.m25538a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.f6041F.m25518a(contextMenu, view, contextMenuInfo);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.f6041F.m25520a(menuItem) || super.onContextItemSelected(menuItem);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f6041F.m25519a(menu) || super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.f6041F.m25523b(menu) || super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f6041F.m25524b(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    public void onBackPressed() {
        if (!this.f6041F.m25549h()) {
            super.onBackPressed();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f6041F.m25537a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f6041F.m25543b(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    public void mo1050a(dr drVar) {
        this.f6041F.m25573a(drVar);
        super.mo1050a(drVar);
    }
}
