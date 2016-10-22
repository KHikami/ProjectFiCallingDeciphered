import android.app.Fragment;
import android.app.ListFragment;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dialer.app.filterednumber.BlockedNumbersSettingsActivity;

/* compiled from: PG */
public final class ape extends ListFragment implements LoaderCallbacks, OnClickListener, axo {
    public View a;
    private View b;
    private TextView c;
    private TextView d;
    private apb e;
    private axn f;
    private View g;
    private View h;

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        this.e.swapCursor(cursor);
        if (buf.n() || cursor.getCount() == 0) {
            this.h.setVisibility(4);
        } else {
            this.h.setVisibility(0);
        }
    }

    public final Context getContext() {
        return getActivity();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        getListView().addHeaderView(layoutInflater.inflate(buf.hu, null));
        getListView().addFooterView(layoutInflater.inflate(buf.hs, null));
        ImageView imageView = (ImageView) getActivity().findViewById(aq.b);
        Drawable ade = new ade(getResources());
        ade.f = Character.valueOf('+');
        ade.e = gd.c(getActivity(), cob.T);
        ade.d = true;
        imageView.setImageDrawable(ade);
        if (this.e == null) {
            Context context = getContext();
            this.e = new apb(context, getActivity().getFragmentManager(), new awt(context, buf.g(context)), aaz.a(context));
        }
        setListAdapter(this.e);
        this.c = (TextView) getListView().findViewById(aq.k);
        this.b = getListView().findViewById(aq.aK);
        getListView().findViewById(aq.aL).setOnClickListener(this);
        this.a = getListView().findViewById(aq.ay);
        this.g = getListView().findViewById(aq.m);
        this.h = getActivity().findViewById(aq.j);
        getListView().findViewById(aq.ax).setOnClickListener(this);
        getListView().findViewById(aq.bG).setOnClickListener(this);
        getListView().findViewById(aq.c).setOnClickListener(this);
        this.d = (TextView) getActivity().findViewById(aq.i);
        this.f = new axn(getContext(), this);
        this.f.a();
        b();
    }

    public final void onDestroy() {
        setListAdapter(null);
        super.onDestroy();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLoaderManager().initLoader(0, null, this);
    }

    public final void onResume() {
        super.onResume();
        pl a = ((pz) getActivity()).e().a();
        a.a(new ColorDrawable(gd.c(getActivity(), cob.ad)));
        a.d(false);
        a.b(true);
        a.a(true);
        a.c(true);
        a.b(cob.cm);
        if (buf.n()) {
            this.b.setVisibility(0);
            this.c.setVisibility(8);
            getListView().findViewById(aq.c).setVisibility(8);
            getListView().findViewById(aq.c).setOnClickListener(null);
            this.h.setVisibility(8);
            this.a.setVisibility(8);
            getListView().findViewById(aq.ax).setOnClickListener(null);
            getListView().findViewById(aq.bG).setOnClickListener(null);
            this.g.setVisibility(8);
            this.d.setVisibility(8);
        } else {
            buf.a(getActivity(), new avd(this));
        }
        if (buf.n() || !buf.C(getContext())) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
        }
        this.f.a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(buf.ht, viewGroup, false);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(getContext(), awe.a, new String[]{"_id", "country_iso", "number", "normalized_number"}, "type=1", null, null);
    }

    public final void onLoaderReset(Loader loader) {
        this.e.swapCursor(null);
    }

    public final void onClick(View view) {
        Context context = (BlockedNumbersSettingsActivity) getActivity();
        if (context != null) {
            int id = view.getId();
            Fragment fragment;
            if (id == aq.c) {
                fragment = (apy) context.getFragmentManager().findFragmentByTag("blocked_search");
                if (fragment == null) {
                    fragment = new apy();
                    fragment.setHasOptionsMenu(false);
                    fragment.e = true;
                    fragment.f(false);
                }
                context.getFragmentManager().beginTransaction().replace(aq.l, fragment, "blocked_search").addToBackStack(null).commit();
                buf.H(context).a(19, context);
            } else if (id == aq.bG) {
                fragment = (apj) context.getFragmentManager().findFragmentByTag("view_numbers_to_import");
                if (fragment == null) {
                    fragment = new apj();
                }
                context.getFragmentManager().beginTransaction().replace(aq.l, fragment, "view_numbers_to_import").addToBackStack(null).commit();
            } else if (id == aq.ax) {
                buf.a(context, new apf(this));
            } else if (id == aq.aL) {
                view.setEnabled(false);
                new aum(getContext()).a(new apg(this, context));
            }
        }
    }

    public final void a() {
        b();
    }

    private final void b() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            if (this.f.a) {
                this.d.setText(cob.bd);
            } else {
                this.d.setText(cob.bc);
            }
        }
    }
}
