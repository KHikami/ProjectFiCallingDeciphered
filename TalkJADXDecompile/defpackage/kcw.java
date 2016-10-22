package defpackage;

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

/* renamed from: kcw */
public class kcw extends dw implements kbt {
    private int n;
    public final kcz q;

    public kcw() {
        this.q = new kcz();
    }

    public final kbu getLifecycle() {
        return this.q;
    }

    public void onCreate(Bundle bundle) {
        this.q.c(bundle);
        super.onCreate(bundle);
    }

    public void onPostCreate(Bundle bundle) {
        this.q.a(bundle);
        super.onPostCreate(bundle);
    }

    public void onStart() {
        ba.a(J_());
        this.q.i();
        super.onStart();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.q.b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        ba.a(J_());
        this.q.j();
        super.onResume();
    }

    public void onPostResume() {
        this.q.a();
        super.onPostResume();
    }

    public void onPause() {
        this.q.b();
        super.onPause();
    }

    public void onStop() {
        this.q.k();
        super.onStop();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.q.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        this.q.c();
        super.onDestroy();
    }

    public void onAttachedToWindow() {
        this.q.d();
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.q.e();
        super.onDetachedFromWindow();
    }

    public void onWindowFocusChanged(boolean z) {
        this.q.a(z);
        super.onWindowFocusChanged(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.q.a(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.q.a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.q.a(i, strArr, iArr);
    }

    public void onLowMemory() {
        this.q.l();
        super.onLowMemory();
    }

    public void startActivity(Intent intent) {
        a(intent);
        super.startActivity(intent);
        g();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        a(intent);
        super.startActivity(intent, bundle);
        g();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        a(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
        g();
    }

    public void startActivityForResult(Intent intent, int i) {
        a(intent);
        super.startActivityForResult(intent, i);
        g();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        a(intent);
        super.startActivityForResult(intent, i, bundle);
        g();
    }

    private void a(Intent intent) {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.b(intent);
        }
    }

    private void g() {
        this.n--;
    }

    public void onNewIntent(Intent intent) {
        this.q.a(intent);
        super.onNewIntent(intent);
    }

    public void onUserLeaveHint() {
        this.q.f();
        super.onUserLeaveHint();
    }

    public void finish() {
        this.q.g();
        super.finish();
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.q.a(actionMode);
        super.onActionModeStarted(actionMode);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.q.b(actionMode);
        super.onActionModeFinished(actionMode);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.q.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.q.a(contextMenu, view, contextMenuInfo);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.q.a(menuItem) || super.onContextItemSelected(menuItem);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.q.a(menu) || super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.q.b(menu) || super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.q.b(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    public void onBackPressed() {
        if (!this.q.h()) {
            super.onBackPressed();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.q.a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.q.b(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    public void a(dr drVar) {
        this.q.a(drVar);
        super.a(drVar);
    }
}
