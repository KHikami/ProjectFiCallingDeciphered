import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class kcv extends dr implements kbt {
    public final kbn lifecycle;

    public kcv() {
        this.lifecycle = new kbn();
    }

    public final kbu getLifecycle() {
        return this.lifecycle;
    }

    public void onCreate(Bundle bundle) {
        this.lifecycle.c(bundle);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.lifecycle.b(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.lifecycle.a(view, bundle);
        super.onViewCreated(view, bundle);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.lifecycle.a(contextMenu, view, contextMenuInfo);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.lifecycle.a(menuItem) || super.onContextItemSelected(menuItem);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.lifecycle.a(menu)) {
            setHasOptionsMenu(true);
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        if (this.lifecycle.b(menu)) {
            setHasOptionsMenu(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.lifecycle.b(menuItem);
    }

    public void onAttach(Activity activity) {
        this.lifecycle.a(activity);
        super.onAttach(activity);
    }

    public void onActivityCreated(Bundle bundle) {
        this.lifecycle.a(bundle);
        super.onActivityCreated(bundle);
    }

    public void onStart() {
        ba.a(getChildFragmentManager());
        this.lifecycle.i();
        super.onStart();
    }

    public void onResume() {
        ba.a(getChildFragmentManager());
        this.lifecycle.j();
        super.onResume();
    }

    public void onPause() {
        this.lifecycle.b();
        super.onPause();
    }

    public void onStop() {
        this.lifecycle.k();
        super.onStop();
    }

    public void onDestroyView() {
        this.lifecycle.a();
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.lifecycle.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        this.lifecycle.c();
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.lifecycle.a(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.lifecycle.a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.lifecycle.a(i, strArr, iArr);
    }

    public void onLowMemory() {
        this.lifecycle.l();
        super.onLowMemory();
    }

    public void setUserVisibleHint(boolean z) {
        this.lifecycle.a(z);
        super.setUserVisibleHint(z);
    }

    public void onDetach() {
        this.lifecycle.d();
        super.onDetach();
    }
}
