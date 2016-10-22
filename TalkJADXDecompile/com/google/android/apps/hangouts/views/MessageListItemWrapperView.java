package com.google.android.apps.hangouts.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import ba;
import bbw;
import bnx;
import bos;
import dyg;
import edk;
import edo;
import fqj;
import gir;
import gld;
import glk;
import gpk;
import gpx;
import gpy;
import gqn;
import gwb;
import java.util.ArrayList;
import java.util.List;
import kae;
import wi;

public class MessageListItemWrapperView extends LinearLayout implements gir, gqn {
    static int a;
    private static final boolean g;
    private static int h;
    private static int i;
    private static boolean z;
    private boolean A;
    public gpx b;
    public int c;
    public int d;
    public String e;
    public MessageListAnimationManager f;
    private dyg j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private int r;
    private ParticipantsGalleryView s;
    private FrameLayout t;
    private Space u;
    private long v;
    private boolean w;
    private boolean x;
    private boolean y;

    public class WatermarkGalleryStateTransition implements Runnable {
        public final int a;
        public final /* synthetic */ MessageListItemWrapperView b;
        private MessageListView c;
        private ObjectAnimator d;
        private final View e;
        private int f;
        private int g;
        private int h;
        private boolean i;
        private int j;
        private int k;

        public WatermarkGalleryStateTransition(MessageListItemWrapperView messageListItemWrapperView, View view, int i) {
            this.b = messageListItemWrapperView;
            this.a = i;
            this.e = view;
        }

        public void run() {
            if (this.a == 1) {
                this.j = 0;
                this.k = MessageListItemWrapperView.a(this.b.getResources());
            } else {
                this.j = MessageListItemWrapperView.a(this.b.getResources());
                this.k = 0;
            }
            this.d = ObjectAnimator.ofInt(this, "watermarkGalleryMeasuredHeightReduction", new int[]{this.j, this.k});
            if (gwb.a(this.b.getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                int i = this.j;
                glk.c("Babel_Scroll", "animating watermarkGalleryMeasuredHeightReduction between " + i + " and " + this.k, new Object[0]);
            }
            this.d.setDuration((long) MessageListItemWrapperView.a);
            this.d.setInterpolator(new bbw(0.4f, 0.4f));
            this.d.addListener(new gpy(this));
            gpk a = this.b.f.a();
            if (a != null) {
                a.a();
            }
            this.d.start();
        }

        public void setWatermarkGalleryMeasuredHeightReduction(int i) {
            boolean z;
            this.b.d = i;
            if (this.c == null) {
                this.c = (MessageListView) this.e.getParent();
            }
            if (this.c == null) {
                this.d.cancel();
                z = false;
            } else {
                if (!this.i) {
                    this.h = this.e.getTop();
                    this.g = this.c.getHeight();
                    this.f = this.c.getPositionForView(this.e);
                    this.i = true;
                }
                z = true;
            }
            if (z) {
                this.c.a(this.f, (this.h - (this.j - i)) - (this.g - this.c.getHeight()));
                this.b.requestLayout();
            }
        }
    }

    static {
        kae kae = glk.u;
        g = false;
        h = -1;
        i = -1;
        z = false;
    }

    public MessageListItemWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.x = false;
        this.y = false;
        this.A = false;
        b(0);
        setClipToPadding(false);
        a = getResources().getInteger(gwb.fF);
    }

    public void a(int i) {
        this.s.c(i);
    }

    public void b(boolean z) {
        this.A = z;
    }

    private static int b(Resources resources) {
        if (i == -1) {
            i = resources.getDimensionPixelSize(gwb.fb);
        }
        return i;
    }

    static int a(Resources resources) {
        if (h == -1) {
            h = resources.getDimensionPixelSize(gwb.ff);
        }
        return h;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        this.k = getMeasuredHeight();
        if (!(this.r == 4 || this.r != 1 || this.f == null || this.q)) {
            this.f.b(this);
            this.q = true;
        }
        if (this.n >= 0) {
            i3 = this.n;
        } else if (this.A) {
            i3 = this.k - a(getResources());
        } else {
            if (this.d >= 0) {
                i3 = this.d;
            } else {
                i3 = this.c;
            }
            i3 = this.k - i3;
        }
        setMeasuredDimension(getMeasuredWidth(), i3);
    }

