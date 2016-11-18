package p000;

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

public class kcs extends Activity implements kbt {
    private int f6230a;
    public final kbc f6231k = new kbc();

    public final kbu getLifecycle() {
        return this.f6231k;
    }

    public void onCreate(Bundle bundle) {
        this.f6231k.m25526c(bundle);
        super.onCreate(bundle);
    }

    protected void onPostCreate(Bundle bundle) {
        this.f6231k.m25534a(bundle);
        super.onPostCreate(bundle);
    }

    public void onStart() {
        if (VERSION.SDK_INT >= 11) {
            gwb.m1741a(getFragmentManager());
        }
        this.f6231k.m25528i();
        super.onStart();
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        this.f6231k.m25541b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        this.f6231k.m25529j();
        super.onResume();
    }

    protected void onPostResume() {
        this.f6231k.m25532a();
        super.onPostResume();
    }

    protected void onPause() {
        this.f6231k.mo3637b();
        super.onPause();
    }

    public void onStop() {
        this.f6231k.m25530k();
        super.onStop();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f6231k.m25527d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        this.f6231k.mo3638c();
        super.onDestroy();
    }

    public void onAttachedToWindow() {
        this.f6231k.m25545d();
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f6231k.m25546e();
        super.onDetachedFromWindow();
    }

    public void onWindowFocusChanged(boolean z) {
        this.f6231k.m25536a(z);
        super.onWindowFocusChanged(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f6231k.m25517a(configuration);
        super.onConfigurationChanged(configuration);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f6231k.m25515a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f6231k.m25516a(i, strArr, iArr);
    }

    public void onLowMemory() {
        this.f6231k.m25531l();
        super.onLowMemory();
    }

    public void startActivity(Intent intent) {
        m8441a(intent);
        super.startActivity(intent);
        mo1171a();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        m8441a(intent);
        super.startActivity(intent, bundle);
        mo1171a();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        m8441a(intent);
        super.startActivityFromFragment(fragment, intent, i);
        mo1171a();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        m8441a(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
        mo1171a();
    }

    public void startActivityForResult(Intent intent, int i) {
        m8441a(intent);
        super.startActivityForResult(intent, i);
        mo1171a();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        m8441a(intent);
        super.startActivityForResult(intent, i, bundle);
        mo1171a();
    }

    private void m8441a(Intent intent) {
        int i = this.f6230a;
        this.f6230a = i + 1;
        if (i == 0) {
            this.f6231k.m25540b(intent);
        }
    }

    private void mo1171a() {
        this.f6230a--;
    }

    public void onNewIntent(Intent intent) {
        this.f6231k.m25533a(intent);
        super.onNewIntent(intent);
    }

    protected void onUserLeaveHint() {
        this.f6231k.m25547f();
        super.onUserLeaveHint();
    }

    public void finish() {
        this.f6231k.m25548g();
        super.finish();
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f6231k.m25535a(actionMode);
        super.onActionModeStarted(actionMode);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f6231k.m25542b(actionMode);
        super.onActionModeFinished(actionMode);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f6231k.m25538a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.f6231k.m25518a(contextMenu, view, contextMenuInfo);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.f6231k.m25520a(menuItem) || super.onContextItemSelected(menuItem);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f6231k.m25519a(menu) || super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.f6231k.m25523b(menu) || super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f6231k.m25524b(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    public void onBackPressed() {
        if (!this.f6231k.m25549h()) {
            super.onBackPressed();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f6231k.m25537a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f6231k.m25543b(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }
}
