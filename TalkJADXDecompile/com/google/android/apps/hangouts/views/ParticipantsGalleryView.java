package com.google.android.apps.hangouts.views;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ba;
import bbl;
import bko;
import blc;
import edk;
import edo;
import fde;
import gir;
import gkq;
import gld;
import glk;
import gqk;
import gql;
import gqm;
import gqn;
import gqo;
import gqp;
import gqr;
import gwb;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import jca;
import jyn;
import kae;
import wi;

public class ParticipantsGalleryView extends FrameLayout implements gir {
    public static final boolean a;
    public gqn b;
    public final int c;
    public int d;
    public final gkq<OverlayedAvatarView> e;
    public boolean f;
    public final Handler g;
    public final Queue<gqr> h;
    public boolean i;
    private boolean j;
    private boolean k;
    private gir l;
    private LayoutTransition m;
    private LayoutTransition n;
    private final int o;
    private int p;
    private final ViewGroup q;
    private int r;
    private final gkq<Runnable> s;
    private int t;
    private bko u;

    static {
        kae kae = glk.u;
        a = false;
    }

    public ParticipantsGalleryView(Context context) {
        this(context, null);
    }

    public ParticipantsGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = -1;
        this.e = new gkq();
        this.s = new gkq();
        this.f = true;
        this.t = 0;
        this.u = null;
        this.g = new gqo(this);
        this.h = new LinkedList();
        this.i = false;
        this.u = fde.e(((jca) jyn.a(context, jca.class)).a());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, bbl.au, 0, 0);
        try {
            this.k = obtainStyledAttributes.getBoolean(bbl.av, false);
            LayoutInflater.from(context).inflate(gwb.hl, this, true);
            this.q = (ViewGroup) findViewById(ba.dU);
            this.o = getResources().getInteger(gwb.fE);
            this.c = getResources().getInteger(gwb.fB);
            LayoutTransition layoutTransition = new LayoutTransition();
            int a = blc.a(getContext());
            layoutTransition.setAnimator(3, ObjectAnimator.ofFloat(null, "translationY", new float[]{0.0f, (float) (a + 20)}));
            layoutTransition.setAnimator(2, ObjectAnimator.ofFloat(null, "translationY", new float[]{(float) (a + 20), 0.0f}));
            layoutTransition.setStartDelay(2, layoutTransition.getDuration(0));
            layoutTransition.setDuration((long) this.o);
            this.n = layoutTransition;
            layoutTransition = new LayoutTransition();
            layoutTransition.setAnimator(3, ObjectAnimator.ofFloat(null, "alpha", new float[]{1.0f, 0.0f}));
            layoutTransition.setAnimator(2, ObjectAnimator.ofFloat(null, "alpha", new float[]{0.0f, 1.0f}));
            layoutTransition.setDuration((long) this.o);
            layoutTransition.setStartDelay(1, layoutTransition.getDuration(3));
            this.m = layoutTransition;
            this.q.setLayoutTransition(this.n);
            a();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void a(gir gir) {
        this.l = gir;
    }

    public void b() {
        a();
    }

    public void a() {
        synchronized (this.e) {
            StringBuilder stringBuilder = new StringBuilder();
            for (OverlayedAvatarView overlayedAvatarView : this.e.values()) {
                if (!(overlayedAvatarView == null || TextUtils.isEmpty(overlayedAvatarView.getContentDescription()))) {
                    gld.a(stringBuilder, overlayedAvatarView.getContentDescription());
                }
            }
            if (stringBuilder.length() == 0) {
                setContentDescription(null);
            } else {
                int i;
                Resources resources = getResources();
                if (this.j) {
                    i = gwb.hV;
                } else {
                    i = gwb.io;
                }
                setContentDescription(resources.getQuantityString(i, this.e.size(), new Object[]{stringBuilder.toString()}));
            }
        }
        if (this.l != null) {
            this.l.b();
        }
    }

    public void a(gqn gqn) {
        this.b = gqn;
    }

    public void a(int i) {
        setTranslationY((float) i);
        setVisibility(0);
    }

    public void c() {
        if (getVisibility() == 0) {
            setVisibility(8);
        }
    }

    public boolean a(edo edo) {
        synchronized (this.e) {
            OverlayedAvatarView overlayedAvatarView = (OverlayedAvatarView) this.e.get(edo);
            if (overlayedAvatarView != null) {
                boolean z;
                if (overlayedAvatarView.d() || overlayedAvatarView.e()) {
                    z = true;
                } else {
                    z = false;
                }
                return z;
            }
            return false;
        }
    }

    private void a(gqr gqr) {
        this.h.offer(gqr);
        if (!this.i && !this.g.hasMessages(0)) {
            this.g.sendEmptyMessage(0);
        }
    }

    public boolean d() {
        return this.f;
    }

    public void a(edk edk, int i, boolean z) {
        if (edk == null) {
            glk.e("Babel", "ParticipantsGalleryView.setParticipantState: null participant", new Object[0]);
            return;
        }
        if (a) {
            Throwable th = new Throwable();
            String valueOf = String.valueOf(edk.b.b);
            a(th, null, new StringBuilder(String.valueOf(valueOf).length() + 43).append("+++ SetParticipantState ").append(valueOf).append(" setBit=").append(i).toString());
        }
        a(new gqp(edk, i, true, true));
    }

    public void b(edk edk, int i, boolean z) {
        if (edk == null) {
            glk.e("Babel", "ParticipantsGalleryView.unsetParticipantState: null participant", new Object[0]);
            return;
        }
        if (a) {
            Throwable th = new Throwable();
            String valueOf = String.valueOf(edk.b.b);
            a(th, null, new StringBuilder(String.valueOf(valueOf).length() + 47).append("--- unsetParticipantState ").append(valueOf).append(" unsetBit=").append(i).toString());
        }
        a(new gqp(edk, i, false, z));
    }

    public void a(edk edk) {
        if (edk != null && edk.b != null && this.e.containsKey(edk.b)) {
            b(edk, 2, false);
        }
    }

    public void a(List<edk> list, boolean z) {
        if (a) {
            Throwable th = new Throwable();
            String str = "--- UnsetWatermarkBatch ";
            String valueOf = String.valueOf(a((List) list));
            a(th, null, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        a(new gqm(list, false, z));
    }

    public void b(List<edk> list, boolean z) {
        if (a) {
            Throwable th = new Throwable();
            String str = "+++ SetWatermarkBatch ";
            String valueOf = String.valueOf(a((List) list));
            a(th, null, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        a(new gqm(list, true, z));
    }

    private static String a(List<edk> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (edk edk : list) {
            stringBuilder.append(edk.b.b).append(" ");
        }
        return stringBuilder.toString();
    }

    public boolean c(edk edk, int i, boolean z) {
        OverlayedAvatarView c = c(edk);
        boolean z2 = c.a() == 1;
        if (z) {
            if (z2) {
                this.q.setLayoutTransition(this.m);
            } else {
                this.q.setLayoutTransition(this.n);
            }
            a(c, i);
        } else {
            f();
            a(c, i);
        }
        synchronized (this.e) {
            this.e.remove(edk.b);
        }
        a();
        return true;
    }

    public boolean a(gql gql, edk edk, OverlayedAvatarView overlayedAvatarView, int i, int i2) {
        ViewGroup viewGroup = this.q;
        a(i, 0);
        int b = b(i2);
        a(0, i);
        if (viewGroup.getChildAt(b) != overlayedAvatarView) {
            overlayedAvatarView.f(i2);
            if (a) {
                a(null, overlayedAvatarView, "Move (start) " + i + " -> " + i2);
            }
            this.q.setLayoutTransition(this.m);
            a(overlayedAvatarView, i);
            Runnable gqk = new gqk(this, overlayedAvatarView, edk, gql, i, i2);
            postDelayed(gqk, (long) this.o);
            a(edk, gqk);
            return false;
        }
        a(i, i2);
        overlayedAvatarView.e(i2);
        if (!a) {
            return true;
        }
        a(null, overlayedAvatarView, "Move " + i + " -> " + i2);
        return true;
    }

    public void a(edk edk, OverlayedAvatarView overlayedAvatarView, int i, boolean z) {
        Object obj = 1;
        int b = b(i);
        overlayedAvatarView.e(i);
        synchronized (this.e) {
            this.e.put(edk.b, overlayedAvatarView);
        }
        a();
        if (overlayedAvatarView.a() != 1) {
            obj = null;
        }
        if (!z) {
            f();
        } else if (obj != null) {
            this.q.setLayoutTransition(this.m);
        } else {
            this.q.setLayoutTransition(this.n);
        }
        a(overlayedAvatarView, b, i, edk.e, edk.h);
    }

    private void a(int i, int i2) {
        switch (OverlayedAvatarView.b(i)) {
            case wi.j /*1*/:
                break;
            case wi.l /*2*/:
            case wi.h /*4*/:
                this.r--;
                break;
        }
        this.d--;
        switch (OverlayedAvatarView.b(i2)) {
            case wi.j /*1*/:
                break;
            case wi.l /*2*/:
            case wi.h /*4*/:
                this.r++;
                break;
            default:
                return;
        }
        this.d++;
    }

    private void a(OverlayedAvatarView overlayedAvatarView, int i) {
        if (a) {
            String valueOf = String.valueOf(overlayedAvatarView.g());
            String str = this.j ? "focus gallery." : "watermark.";
            new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(str).length()).append("[PartGallery] Removing from layout ").append(valueOf).append(" in ").append(str);
        }
        if (this.q.indexOfChild(overlayedAvatarView) >= 0) {
            a(i, 0);
            this.q.removeView(overlayedAvatarView);
        } else {
            glk.e("Babel", "removeAvatarViewFromLayout: removing an avatar not inserted", new Object[0]);
            if (a) {
                a(null, null, "------> ERROR <------ : Removing an avatar not inserted");
            }
        }
        if (a) {
            a(new Throwable(), overlayedAvatarView, "Remove " + i);
        }
    }

    public void a(OverlayedAvatarView overlayedAvatarView, int i, int i2, String str, String str2) {
        if (a) {
            String valueOf = String.valueOf(overlayedAvatarView.g());
            String str3 = this.j ? "focus gallery." : "watermark.";
            new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(str3).length()).append("[PartGallery] Inserting ").append(valueOf).append(" into ").append(str3);
        }
        this.q.endViewTransition(overlayedAvatarView);
        if (this.q.indexOfChild(overlayedAvatarView) >= 0 || i < 0 || i > this.q.getChildCount()) {
            glk.e("Babel", "insertAvatarViewIntoLayout: inserting already inserted @" + this.q.indexOfChild(overlayedAvatarView) + ", or wrong index " + i + " with ViewGroup size " + this.q.getChildCount(), new Object[0]);
            if (a) {
                a(null, null, "------> ERROR <------ : Inserting already inserted @" + this.q.indexOfChild(overlayedAvatarView) + ", or wrong index " + i + " with ViewGroup size " + this.q.getChildCount());
            }
        } else {
            a(0, i2);
            this.q.addView(overlayedAvatarView, i);
            overlayedAvatarView.a(str2, str, this.u);
            requestLayout();
        }
        if (a) {
            a(new Throwable(), overlayedAvatarView, "Insert at " + i + " to " + i2);
        }
    }

    public int b(int i) {
        switch (OverlayedAvatarView.b(i)) {
            case wi.j /*1*/:
                return this.d;
            case wi.l /*2*/:
            case wi.h /*4*/:
                return this.r;
            default:
                return 0;
        }
    }

    public OverlayedAvatarView b(edk edk) {
        boolean z = true;
        OverlayedAvatarView a = OverlayedAvatarView.a(LayoutInflater.from(getContext()), edk.e, edk.b, this.k, true, this.p, this);
        if (this.t != 1) {
            z = false;
        }
        a.a(z);
        a.setTag(edk);
        return a;
    }

    public void a(gql gql, List<edk> list, boolean z) {
        boolean z2 = false;
        for (edk edk : list) {
            if (edk == null) {
                glk.e("Babel", "ParticipantsGalleryView.internalExecuteBatchWatermarkeUnset: null participant", new Object[0]);
            } else {
                boolean z3;
                OverlayedAvatarView c = c(edk);
                if (c != null) {
                    int b = c.b();
                    int c2 = c.c(1);
                    int b2 = OverlayedAvatarView.b(c2);
                    int b3 = OverlayedAvatarView.b(b);
                    if (d(edk)) {
                        c.f(c2);
                        if (a) {
                            a(null, c, "UnsetWatermark (COALESCED) " + b + " -> " + c2);
                        }
                    } else if (b2 == b3) {
                        c.e(c2);
                        if (a) {
                            a(null, c, "UnsetWatermark (HI EQ) " + b + " -> " + c2);
                        }
                    } else if (c2 == 0) {
                        c(edk, b, z);
                        z3 = true;
                        z2 = z3;
                    }
                }
                z3 = z2;
                z2 = z3;
            }
        }
        gql.a(z2);
    }

    public void b(gql gql, List<edk> list, boolean z) {
        boolean z2 = false;
        for (edk edk : list) {
            if (edk == null) {
                glk.e("Babel", "ParticipantsGalleryView.internalExecuteBatchWatermarkSet: null participant", new Object[0]);
            } else {
                boolean z3;
                OverlayedAvatarView c = c(edk);
                if (c == null) {
                    c = b(edk);
                }
                int b = c.b();
                int d = c.d(1);
                int b2 = OverlayedAvatarView.b(d);
                int b3 = OverlayedAvatarView.b(b);
                if (d(edk)) {
                    c.f(d);
                    if (a) {
                        a(null, c, "SetWatermark (COALESCED) " + b + " -> " + d);
                    }
                    z3 = z2;
                } else {
                    if (b2 == b3) {
                        c.e(d);
                        if (a) {
                            a(null, c, "SetWatermark (HI EQ) " + b + " -> " + d);
                        }
                    } else if (d == 1) {
                        a(edk, c, d, z);
                        z3 = true;
                    }
                    z3 = z2;
                }
                z2 = z3;
            }
        }
        gql.a(z2);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public void e() {
        synchronized (this.e) {
            for (OverlayedAvatarView f : this.e.values()) {
                f.f();
            }
            this.e.clear();
            f();
            this.r = 0;
            this.d = 0;
            if (a) {
                int childCount = this.q.getChildCount();
                String str = this.j ? "focus gallery." : "watermarks.";
                new StringBuilder(String.valueOf(str).length() + 48).append("[PartGallery] Removing ").append(childCount).append(" view(s) from ").append(str);
            }
            this.q.removeAllViews();
            this.g.removeMessages(0);
            this.h.clear();
            this.i = false;
            this.f = true;
        }
        a();
        synchronized (this.s) {
            for (Runnable removeCallbacks : this.s.values()) {
                removeCallbacks(removeCallbacks);
            }
            this.s.clear();
        }
        if (a) {
            a(null, null, "================ Switch Conversation ================");
        }
    }

    public OverlayedAvatarView c(edk edk) {
        OverlayedAvatarView overlayedAvatarView;
        synchronized (this.e) {
            overlayedAvatarView = (OverlayedAvatarView) this.e.get(edk.b);
        }
        return overlayedAvatarView;
    }

    public boolean d(edk edk) {
        boolean z;
        synchronized (this.s) {
            z = this.s.get(edk.b) != null;
        }
        return z;
    }

    private void a(edk edk, Runnable runnable) {
        synchronized (this.s) {
            this.s.put(edk.b, runnable);
        }
    }

    public void e(edk edk) {
        synchronized (this.s) {
            this.s.remove(edk.b);
        }
    }

    public void a(boolean z) {
        this.j = true;
    }

    private LayoutTransition f() {
        LayoutTransition layoutTransition = this.q.getLayoutTransition();
        this.q.setLayoutTransition(null);
        return layoutTransition;
    }

    public void c(int i) {
        if (this.p != i) {
            this.p = i;
            for (int i2 = 0; i2 < this.q.getChildCount(); i2++) {
                if (this.q.getChildAt(i2) instanceof OverlayedAvatarView) {
                    ((OverlayedAvatarView) this.q.getChildAt(i2)).g(i);
                }
            }
        }
    }

    public void a(int i, bko bko) {
        d(i);
        this.u = bko;
    }

    public void d(int i) {
        this.t = i;
        synchronized (this.e) {
            for (OverlayedAvatarView a : this.e.values()) {
                a.a(i == 1);
            }
        }
        a();
    }

    public void a(Throwable th, OverlayedAvatarView overlayedAvatarView, String str) {
        if (this.j) {
            StringBuilder stringBuilder = new StringBuilder();
            if (str != null) {
                stringBuilder.append(String.format(Locale.US, "%1$-96s", new Object[]{str}));
            }
            if (overlayedAvatarView != null) {
                stringBuilder.append(" :");
                stringBuilder.append(" Participant=").append(overlayedAvatarView.g().b).append(".");
                stringBuilder.append(OverlayedAvatarView.a(overlayedAvatarView.b()).replace("STATE_", "").subSequence(0, 1)).append(".");
                if (this.s.get(overlayedAvatarView.g()) != null) {
                    stringBuilder.append(OverlayedAvatarView.a(overlayedAvatarView.c()).replace("STATE_", "").subSequence(0, 1));
                } else {
                    stringBuilder.append("-");
                }
                stringBuilder.append(" Indices=(").append(this.r).append(", ");
                stringBuilder.append(this.d).append(") ");
                stringBuilder.append(" Avatars=[");
                for (int i = 0; i < this.q.getChildCount(); i++) {
                    if (i > 0) {
                        stringBuilder.append(", ");
                    }
                    View childAt = this.q.getChildAt(i);
                    if (childAt instanceof OverlayedAvatarView) {
                        OverlayedAvatarView overlayedAvatarView2 = (OverlayedAvatarView) childAt;
                        stringBuilder.append(overlayedAvatarView2.g().b).append(".");
                        stringBuilder.append(OverlayedAvatarView.a(overlayedAvatarView2.b()).replace("STATE_", "").subSequence(0, 1));
                    } else {
                        stringBuilder.append(childAt.getVisibility());
                    }
                }
                stringBuilder.append("]");
            }
            if (th != null) {
                stringBuilder.append(" @ ").append(Log.getStackTraceString(th).replace("\t", "").replace("\n", " ==> ").replace("com.google.android.apps.hangouts", "").subSequence(0, 512));
            }
            int identityHashCode = System.identityHashCode(this);
            String valueOf = String.valueOf(stringBuilder.toString());
            new StringBuilder(String.valueOf(valueOf).length() + 23).append("WATERMARK[").append(identityHashCode).append("]\t").append(valueOf);
        }
    }
}
