package com.google.android.apps.hangouts.conversation.peopleandoptions.impl;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import ba;
import bbm;
import bcj;
import bkh;
import bko;
import bxt;
import byo;
import byp;
import byq;
import byu;
import bza;
import bzk;
import bzl;
import cam;
import cas;
import cat;
import cbm;
import dah;
import dcj;
import dw;
import ed;
import edk;
import fde;
import fh;
import fyi;
import glk;
import gor;
import gos;
import gwb;
import ig;
import iie;
import iih;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import jca;

public class PeopleAndOptionsFragment extends dcj implements fh<Cursor> {
    public final byq a;
    private cbm aj;
    private boolean ak;
    private boolean al;
    private final gor am;
    private gos an;
    public iih b;
    public bko c;
    private jca d;
    private bbm e;
    private byp f;
    private ListView g;
    private byo h;
    private dah i;

    public PeopleAndOptionsFragment() {
        this.a = new byq();
        this.ak = false;
        this.al = false;
        this.am = new gor();
        this.an = new gos();
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (Cursor) obj);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.a(byq.class, this.a);
        this.binder.a(Activity.class, getActivity());
        this.binder.a(dw.class, getActivity());
        this.binder.a(ed.class, getFragmentManager());
        this.d = (jca) this.binder.a(jca.class);
        this.e = (bbm) this.binder.a(bbm.class);
        this.f = (byp) this.binder.a(byp.class);
        this.b = (iih) this.binder.a(iih.class);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Intent intent = activity.getIntent();
        this.a.a(intent.getStringExtra("conversation_id"));
        this.a.b(intent.getStringExtra("conversation_name"));
        this.a.c(intent.getIntExtra("notification_level", 10));
        this.a.a(intent.getIntExtra("client_conversation_type", 0));
        this.a.a(intent.getLongExtra("latest_timestamp", 0));
        this.a.a(intent.getBooleanExtra("has_unknown_sender", false));
        this.a.e(intent.getStringExtra("chat_ringtone_uri"));
        this.a.f(intent.getStringExtra("hangout_ringtone_uri"));
        this.a.d(intent.getIntExtra("is_group_link_sharing_enabled", 0));
        if (this.a.n() == 0) {
            glk.e("Babel", "Group link sharing status should not be set to unknown.", new Object[0]);
        }
        this.a.b(intent.getBooleanExtra("is_conversation_guest", false));
        this.a.g(intent.getStringExtra("group_conversation_link"));
        this.a.a(intent.getStringArrayExtra("merged_conversation_ids"));
        this.a.c(intent.getStringExtra("preferred_chat_id"));
        this.a.d(intent.getStringExtra("preferred_gaia_id"));
        this.a.b(null);
        if (this.a.b().length == 0) {
            glk.e("Babel", "should not have mergedConversationIds.length == 0", new Object[0]);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getActivity().getIntent();
        this.c = fde.e(this.d.a());
        this.a.b(intent.getIntExtra("transport_type", this.c.z()));
        getActivity().setResult(0);
        setHasOptionsMenu(true);
        this.a.p().d(null, null);
    }

    public void onDestroy() {
        super.onDestroy();
        this.g.setAdapter(null);
        this.i.b();
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(gwb.gd, viewGroup, false);
        boolean a = a();
        this.h = this.f.a(Arrays.asList(new Class[]{bza.class, cam.class, cas.class, cat.class, byu.class, bzk.class, bzl.class}));
        this.aj = new cbm(this.context, this.c, this.a.q(), a, this.a.o(), this.am, this.an);
        this.i = new dah(this.context, this.h, this.aj);
        this.g = (ListView) inflate.findViewById(ba.db);
        this.g.addHeaderView(layoutInflater.inflate(gwb.ha, this.g, false));
        this.g.setAdapter(this.i);
        getLoaderManager().a(1025, new Bundle(), this).t();
        if (!this.al) {
            this.b.a(this.c.g()).b().c(3265);
            this.al = true;
        }
        return inflate;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(gwb.hK, menu);
    }

