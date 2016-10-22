package com.google.android.apps.hangouts.statusmessage.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bm;
import gbg;
import gbm;
import kcv;
import lhj;
import lhk;
import lhm;
import lhp;
import lhx;
import ljb;
import lkb;

public final class StatusMessageSettingsFragment extends kcv implements lhj<gbm>, lhk<gbg> {
    private gbg a;
    private gbm b;
    private final ljb c;

    public /* synthetic */ Object a() {
        return c();
    }

    @Deprecated
    public StatusMessageSettingsFragment() {
        this.c = new ljb(this);
    }

    private StatusMessageSettingsFragment(Activity activity) {
        this.c = new ljb(this);
        a(activity);
    }

    private gbg b() {
        if (this.a != null) {
            return this.a;
        }
        throw new IllegalStateException("peer() called before initialized");
    }

    public Class<gbg> g() {
        return gbg.class;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.c.b();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            return onOptionsItemSelected;
        } finally {
            lkb.b("Fragment:onOptionsItemSelected");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.c.a();
        try {
            super.onActivityResult(i, i2, intent);
        } finally {
            lkb.b("Fragment:onActivityResult");
        }
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        super.getLayoutInflater(bundle);
        return new lhm(getActivity().getLayoutInflater().getContext(), this.b).b();
    }

    private void a(Activity activity) {
        try {
            this.b = (gbm) ((lhp) ((lhj) activity).a()).a(new lhx(this));
            this.a = this.b.b();
        } catch (Throwable e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        }
    }

    private gbm c() {
        return this.b;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        b().a(bundle);
    }

    public void onAttach(Activity activity) {
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onAttach(activity);
            if (this.a == null) {
                a(activity);
            }
            this.a.a(activity);
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        } catch (Throwable th) {
            int i2 = lkb.h;
            lkb.h = i2 - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i2) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i2 = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onCreate(bundle);
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        } catch (Throwable th) {
            int i2 = lkb.h;
            lkb.h = i2 - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i2) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i2 = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i2 = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            View a = b().a(layoutInflater, viewGroup, bundle);
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            }
            if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
            return a;
        } catch (Throwable th) {
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onViewCreated(view, bundle);
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        } catch (Throwable th) {
            int i2 = lkb.h;
            lkb.h = i2 - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i2) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i2 = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onActivityCreated(bundle);
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        } catch (Throwable th) {
            int i2 = lkb.h;
            lkb.h = i2 - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i2) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i2 = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }

    public void onStart() {
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onStart();
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        } catch (Throwable th) {
            int i2 = lkb.h;
            lkb.h = i2 - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i2) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i2 = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }

    public void onResume() {
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onResume();
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        } catch (Throwable th) {
            int i2 = lkb.h;
            lkb.h = i2 - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i2) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i2 = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }

    public void onPause() {
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onPause();
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        } catch (Throwable th) {
            int i2 = lkb.h;
            lkb.h = i2 - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i2) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i2 = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }

    public void onStop() {
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onStop();
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        } catch (Throwable th) {
            int i2 = lkb.h;
            lkb.h = i2 - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i2) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i2 = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }

    public void onDestroyView() {
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onDestroyView();
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        } catch (Throwable th) {
            int i2 = lkb.h;
            lkb.h = i2 - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i2) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i2 = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }

    public void onDestroy() {
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onDestroy();
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        } catch (Throwable th) {
            int i2 = lkb.h;
            lkb.h = i2 - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i2) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i2 = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }

    public void onDetach() {
        lkb.h++;
        if (lkb.i == 0 && lkb.c.get() == null && lkb.g != null) {
            int i = VERSION.SDK_INT;
            lkb.c.set(lkb.g);
            lkb.i = lkb.h;
        }
        try {
            super.onDetach();
            i = lkb.h;
            lkb.h = i - 1;
            if (lkb.h < 0) {
                throw new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        } catch (Throwable th) {
            int i2 = lkb.h;
            lkb.h = i2 - 1;
            if (lkb.h < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("More calls to pause than to resume");
            } else if (lkb.i == i2) {
                bm.a(lkb.g, (Object) "current async trace should not be null");
                i2 = VERSION.SDK_INT;
                lkb.c.set(null);
                lkb.i = 0;
            }
        }
    }
}
