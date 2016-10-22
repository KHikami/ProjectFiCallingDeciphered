package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: kcs */
public class kcs extends Activity implements kbt {
    private int a;
    public final kbc k;

    public kcs() {
        this.k = new kbc();
    }

    public final kbu getLifecycle() {
        return this.k;
    }

    public void onCreate(Bundle bundle) {
        this.k.c(bundle);
        super.onCreate(bundle);
    }

    protected void onPostCreate(Bundle bundle) {
        this.k.a(bundle);
        super.onPostCreate(bundle);
    }

    public void onStart() {
        if (VERSION.SDK_INT >= 11) {
            gwb.a(getFragmentManager());
        }
        this.k.i();
        super.onStart();
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        this.k.b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        this.k.j();
        super.onResume();
    }

    protected void onPostResume() {
        this.k.a();
        super.onPostResume();
    }

    protected void onPause() {
        this.k.b();
        super.onPause();
    }

    public void onStop() {
        this.k.k();
        super.onStop();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.k.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        this.k.c();
        super.onDestroy();
    }

    public void onAttachedToWindow() {
        this.k.d();
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.k.e();
        super.onDetachedFromWindow();
    }

    public void onWindowFocusChanged(boolean z) {
        this.k.a(z);
        super.onWindowFocusChanged(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.k.a(configuration);
        super.onConfigurationChanged(configuration);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.k.a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.k.a(i, strArr, iArr);
    }

    public void onLowMemory() {
        this.k.l();
        super.onLowMemory();
    }

    public void startActivity(Intent intent) {
        a(intent);
        super.startActivity(intent);
        a();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        a(intent);
        super.startActivity(intent, bundle);
        a();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        a(intent);
        super.startActivityFromFragment(fragment, intent, i);
        a();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        a(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
        a();
    }

    public void startActivityForResult(Intent intent, int i) {
        a(intent);
        super.startActivityForResult(intent, i);
        a();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        a(intent);
        super.startActivityForResult(intent, i, bundle);
        a();
    }

    private void a(Intent intent) {
        int i = this.a;
        this.a = i + 1;
        if (i == 0) {
            this.k.b(intent);
        }
    }

    private void a() {
        this.a--;
    }

    public void onNewIntent(Intent intent) {
        this.k.a(intent);
        super.onNewIntent(intent);
    }

    protected void onUserLeaveHint() {
        this.k.f();
        super.onUserLeaveHint();
    }

    public void finish() {
        this.k.g();
        super.finish();
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.k.a(actionMode);
        super.onActionModeStarted(actionMode);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.k.b(actionMode);
        super.onActionModeFinished(actionMode);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.k.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.k.a(contextMenu, view, contextMenuInfo);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.k.a(menuItem) || super.onContextItemSelected(menuItem);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.k.a(menu) || super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.k.b(menu) || super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.k.b(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    public void onBackPressed() {
        if (!this.k.h()) {
            super.onBackPressed();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.k.a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.k.b(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }
}
