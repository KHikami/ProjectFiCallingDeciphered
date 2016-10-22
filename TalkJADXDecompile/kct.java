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
    public final kcz F;
    private int n;

    public kct() {
        super((byte) 0);
        this.F = new kcz();
    }

    public final kbu getLifecycle() {
        return this.F;
    }

    public void onCreate(Bundle bundle) {
        this.F.c(bundle);
        super.onCreate(bundle);
    }

    protected void onPostCreate(Bundle bundle) {
        this.F.a(bundle);
        super.onPostCreate(bundle);
    }

    public void onStart() {
        ba.a(J_());
        this.F.i();
        super.onStart();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.F.b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        ba.a(J_());
        this.F.j();
        super.onResume();
    }

    public void onPostResume() {
        this.F.a();
        super.onPostResume();
    }

    public void onPause() {
        this.F.b();
        super.onPause();
    }

    public void onStop() {
        this.F.k();
        super.onStop();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.F.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        this.F.c();
        super.onDestroy();
    }

    public void onAttachedToWindow() {
        this.F.d();
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.F.e();
        super.onDetachedFromWindow();
    }

    public void onWindowFocusChanged(boolean z) {
        this.F.a(z);
        super.onWindowFocusChanged(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.F.a(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.F.a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.F.a(i, strArr, iArr);
    }

    public void onLowMemory() {
        this.F.l();
        super.onLowMemory();
    }

    public void startActivity(Intent intent) {
        c(intent);
        super.startActivity(intent);
        j();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        c(intent);
        super.startActivity(intent, bundle);
        j();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        c(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
        j();
    }

    public void startActivityForResult(Intent intent, int i) {
        c(intent);
        super.startActivityForResult(intent, i);
        j();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        c(intent);
        super.startActivityForResult(intent, i, bundle);
        j();
    }

    private void c(Intent intent) {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.F.b(intent);
        }
    }

    private void j() {
        this.n--;
    }

    public void onNewIntent(Intent intent) {
        this.F.a(intent);
        super.onNewIntent(intent);
    }

    protected void onUserLeaveHint() {
        this.F.f();
        super.onUserLeaveHint();
    }

    public void finish() {
        this.F.g();
        super.finish();
    }

    public void a(wx wxVar) {
        this.F.a(wxVar);
        super.a(wxVar);
    }

    public void b(wx wxVar) {
        this.F.b(wxVar);
        super.b(wxVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.F.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.F.a(contextMenu, view, contextMenuInfo);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.F.a(menuItem) || super.onContextItemSelected(menuItem);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.F.a(menu) || super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.F.b(menu) || super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.F.b(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    public void onBackPressed() {
        if (!this.F.h()) {
            super.onBackPressed();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.F.a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.F.b(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    public void a(dr drVar) {
        this.F.a(drVar);
        super.a(drVar);
    }
}