    public void onFinishInflate() {
        this.t = (FrameLayout) findViewById(ba.dp);
        this.s = (ParticipantsGalleryView) findViewById(ba.gl);
        this.s.a((gqn) this);
        this.s.a((gir) this);
        this.u = (Space) findViewById(ba.V);
    }

    public void a(dyg dyg) {
        this.j = dyg;
        this.t.removeAllViews();
        this.t.addView(this.j.b());
    }

    public dyg c() {
        return this.j;
    }

    public void d() {
        this.r = 4;
    }

    public int a(float f) {
        if (g) {
            new StringBuilder(44).append("setRevealAnimationPercentage ").append(f);
        }
        int b = b(getResources());
        int paddingTop = (((this.k - getPaddingTop()) - getPaddingBottom()) + b) - this.c;
        int i = this.n;
        this.n = ((int) (((float) (paddingTop - this.l)) * f)) + this.l;
        this.o = (int) ((1.0f - f) * ((float) this.m));
        this.p = (int) (((float) b) * f);
        i();
        return this.n - i;
    }

    public static void c(boolean z) {
        z = z;
    }

    private void i() {
        setPadding(getPaddingLeft(), this.o, getPaddingRight(), this.p);
    }

    public long e() {
        return this.v;
    }

    public void a(Cursor cursor, bnx bnx, int i, bos bos) {
        long j = cursor.getLong(0);
        if (this.v != j) {
            f();
        }
        this.v = j;
        this.e = cursor.getString(1);
        this.w = cursor.isLast();
        boolean isFirst = cursor.isFirst();
        if (this.w) {
            this.f.a(this);
        } else if (this.f.b() == this) {
            this.f.a(null);
        }
        this.s.d(i);
        long j2 = cursor.getLong(6);
        long j3 = Long.MAX_VALUE;
        if (!this.w && cursor.moveToNext()) {
            j3 = cursor.getLong(6);
            cursor.moveToPrevious();
        }
        boolean z = false;
        if (!this.A) {
            boolean a = a(j2, j3, bnx, bos);
            List arrayList = new ArrayList();
            if (a) {
                for (fqj fqj : bos.a(j2, j3)) {
                    if (g) {
                        String str = this.e;
                        new StringBuilder(String.valueOf(str).length() + 100).append("[MessageListItem#bind] Associated watermark found for messageId ").append(str).append(" with timestamp ").append(j2);
                        str = String.valueOf(fqj.b());
                        new StringBuilder(String.valueOf(str).length() + 43).append("  gaiaId: ").append(str).append("  timestamp: ").append(fqj.c());
                    }
                    edo b = fqj.b();
                    if (!bnx.b(b)) {
                        edk a2 = bnx.a(b);
                        boolean c = bnx.c(b);
                        if (g) {
                            String valueOf = String.valueOf(b);
                            String str2 = this.e;
                            new StringBuilder((String.valueOf(valueOf).length() + 31) + String.valueOf(str2).length()).append("Have watermark for ").append(valueOf).append(" on message ").append(str2);
                            if (c) {
                                valueOf = String.valueOf(b);
                                new StringBuilder(String.valueOf(valueOf).length() + 30).append("  ").append(valueOf).append(" is focused; Hide watermark.");
                            }
                            if (a2 == null) {
                                valueOf = String.valueOf(b);
                                new StringBuilder(String.valueOf(valueOf).length() + 42).append("  ").append(valueOf).append(" not in participant map; Hide watermark.");
                            }
                            if (this.w) {
                                String valueOf2 = String.valueOf(b);
                                new StringBuilder(String.valueOf(valueOf2).length() + 38).append("  ").append(valueOf2).append(" is on last message; Hide watermark.");
                            }
                        }
                        if (!(a2 == null || c)) {
                            arrayList.add(a2);
                        }
                    }
                }
            }
            List c2 = this.b.c(this.e);
            this.b.a(this.e, arrayList);
            if (c2 != null && c2.size() > 0) {
                this.s.b(c2, false);
                if (arrayList.size() <= 0) {
                    this.s.a(c2, false);
                    z = a;
                } else if (!a(arrayList, c2)) {
                    List arrayList2 = new ArrayList(c2);
                    arrayList2.removeAll(arrayList);
                    List arrayList3 = new ArrayList(arrayList);
                    arrayList3.removeAll(c2);
                    if (arrayList3.size() > 0) {
                        this.s.b(arrayList3, true);
                    }
                    if (arrayList2.size() > 0) {
                        this.s.a(arrayList2, true);
                    }
                    z = a;
                }
            } else if (arrayList.size() > 0) {
                this.s.b(arrayList, false);
            }
            z = a;
        }
        this.p = 0;
        this.o = 0;
        switch (this.r) {
            case wi.w /*0*/:
                this.n = 0;
                break;
            case wi.j /*1*/:
                if (!this.x) {
                    this.x = true;
                    this.m = b(getResources());
                    long j4 = 0;
                    if (!isFirst && cursor.moveToPrevious()) {
                        j4 = cursor.getLong(6);
                        cursor.moveToNext();
                    }
                    if (!a(j4, j2, bnx, bos) && z) {
                        this.m += a(getResources());
                    }
                    this.o = this.m;
                    this.l = this.m;
                    this.n = this.l;
                    gld.a((View) this, null, this.j.b().getContentDescription());
                    break;
                }
                break;
            case wi.l /*2*/:
                this.p = b(getResources());
                break;
            case wi.z /*3*/:
            case wi.h /*4*/:
                break;
        }
        this.n = -1;
        i();
        a(!z);
        j();
    }

