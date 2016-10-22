package com.google.android.apps.hangouts.fragments;

import ahg;
import ahk;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import azl;
import ba;
import bc;
import bko;
import bnn;
import bnq;
import cyo;
import dex;
import dw;
import ehz;
import eia;
import eie;
import fde;
import fsi;
import gjo;
import gjx;
import gkc;
import gkt;
import gol;
import gwb;
import ig;
import iil;
import java.util.Collections;
import jcu;
import jyn;
import jyy;

public final class BabelPhotoViewFragment extends ahg implements bnq {
    private Drawable av;
    private bko aw;

    public class StoragePermissionHelperActivity extends jyy {
        public StoragePermissionHelperActivity() {
            new jcu(this, this.k).a(this.j);
        }

        protected void a(Bundle bundle) {
            super.a(bundle);
            ((eia) this.j.a(eia.class)).a(ba.ea, new cyo(this));
        }

        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            if (bundle == null) {
                ((eia) this.j.a(eia.class)).a(new eie(ba.ea, 2667), Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"));
            }
        }
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (ahk) obj);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        dw activity = getActivity();
        this.aw = fde.e(activity.getIntent().getIntExtra("account_id", -1));
        if (this.aw == null) {
            activity.finish();
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(gwb.hP, menu);
    }

    public void onPrepareOptionsMenu(Menu menu) {
        menu.findItem(ba.eV).setVisible(this.av != null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != ba.eV || this.av == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (((ehz) jyn.a(getActivity().getApplicationContext(), ehz.class)).a("android.permission.WRITE_EXTERNAL_STORAGE")) {
            u();
        } else {
            Intent intent = new Intent(getContext(), StoragePermissionHelperActivity.class);
            intent.putExtra("account_id", this.aw.g());
            startActivityForResult(intent, 1);
        }
        return true;
    }

    public static BabelPhotoViewFragment a(Intent intent, int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg-intent", intent);
        bundle.putInt("arg-position", i);
        bundle.putBoolean("arg-show-spinner", z);
        BabelPhotoViewFragment babelPhotoViewFragment = new BabelPhotoViewFragment();
        babelPhotoViewFragment.setArguments(bundle);
        return babelPhotoViewFragment;
    }

    public void onResume() {
        super.onResume();
        if (this.av != null && (this.av instanceof gol)) {
            ((gol) this.av).a();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.av != null && (this.av instanceof gol)) {
            ((gol) this.av).b();
        }
    }

    public void a(ig<ahk> igVar, ahk ahk) {
        if (ahk.c == 0) {
            super.a((ig) igVar, ahk);
            if (igVar.p() == 3) {
                this.av = ahk.a(getResources());
                if (this.av instanceof gol) {
                    ((gol) this.av).a();
                }
                dw activity = getActivity();
                if (activity != null) {
                    activity.F_();
                }
            }
        }
    }

    private void u() {
        String stringExtra = this.d.getStringExtra("content_type");
        dex dex = (dex) jyn.a(getContext(), dex.class);
        if (dex.c()) {
            dex.a(this.a, new gjx(getContext(), stringExtra), new azl());
            return;
        }
        gkc gkc = new gkc(this.a, this.aw.a());
        gkc.e(true);
        ((fsi) jyn.a(getActivity().getApplicationContext(), fsi.class)).c(new bnn(gkc, this, stringExtra, true, null));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            u();
        } else {
            Toast.makeText(getActivity(), bc.sW, 0).show();
        }
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.a("Expected null", (Object) gjo);
        iil.a("Expected null", (Object) gkt);
        Context activity = getActivity();
        if (activity != null) {
            Toast.makeText(activity, z ? bc.sX : bc.sW, 0).show();
        }
    }
}
