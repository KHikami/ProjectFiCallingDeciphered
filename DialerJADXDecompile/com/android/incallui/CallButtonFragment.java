package com.android.incallui;

import air;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.telecom.Call;
import android.telecom.CallAudioState;
import android.telecom.InCallService.VideoCall;
import android.telecom.VideoProfile;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnDismissListener;
import android.widget.PopupMenu.OnMenuItemClickListener;
import aq;
import ayl;
import ayn;
import ays;
import ayt;
import ayu;
import az;
import bcd;
import bcj;
import bdf;
import bdj;
import bdk;
import bdp;
import bdq;
import buf;
import com.android.dialer.dialpadview.DialpadView;
import rl;
import rq;

/* compiled from: PG */
public class CallButtonFragment extends ayn implements OnClickListener, OnDismissListener, OnMenuItemClickListener, ayu {
    private int a;
    private SparseIntArray b;
    private CompoundButton c;
    private CompoundButton d;
    private CompoundButton f;
    private CompoundButton g;
    private ImageButton h;
    private ImageButton i;
    private ImageButton j;
    private CompoundButton k;
    private ImageButton l;
    private ImageButton m;
    private CompoundButton n;
    private ImageButton o;
    private ImageButton p;
    private PopupMenu q;
    private boolean r;
    private PopupMenu s;
    private int t;
    private boolean u;
    private air v;

    public CallButtonFragment() {
        this.b = new SparseIntArray(12);
        this.t = 0;
    }

    public final /* synthetic */ bdq g() {
        return this;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (int i = 0; i < 12; i++) {
            this.b.put(i, 2);
        }
        this.a = getResources().getInteger(buf.kJ);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(buf.kS, viewGroup, false);
        this.c = (CompoundButton) inflate.findViewById(az.f);
        this.c.setOnClickListener(this);
        this.d = (CompoundButton) inflate.findViewById(az.ag);
        this.d.setOnClickListener(this);
        this.f = (CompoundButton) inflate.findViewById(az.H);
        this.f.setOnClickListener(this);
        this.g = (CompoundButton) inflate.findViewById(az.W);
        this.g.setOnClickListener(this);
        this.h = (ImageButton) inflate.findViewById(az.aK);
        this.h.setOnClickListener(this);
        this.i = (ImageButton) inflate.findViewById(az.u);
        this.i.setOnClickListener(this);
        this.j = (ImageButton) inflate.findViewById(az.v);
        this.j.setOnClickListener(this);
        this.k = (CompoundButton) inflate.findViewById(az.aL);
        this.k.setOnClickListener(this);
        this.l = (ImageButton) inflate.findViewById(az.d);
        this.l.setOnClickListener(this);
        this.m = (ImageButton) inflate.findViewById(az.ae);
        this.m.setOnClickListener(this);
        this.n = (CompoundButton) inflate.findViewById(az.an);
        this.n.setOnClickListener(this);
        this.o = (ImageButton) inflate.findViewById(az.al);
        this.o.setOnClickListener(this);
        this.p = (ImageButton) inflate.findViewById(az.ac);
        this.p.setOnClickListener(this);
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        e();
    }