    public void b() {
        j();
    }

    private void j() {
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        CharSequence contentDescription = this.j.b().getContentDescription();
        if (!TextUtils.isEmpty(contentDescription)) {
            spannableStringBuilder.append(contentDescription);
        }
        contentDescription = this.s.getContentDescription();
        if (!TextUtils.isEmpty(contentDescription)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(", ");
            }
            spannableStringBuilder.append(contentDescription);
        }
        setContentDescription(spannableStringBuilder);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getContentDescription());
        }
    }

    public void f() {
        setTranslationX(0.0f);
        this.q = false;
        this.s.e();
        this.x = false;
    }

    public void b(int i) {
        this.r = i;
    }

    public void a(MessageListAnimationManager messageListAnimationManager) {
        this.f = messageListAnimationManager;
    }

    public void a(gpx gpx) {
        this.b = gpx;
    }

    public long g() {
        return this.j.a();
    }

    private void e(boolean z) {
        boolean k = k();
        if (z || k) {
            this.c = 0;
        } else {
            this.c = a(getResources());
        }
        if (gwb.a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
            glk.c("Babel_Scroll", "initializeWatermarkGalleryMeasuredHeightReduction setting mWatermarkGalleryMeasuredHeightReduction to " + this.c, new Object[0]);
        }
    }

    private boolean k() {
        return this.w && z;
    }

    public void a(boolean z) {
        this.y = z;
        h();
    }

    public void a() {
    }

    public void h() {
        int a;
        boolean z = true;
        if (this.b.b(this.e)) {
            a = this.b.a(this.e);
        } else {
            a = 0;
        }
        if (a != 4) {
            int i;
            if (this.A) {
                i = 1;
            } else if (k()) {
                i = 3;
            } else if (this.y) {
                i = 1;
            } else {
                i = 2;
            }
            if (a == i) {
                if (i == 1) {
                    z = false;
                }
                e(z);
                return;
            }
            if (gwb.a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                glk.c("Babel_Scroll", "reevaluateWatermarkGalleryExpansion: oldState=" + a + ", newState=" + i, new Object[0]);
            }
            boolean z2 = gpx.a(i) && gpx.a(a);
            if (a == 0 || a == 3 || a == 4 || z2) {
                this.b.a(this.e, i);
                if (i == 1) {
                    z = false;
                }
                e(z);
                return;
            }
            this.b.a(this.e, 4);
            post(new WatermarkGalleryStateTransition(this, this, i));
        }
    }

    private boolean a(long j, long j2, bnx bnx, bos bos) {
        if (this.w) {
            return false;
        }
        for (fqj b : bos.a(j, j2)) {
            edo b2 = b.b();
            if (!bnx.b(b2)) {
                edk a = bnx.a(b2);
                if (a == null) {
                    return true;
                }
                if (!(a == null || bnx.c(b2))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(List<edk> list, List<edk> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((edk) list.get(i)).b.a(((edk) list2.get(i)).b)) {
                return false;
            }
        }
        return true;
    }

    public void d(boolean z) {
        this.u.setVisibility(z ? 0 : 8);
    }
}
