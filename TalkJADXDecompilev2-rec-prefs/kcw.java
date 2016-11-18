package p000;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class kcw extends dw implements kbt {
    private int f5953n;
    public final kcz f5954q = new kcz();

    public final kbu getLifecycle() {
        return this.f5954q;
    }

    public void onCreate(Bundle bundle) {
        this.f5954q.m25526c(bundle);
        super.onCreate(bundle);
    }

    public void onPostCreate(Bundle bundle) {
        this.f5954q.m25534a(bundle);
        super.onPostCreate(bundle);
    }

    public void onStart() {
        ba.m4570a(J_());
        this.f5954q.m25528i();
        super.onStart();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.f5954q.m25541b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        ba.m4570a(J_());
        this.f5954q.m25529j();
        super.onResume();
    }

    public void onPostResume() {
        this.f5954q.m25532a();
        super.onPostResume();
    }

    public void onPause() {
        this.f5954q.mo3637b();
        super.onPause();
    }

    public void onStop() {
        this.f5954q.m25530k();
        super.onStop();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f5954q.m25527d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        this.f5954q.mo3638c();
        super.onDestroy();
    }

    public void onAttachedToWindow() {
        this.f5954q.m25545d();
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f5954q.m25546e();
        super.onDetachedFromWindow();
    }

    public void onWindowFocusChanged(boolean z) {
        this.f5954q.m25536a(z);
        super.onWindowFocusChanged(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f5954q.m25517a(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f5954q.m25515a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f5954q.m25516a(i, strArr, iArr);
    }

    public void onLowMemory() {
        this.f5954q.m25531l();
        super.onLowMemory();
    }

    public void startActivity(Intent intent) {
        m8219a(intent);
        super.startActivity(intent);
        mo1056g();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        m8219a(intent);
        super.startActivity(intent, bundle);
        mo1056g();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        m8219a(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
        mo1056g();
    }

    public void startActivityForResult(Intent intent, int i) {
        m8219a(intent);
        super.startActivityForResult(intent, i);
        mo1056g();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        m8219a(intent);
        super.startActivityForResult(intent, i, bundle);
        mo1056g();
    }

    private void m8219a(Intent intent) {
        int i = this.f5953n;
        this.f5953n = i + 1;
        if (i == 0) {
            this.f5954q.m25540b(intent);
        }
    }

    private void mo1056g() {
        this.f5953n--;
    }

    public void onNewIntent(Intent intent) {
        this.f5954q.m25533a(intent);
        super.onNewIntent(intent);
    }

    public void onUserLeaveHint() {
        this.f5954q.m25547f();
        super.onUserLeaveHint();
    }

    public void finish() {
        this.f5954q.m25548g();
        super.finish();
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f5954q.m25535a(actionMode);
        super.onActionModeStarted(actionMode);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f5954q.m25542b(actionMode);
        super.onActionModeFinished(actionMode);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f5954q.m25538a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.f5954q.m25518a(contextMenu, view, contextMenuInfo);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.f5954q.m25520a(menuItem) || super.onContextItemSelected(menuItem);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f5954q.m25519a(menu) || super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.f5954q.m25523b(menu) || super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f5954q.m25524b(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    public void onBackPressed() {
        if (!this.f5954q.m25549h()) {
            super.onBackPressed();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f5954q.m25537a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f5954q.m25543b(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    public void mo1050a(dr drVar) {
        this.f5954q.m25573a(drVar);
        super.mo1050a(drVar);
    }
}