    public void onClick(View view) {
        boolean z = false;
        int id = view.getId();
        String valueOf = String.valueOf(view);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 33).append("onClick(View ").append(valueOf).append(", id ").append(id).append(")...").toString());
        String str;
        String valueOf2;
        Object obj;
        int i;
        if (id == az.f) {
            str = "onAudioButtonClicked: ";
            valueOf2 = String.valueOf(CallAudioState.audioRouteToString(ayl.a.e));
            if (valueOf2.length() != 0) {
                valueOf2 = str.concat(valueOf2);
            } else {
                valueOf2 = new String(str);
            }
            bdf.a((Object) this, valueOf2);
            if (c(2)) {
                f();
            } else {
                obj = (ayt) this.e;
                if ((ayl.a.e & 2) != 0) {
                    bdf.c(obj, "toggling speakerphone not allowed when bluetooth supported.");
                    ayu ayu = (ayu) obj.i;
                    i = ayl.a.e;
                    ayu.c();
                } else {
                    if (ayl.a.c == 8) {
                        buf.H(((ayu) obj.i).getContext()).a(1003, obj.a.a, obj.a.u);
                        i = 5;
                    } else {
                        buf.H(((ayu) obj.i).getContext()).a(1002, obj.a.a, obj.a.u);
                        i = 8;
                    }
                    obj.a(i);
                }
            }
        } else if (id == az.d) {
            r0 = (ayt) this.e;
            r0.b = true;
            r0.c = ayl.a.d;
            r0.b(true);
            bdp.a().b();
        } else if (id == az.ag) {
            r0 = (ayt) this.e;
            if (!this.d.isSelected()) {
                z = true;
            }
            r0.b(z);
        } else if (id == az.ae) {
            bdp.a().d(((ayt) this.e).a.d);
            this.m.setEnabled(false);
        } else if (id == az.W) {
            r0 = (ayt) this.e;
            if (!this.g.isSelected()) {
                z = true;
            }
            if (r0.a != null) {
                if (z) {
                    str = String.valueOf(r0.a);
                    bdf.d(r0, new StringBuilder(String.valueOf(str).length() + 26).append("Putting the call on hold: ").append(str).toString());
                    Object a = bdp.a();
                    valueOf2 = r0.a.d;
                    Call a2 = bdp.a(valueOf2);
                    if (a2 != null) {
                        a2.hold();
                    } else {
                        r2 = "error holdCall, call not in call list ";
                        valueOf2 = String.valueOf(valueOf2);
                        bdf.c(a, valueOf2.length() != 0 ? r2.concat(valueOf2) : new String(r2));
                    }
                } else {
                    str = String.valueOf(r0.a);
                    bdf.d(r0, new StringBuilder(String.valueOf(str).length() + 29).append("Removing the call from hold: ").append(str).toString());
                    bdp.a().c(r0.a.d);
                }
            }
        } else if (id == az.aK) {
            r0 = (ayt) this.e;
            if (r0.a != null) {
                str = String.valueOf(r0.a);
                bdf.d(r0, new StringBuilder(String.valueOf(str).length() + 19).append("Swapping the call: ").append(str).toString());
                bdp.a().e(r0.a.d);
            }
        } else if (id == az.H) {
            obj = (ayt) this.e;
            if (!this.f.isSelected()) {
                z = true;
            }
            valueOf = "Show dialpad ";
            r2 = String.valueOf(String.valueOf(z));
            if (r2.length() != 0) {
                r2 = valueOf.concat(r2);
            } else {
                r2 = new String(valueOf);
            }
            bdf.b(obj, r2);
            ((ayu) obj.i).a(z, true);
        } else if (id == az.u) {
            r0 = (ayt) this.e;
            VideoCall j = r0.a.j();
            if (j != null) {
                j.sendSessionModifyRequest(new VideoProfile(buf.i(r0.a.k()) | 3));
                r0.a.d(1);
            }
        } else if (id == az.v) {
            VideoCall j2 = ((ayt) this.e).a.j();
            if (j2 != null) {
                j2.sendSessionModifyRequest(new VideoProfile(0));
            }
        } else if (id == az.aL) {
            r0 = (ayt) this.e;
            boolean isSelected = this.k.isSelected();
            bcd k = bcj.b().k();
            k.a(isSelected);
            r2 = r0.a.j();
            if (r2 != null) {
                String a3 = k.a();
                if (a3 != null) {
                    if (!k.b) {
                        i = 1;
                    }
                    r0.a.f.a(i);
                    r2.setCamera(a3);
                    r2.requestCameraCapabilities();
                }
            }
        } else if (id == az.an) {
            r0 = (ayt) this.e;
            if (!this.n.isSelected()) {
                z = true;
            }
            r2 = r0.a.j();
            if (r2 != null) {
                if (z) {
                    r2.setCamera(null);
                    r2.sendSessionModifyRequest(new VideoProfile(r0.a.k() & -2));
                } else {
                    r2.setCamera(bcj.b().k().a());
                    r2.sendSessionModifyRequest(new VideoProfile(r0.a.k() | 1));
                    r0.a.d(1);
                }
                ((ayu) r0.i).d(z);
            }
        } else if (id == az.al) {
            if (this.s != null) {
                this.s.show();
            }
        } else if (id == az.ac) {
            bdf.a((Object) this, "onManageVideoCallConferenceClicked");
            bcj.b().d(true);
        } else {
            bdf.f(this, "onClick: unexpected");
            return;
        }
        view.performHapticFeedback(1, 2);
    }

    public final void a() {
        air air = bcj.b().y;
        if (air != null) {
            if (this.v == null || !this.v.equals(air)) {
                LayerDrawable layerDrawable;
                View[] viewArr = new View[]{this.c, this.d, this.f, this.g, this.k, this.n};
                for (int i = 0; i < 6; i++) {
                    View view = viewArr[i];
                    LayerDrawable layerDrawable2 = (LayerDrawable) view.getBackground();
                    Resources resources = getResources();
                    ColorStateList valueOf = ColorStateList.valueOf(resources.getColor(buf.jV));
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{16842913, 16842908}, resources.getDrawable(buf.kj));
                    a(resources, stateListDrawable);
                    int[] iArr = new int[]{16842913};
                    layerDrawable = (LayerDrawable) resources.getDrawable(buf.ki);
                    ((GradientDrawable) layerDrawable.getDrawable(0)).setColor(air.b);
                    stateListDrawable.addState(iArr, layerDrawable);
                    a(resources, stateListDrawable, air);
                    layerDrawable2.setDrawableByLayerId(az.w, new RippleDrawable(valueOf, stateListDrawable, null));
                    view.invalidate();
                }
                ImageButton[] imageButtonArr = new ImageButton[]{this.h, this.i, this.j, this.l, this.m, this.o};
                for (int i2 = 0; i2 < 6; i2++) {
                    ImageButton imageButton = imageButtonArr[i2];
                    layerDrawable = (LayerDrawable) imageButton.getBackground();
                    Resources resources2 = getResources();
                    ColorStateList valueOf2 = ColorStateList.valueOf(resources2.getColor(buf.jV));
                    StateListDrawable stateListDrawable2 = new StateListDrawable();
                    a(resources2, stateListDrawable2);
                    a(resources2, stateListDrawable2, air);
                    layerDrawable.setDrawableByLayerId(az.k, new RippleDrawable(valueOf2, stateListDrawable2, null));
                    imageButton.invalidate();
                }
                this.v = air;
            }
        }
    }

    private static void a(Resources resources, StateListDrawable stateListDrawable) {
        stateListDrawable.addState(new int[]{16842908}, resources.getDrawable(buf.kl));
    }

    private static void a(Resources resources, StateListDrawable stateListDrawable, air air) {
        LayerDrawable layerDrawable = (LayerDrawable) resources.getDrawable(buf.kk);
        ((GradientDrawable) layerDrawable.getDrawable(0)).setColor(air.a);
        stateListDrawable.addState(new int[0], layerDrawable);
    }

    public final void a(boolean z) {
        this.u = z;
        this.c.setEnabled(z);
        this.d.setEnabled(z);
        this.f.setEnabled(z);
        this.g.setEnabled(z);
        this.h.setEnabled(z);
        this.i.setEnabled(z);
        this.j.setEnabled(z);
        this.k.setEnabled(z);
        this.l.setEnabled(z);
        this.m.setEnabled(z);
        this.n.setEnabled(z);
        this.o.setEnabled(z);
        this.p.setEnabled(z);
    }

    public final void a(int i, boolean z) {
        this.b.put(i, z ? 1 : 2);
    }

    public final View a(int i) {
        if (i == 0) {
            return this.c;
        }
        if (i == 1) {
            return this.d;
        }
        if (i == 2) {
            return this.f;
        }
        if (i == 3) {
            return this.g;
        }
        if (i == 4) {
            return this.h;
        }
        if (i == 5) {
            return this.i;
        }
        if (i == 7) {
            return this.j;
        }
        if (i == 6) {
            return this.k;
        }
        if (i == 8) {
            return this.l;
        }
        if (i == 9) {
            return this.m;
        }
        if (i == 10) {
            return this.n;
        }
        if (i == 11) {
            return this.p;
        }
        bdf.e(this, "Invalid button id");
        return null;
    }

    public final void b(boolean z) {
        if (this.g.isSelected() != z) {
            int i;
            this.g.setSelected(z);
            CompoundButton compoundButton = this.g;
            Context context = getContext();
            if (z) {
                i = aq.cX;
            } else {
                i = aq.cY;
            }
            compoundButton.setContentDescription(context.getString(i));
        }
    }

    public final void c(boolean z) {
        this.k.setSelected(z);
    }

    public final void d(boolean z) {
        this.n.setSelected(z);
        if (z) {
            this.n.setContentDescription(getText(aq.de));
        } else {
            this.n.setContentDescription(getText(aq.dd));
        }
    }

    public final void e(boolean z) {
        if (this.d.isSelected() != z) {
            int i;
            this.d.setSelected(z);
            CompoundButton compoundButton = this.d;
            Context context = getContext();
            if (z) {
                i = aq.cZ;
            } else {
                i = aq.da;
            }
            compoundButton.setContentDescription(context.getString(i));
        }
    }

    private final void a(int i, View view, PopupMenu popupMenu) {
        view.setVisibility(8);
        popupMenu.getMenu().add(0, i, 0, view.getContentDescription());
        this.b.put(i, 3);
    }

    public final void b() {
        int i = 0;
        int i2 = 0;
        PopupMenu popupMenu = null;
        int i3 = -1;
        View view = null;
        while (i < 12) {
            int i4 = this.b.get(i);
            View a = a(i);
            if (i4 == 1) {
                i2++;
                if (i2 <= this.a) {
                    a.setVisibility(0);
                    i3 = i;
                } else {
                    if (popupMenu == null) {
                        popupMenu = new PopupMenu(new ContextThemeWrapper(getActivity(), buf.lf), this.o);
                    }
                    if (view != null) {
                        a(i3, view, popupMenu);
                        i3 = -1;
                        view = null;
                    }
                    a(i, a, popupMenu);
                    a = view;
                }
            } else {
                if (i4 == 2) {
                    a.setVisibility(8);
                }
                a = view;
            }
            i++;
            view = a;
        }
        this.o.setVisibility(popupMenu != null ? 0 : 8);
        if (popupMenu != null) {
            this.s = popupMenu;
            this.s.setOnMenuItemClickListener(new ays(this));
        }
    }

    public final void b(int i) {
        e();
        d();
        if (this.t != i) {
            int i2 = 0;
            if (c(2)) {
                switch (i) {
                    case rq.b /*1*/:
                        i2 = aq.bQ;
                        break;
                    case rq.c /*2*/:
                        i2 = aq.bP;
                        break;
                    case rl.f /*4*/:
                        i2 = aq.bS;
                        break;
                    case rl.j /*8*/:
                        i2 = aq.bR;
                        break;
                    default:
                        break;
                }
            }
            i2 = aq.bR;
            if (i2 != 0) {
                this.c.setContentDescription(getResources().getString(i2));
            }
            this.t = i;
        }
    }

    public final void c() {
        e();
        d();
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        String valueOf = String.valueOf(menuItem);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 19).append("- onMenuItemClick: ").append(valueOf).toString());
        bdf.a((Object) this, "  id: " + menuItem.getItemId());
        valueOf = String.valueOf(menuItem.getTitle());
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 11).append("  title: '").append(valueOf).append("'").toString());
        int itemId = menuItem.getItemId();
        if (itemId == az.i) {
            itemId = 8;
        } else if (itemId == az.h || itemId == az.j) {
            itemId = 5;
        } else if (itemId == az.g) {
            itemId = 2;
        } else {
            itemId = menuItem.getItemId();
            String valueOf2 = String.valueOf(menuItem);
            bdf.c((Object) this, new StringBuilder(String.valueOf(valueOf2).length() + 64).append("onMenuItemClick:  unexpected View ID ").append(itemId).append(" (MenuItem = '").append(valueOf2).append("')").toString());
            itemId = 5;
        }
        ((ayt) this.e).a(itemId);
        return true;
    }

    public void onDismiss(PopupMenu popupMenu) {
        String valueOf = String.valueOf(popupMenu);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 13).append("- onDismiss: ").append(valueOf).toString());
        this.r = false;
        e();
    }

    private void d() {
        if (this.q != null && this.r) {
            this.q.dismiss();
            f();
        }
    }

    private final void e() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2 = 255;
        boolean z6 = true;
        boolean c = c(2);
        boolean c2 = c(8);
        if (c) {
            bdf.a((Object) this, "updateAudioButtons - popup menu mode");
            if (d(2)) {
                c = false;
                c2 = false;
                z = true;
            } else if (d(8)) {
                c = false;
                c2 = true;
                z = false;
            } else {
                c = true;
                c2 = false;
                z = false;
            }
            this.c.setSelected(false);
            z2 = c2;
            z3 = z;
            z4 = true;
            z5 = true;
            c2 = false;
            z = c;
            c = true;
        } else if (c2) {
            bdf.a((Object) this, "updateAudioButtons - speaker toggle mode");
            c = d(8);
            this.c.setSelected(c);
            c2 = true;
            z = false;
            z2 = true;
            z3 = false;
            z4 = false;
            z5 = true;
        } else {
            bdf.a((Object) this, "updateAudioButtons - disabled...");
            this.c.setSelected(false);
            c2 = true;
            z = false;
            z2 = true;
            z3 = false;
            z4 = false;
            c = false;
            z5 = false;
        }
        bdf.b((Object) this, "audioButtonEnabled: " + z5);
        bdf.b((Object) this, "audioButtonChecked: " + c);
        bdf.b((Object) this, "showMoreIndicator: " + z4);
        bdf.b((Object) this, "showBluetoothIcon: " + z3);
        bdf.b((Object) this, "showSpeakerphoneIcon: " + z2);
        bdf.b((Object) this, "showHandsetIcon: " + z);
        CompoundButton compoundButton = this.c;
        if (!(z5 && this.u)) {
            z6 = false;
        }
        compoundButton.setEnabled(z6);
        this.c.setChecked(c);
        LayerDrawable layerDrawable = (LayerDrawable) this.c.getBackground();
        String valueOf = String.valueOf(layerDrawable);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 19).append("'layers' drawable: ").append(valueOf).toString());
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(az.w);
        if (c2) {
            i = 255;
        } else {
            i = 0;
        }
        findDrawableByLayerId.setAlpha(i);
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(az.af);
        if (z4) {
            i = 255;
        } else {
            i = 0;
        }
        findDrawableByLayerId2.setAlpha(i);
        findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(az.l);
        if (z3) {
            i = 255;
        } else {
            i = 0;
        }
        findDrawableByLayerId2.setAlpha(i);
        findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(az.T);
        if (z) {
            i = 255;
        } else {
            i = 0;
        }
        findDrawableByLayerId2.setAlpha(i);
        Drawable findDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(az.aI);
        if (!z2) {
            i2 = 0;
        }
        findDrawableByLayerId3.setAlpha(i2);
    }

    private final void f() {
        boolean z = false;
        bdf.a((Object) this, "showAudioPopup()...");
        this.q = new PopupMenu(new ContextThemeWrapper(getActivity(), buf.lf), this.c);
        this.q.getMenuInflater().inflate(buf.lb, this.q.getMenu());
        this.q.setOnMenuItemClickListener(this);
        this.q.setOnDismissListener(this);
        Menu menu = this.q.getMenu();
        menu.findItem(az.i).setEnabled(c(8));
        MenuItem findItem = menu.findItem(az.h);
        MenuItem findItem2 = menu.findItem(az.j);
        boolean c = c(4);
        findItem.setVisible(!c);
        if (!c) {
            z = true;
        }
        findItem.setEnabled(z);
        findItem2.setVisible(c);
        findItem2.setEnabled(c);
        menu.findItem(az.g).setEnabled(c(2));
        this.q.show();
        this.r = true;
    }

    public final void a(boolean z, boolean z2) {
        if (getActivity() != null && (getActivity() instanceof InCallActivity)) {
            boolean z3;
            InCallActivity inCallActivity = (InCallActivity) getActivity();
            if (!(z && inCallActivity.a()) && (z || inCallActivity.a())) {
                if (z2) {
                    if (z) {
                        inCallActivity.a("tag_dialpad_fragment", true, true);
                        ((DialpadView) inCallActivity.c.getView().findViewById(az.K)).a();
                    }
                    inCallActivity.c.getView().startAnimation(z ? inCallActivity.e : inCallActivity.f);
                } else {
                    inCallActivity.a("tag_dialpad_fragment", z, true);
                }
                inCallActivity.b.h(z);
                bdk bdk = bcj.b().p;
                if (bdk != null) {
                    bdk.f = z;
                    bdk.a();
                }
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int i;
                this.f.setSelected(z);
                CompoundButton compoundButton = this.f;
                Context context = getContext();
                if (z) {
                    i = aq.dc;
                } else {
                    i = aq.db;
                }
                compoundButton.setContentDescription(context.getString(i));
            }
        }
    }

    public Context getContext() {
        return getActivity();
    }

    public void onResume() {
        if (this.e != null) {
            ayt ayt = (ayt) this.e;
            if (ayt.b && ayl.a.d != ayt.c) {
                if (ayt.i != null) {
                    ayt.b(ayt.c);
                }
            }
            ayt.b = false;
        }
        super.onResume();
        a();
    }

    private final boolean c(int i) {
        return i == (ayl.a.e & i);
    }

    private final boolean d(int i) {
        return i == ayl.a.c;
    }

    public final /* synthetic */ bdj h() {
        return new ayt();
    }
}