    public void onPrepareOptionsMenu(Menu menu) {
        boolean z = true;
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(ba.ew);
        MenuItem findItem2 = menu.findItem(ba.ez);
        MenuItem findItem3 = menu.findItem(ba.ev);
        boolean a = a();
        if (this.a.d() == 2) {
            boolean z2 = (a || this.a.o()) ? false : true;
            findItem.setVisible(z2);
            findItem2.setVisible(false);
            if (a) {
                z = false;
            }
            findItem3.setVisible(z);
            return;
        }
        findItem.setVisible(false);
        if (this.e.g(this.d.a()) || ((a && !fyi.a(this.c.g(), this.a.e())) || this.a.h())) {
            z = false;
        }
        findItem2.setVisible(z);
        findItem3.setVisible(false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        super.onOptionsItemSelected(menuItem);
        iie b = this.b.a(this.d.a()).b();
        if (menuItem.getItemId() == ba.ew || menuItem.getItemId() == ba.ez) {
            int i;
            if (menuItem.getItemId() == ba.ew) {
                i = 3296;
            } else {
                i = 3297;
            }
            b.c(i);
            if (this.ak) {
                return false;
            }
            bcj bcj;
            Collection f;
            bxt bxt;
            if (this.a.d() == 2) {
                bcj = bcj.INVITE_MORE_TO_GROUPCHAT;
                f = this.a.p().f();
            } else if (this.a.r() == null) {
                return false;
            } else {
                bcj = bcj.UPGRADE_TO_GROUPCHAT;
                f = new ArrayList();
                f.add(this.a.r());
            }
            Activity activity = getActivity();
            if (gwb.i(this.a.e())) {
                bxt = bxt.SMS_MESSAGE;
            } else {
                bxt = bxt.HANGOUTS_MESSAGE;
            }
            Intent a = gwb.a(this.c, this.a.a(), f, bcj, bxt);
            Intent intent = (Intent) activity.getIntent().getParcelableExtra("share_intent");
            if (intent != null) {
                intent.putExtra("conversation_id", this.a.a());
                a.putExtra("share_intent", intent);
            }
            activity.startActivityForResult(a, 101);
            this.ak = true;
            return true;
        } else if (menuItem.getItemId() != ba.ev) {
            return false;
        } else {
            b.c(3298);
            if (this.a.p().d()) {
                return false;
            }
            if (this.a.d() == 2) {
                bxt bxt2;
                if (gwb.i(this.a.e())) {
                    bxt2 = bxt.SMS_MESSAGE;
                } else {
                    bxt2 = bxt.HANGOUTS_MESSAGE;
                }
                startActivity(gwb.a(this.c, this.a.a(), this.a.p().f(), bcj.FORK_CONVERSATION, bxt2));
                getActivity().finish();
                return true;
            }
            String str = "Babel";
            String str2 = "should not call forkGroupConversation on a conversation which is not a group conversation ";
            String valueOf = String.valueOf(this.a.a());
            glk.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            return false;
        }
    }

    public void onResume() {
        super.onResume();
        this.ak = false;
    }

    protected boolean isEmpty() {
        return false;
    }

    private boolean a() {
        return gwb.i(this.a.e());
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        switch (i) {
            case 1025:
                this.a.p().d(this.c, this.a.a());
                return this.a.p().a(bkh.a);
            default:
                return null;
        }
    }

    public void a(ig<Cursor> igVar, Cursor cursor) {
        boolean z = false;
        switch (igVar.p()) {
            case 1025:
                this.a.p().a(cursor);
                if (this.a.d() == 1) {
                    int i = 0;
                    for (edk edk : this.a.p().b()) {
                        if (Boolean.TRUE.equals(edk.i)) {
                            this.a.c(true);
                        }
                        if (this.a.q() == null || TextUtils.isEmpty(edk.c)) {
                            this.a.a(edk);
                            if (this.a.q().e == null) {
                                this.a.q().e = "";
                            }
                        }
                        i++;
                        if (this.a.r() == null) {
                            boolean a = a();
                            if ((a && TextUtils.equals(edk.b.b, this.a.i())) || (!a && TextUtils.equals(edk.b.a, this.a.j()))) {
                                this.a.b(edk);
                            }
                        }
                    }
                    byq byq = this.a;
                    if (i > 1) {
                        z = true;
                    }
                    byq.d(z);
                }
                this.a.u();
                this.aj.a(cursor);
            default:
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        switch (igVar.p()) {
            case 1025:
                this.aj.a(null);
            default:
        }
    }
}
