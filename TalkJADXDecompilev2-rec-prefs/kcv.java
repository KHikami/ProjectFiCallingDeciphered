package p000;

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
    public final kbn lifecycle = new kbn();

    public final kbu getLifecycle() {
        return this.lifecycle;
    }

    public void onCreate(Bundle bundle) {
        this.lifecycle.m25526c(bundle);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.lifecycle.m25560b(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.lifecycle.m25558a(view, bundle);
        super.onViewCreated(view, bundle);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.lifecycle.m25518a(contextMenu, view, contextMenuInfo);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.lifecycle.m25520a(menuItem) || super.onContextItemSelected(menuItem);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.lifecycle.m25519a(menu)) {
            setHasOptionsMenu(true);
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        if (this.lifecycle.m25523b(menu)) {
            setHasOptionsMenu(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.lifecycle.m25524b(menuItem);
    }

    public void onAttach(Activity activity) {
        this.lifecycle.m25556a(activity);
        super.onAttach(activity);
    }

    public void onActivityCreated(Bundle bundle) {
        this.lifecycle.m25557a(bundle);
        super.onActivityCreated(bundle);
    }

    public void onStart() {
        ba.m4570a(getChildFragmentManager());
        this.lifecycle.m25528i();
        super.onStart();
    }

    public void onResume() {
        ba.m4570a(getChildFragmentManager());
        this.lifecycle.m25529j();
        super.onResume();
    }

    public void onPause() {
        this.lifecycle.mo3637b();
        super.onPause();
    }

    public void onStop() {
        this.lifecycle.m25530k();
        super.onStop();
    }

    public void onDestroyView() {
        this.lifecycle.m25555a();
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.lifecycle.m25527d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        this.lifecycle.mo3638c();
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.lifecycle.m25517a(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.lifecycle.m25515a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.lifecycle.m25516a(i, strArr, iArr);
    }

    public void onLowMemory() {
        this.lifecycle.m25531l();
        super.onLowMemory();
    }

    public void setUserVisibleHint(boolean z) {
        this.lifecycle.m25559a(z);
        super.setUserVisibleHint(z);
    }

    public void onDetach() {
        this.lifecycle.m25562d();
        super.onDetach();
    }
}
