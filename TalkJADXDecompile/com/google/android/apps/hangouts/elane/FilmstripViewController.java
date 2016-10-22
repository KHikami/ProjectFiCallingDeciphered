package com.google.android.apps.hangouts.elane;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import ba;
import cse;
import ctd;
import cte;
import ctf;
import ctg;
import ctj;
import ctm;
import cuj;
import cvh;
import cvm;
import gwb;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import jyn;
import lym;

public class FilmstripViewController extends HorizontalScrollView implements cse {
    public ctf a;
    private final ctj b;
    private final cvh c;
    private OnTouchListener d;
    private final ctm e;
    private final cvm f;

    public FilmstripViewController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ctd(this);
        this.f = new cte(this);
        this.a = new ctf(this, context);
        addView(this.a);
        this.b = gwb.A((View) this).b();
        this.c = ((cuj) jyn.a(context, cuj.class)).a().h();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a(this.e);
        this.c.a(this.f);
        b();
        HashSet hashSet = new HashSet();
        hashSet.addAll(Collections.unmodifiableSet(this.a.a.keySet()));
        for (lym lym : this.c.c()) {
            hashSet.remove(lym.b);
            a(lym);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ctf ctf = this.a;
            FilmstripParticipantView filmstripParticipantView = (FilmstripParticipantView) ctf.a.get(str);
            if (filmstripParticipantView != null) {
                ctf.a.remove(str);
                filmstripParticipantView.a(new ctg(ctf, filmstripParticipantView));
                ctf.c.a();
            }
        }
        a();
    }

    protected void onDetachedFromWindow() {
        this.c.b(this.f);
        this.b.b(this.e);
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i, int i2) {
        b();
        super.onMeasure(i, i2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setScrollX((getScrollX() + i3) - i);
    }

    public void a(lym lym) {
        ctf ctf = this.a;
        if (!ctf.a.containsKey(lym.b)) {
            int i;
            ctf ctf2 = this.a;
            FilmstripParticipantView filmstripParticipantView = (FilmstripParticipantView) LayoutInflater.from(ctf2.getContext()).inflate(gwb.pm, null);
            String str = "";
            if (lym.d != null) {
                str = lym.d;
            }
            if (lym.k != null) {
                str = lym.k;
            }
            filmstripParticipantView.a = str;
            CharSequence a = cvh.a(filmstripParticipantView.getContext(), lym);
            filmstripParticipantView.setContentDescription(filmstripParticipantView.getResources().getString(ba.jP, new Object[]{a}));
            filmstripParticipantView.a(lym.b, lym.e, false);
            filmstripParticipantView.f.setText(a);
            ctf2.a.put(lym.b, filmstripParticipantView);
            int childCount = ctf2.getChildCount();
            while (true) {
                i = childCount - 1;
                if (i <= 0) {
                    break;
                }
                FilmstripParticipantView filmstripParticipantView2 = (FilmstripParticipantView) ctf2.getChildAt(i - 1);
                if (filmstripParticipantView2.b() && filmstripParticipantView2.a().compareTo(filmstripParticipantView.a()) < 0) {
                    break;
                }
                childCount = i;
            }
            ctf2.addView(filmstripParticipantView, i);
            ctf2.a();
            ctf2.c.a();
        }
    }

    private void b() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        int integer = getResources().getInteger(gwb.pg);
        TypedValue typedValue = new TypedValue();
        getResources().getValue(gwb.nY, typedValue, true);
        setMinimumHeight(Math.min(getResources().getDimensionPixelSize(gwb.nW), Math.min(point.x / integer, (int) (((float) point.y) * typedValue.getFloat()))));
    }

    public void a() {
        Collection<FilmstripParticipantView> unmodifiableCollection = Collections.unmodifiableCollection(this.a.a.values());
        int size = unmodifiableCollection.size();
        Object obj = this.b.c() != null ? 1 : null;
        for (FilmstripParticipantView filmstripParticipantView : unmodifiableCollection) {
            if (obj != null || size > 1) {
                filmstripParticipantView.c();
            } else {
                filmstripParticipantView.d();
            }
        }
        if (size > 0) {
            this.a.b.c();
        } else {
            this.a.b.d();
        }
    }

    public void a(OnTouchListener onTouchListener) {
        this.d = onTouchListener;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return (this.d != null && this.d.onTouch(this, motionEvent)) || super.dispatchTouchEvent(motionEvent);
    }
}
