package defpackage;

import android.app.Activity;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.TextView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class ddv extends cyp implements czp, fh<Cursor> {
    private czo aj;
    private czo ak;
    private ViewGroup al;
    private boolean am;
    private Cursor an;
    private final ddx ao = new ddx(this);
    private jca i;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a((Cursor) obj);
    }

    public void a(fsb fsb, czo czo) {
        if (czo != this.ak) {
            glk.e("Babel", "Unexpected contact lookup load state.", new Object[0]);
            iil.a("Should not have two new items.");
            return;
        }
        this.ak = null;
        if (fsb == this.c && this.e != null) {
            if (this.aj != null) {
                this.aj.a();
            }
            this.aj = czo;
            this.e.a(this.aj);
            if (b() != null) {
                b().invalidateViews();
            }
        }
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.i = (jca) this.binder.a(jca.class);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle, gwb.hq);
        this.al = (ViewGroup) onCreateView.findViewById(ba.cV);
        if (this.f != null) {
            this.f.getViewTreeObserver().addOnGlobalLayoutListener(this.ao);
        }
        ((TextView) onCreateView.findViewById(ba.Z)).setOnClickListener(new ddw(this));
        registerForContextMenu(b());
        return onCreateView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        gwb.a(this.f, this.ao);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.ak != null) {
            this.ak.cancel(true);
            this.ak = null;
        }
        if (this.aj != null) {
            this.aj.a();
            this.aj = null;
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        if (view == b()) {
            if (contextMenuInfo instanceof AdapterContextMenuInfo) {
                gnj gnj = (gnj) ((AdapterContextMenuInfo) contextMenuInfo).targetView;
                if (!(gnj.i() || gnj.b() == null || TextUtils.isEmpty(gnj.b().b()))) {
                    contextMenu.add(0, 2, 0, bc.k);
                }
                contextMenu.add(0, 1, 0, bc.gf);
            }
            contextMenu.setHeaderTitle(bc.gn);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        ContextMenuInfo menuInfo = menuItem.getMenuInfo();
        int itemId = menuItem.getItemId();
        if (menuInfo instanceof AdapterContextMenuInfo) {
            gnj gnj = (gnj) ((AdapterContextMenuInfo) menuInfo).targetView;
            if (itemId == 1) {
                if (gnj.d() != null) {
                    RealTimeChatService.a(r(), new String[]{r0});
                }
                return true;
            } else if (itemId == 2) {
                startActivityForResult(gwb.A(gnj.b().b()), 102);
                return true;
            }
        }
        return false;
    }

    public boolean q() {
        if (!super.q()) {
            return false;
        }
        this.am = true;
        t();
        return true;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        t();
    }

    private void t() {
        if (this.am) {
            if (this.ak != null) {
                this.ak.cancel(true);
                this.ak = null;
            }
            if (isAdded()) {
                ig b = getLoaderManager().b(1, null, this);
                if (b != null) {
                    b.v();
                }
                this.am = false;
                return;
            }
            this.am = true;
        }
    }

    public void a(fsb fsb, hwl hwl, hwq hwq) {
        super.a(fsb, hwl, hwq);
        if (fsb == this.c && this.e != null) {
            MemoryInfo memoryInfo = new MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            if (hwl != null && memoryInfo.getTotalPss() - (hwl.a() / 10) < 4096) {
                glk.d("Babel", "Lots of contacts, or low memory, or both, clearing cache.", new Object[0]);
                if (this.aj != null) {
                    this.aj.a();
                    this.aj = null;
                    this.e.a(null);
                }
            }
            if (this.ak != null) {
                this.ak.cancel(true);
            }
            this.ak = new czo(gwb.H(), hwl, fsb, this);
            this.ak.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        bko r = r();
        if (i != 1 || r == null) {
            return null;
        }
        return gwb.a(r(), false, 0);
    }

    public void a(Cursor cursor) {
        if (!cursor.equals(this.an)) {
            this.an = cursor;
            if (this.e != null) {
                dab bom = new bom(cursor);
                if (this.aj != null) {
                    bom.a(this.aj);
                }
                a(0, bom);
            }
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
    }

    protected agh[] a() {
        return new agh[]{new agh(false, false, (byte) 0)};
    }

    protected boolean isEmpty() {
        return false;
    }

    protected void a(int i, dab dab) {
        super.a(i, dab);
        if (this.e == null) {
            return;
        }
        if (this.e.getCount() > 0) {
            this.al.setVisibility(0);
        } else {
            this.al.setVisibility(4);
        }
    }
}
