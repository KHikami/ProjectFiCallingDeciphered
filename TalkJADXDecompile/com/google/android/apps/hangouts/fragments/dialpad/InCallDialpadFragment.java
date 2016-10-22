package com.google.android.apps.hangouts.fragments.dialpad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import ba;
import dem;
import dgg;
import did;
import dr;
import glk;
import gwb;
import wi;

public class InCallDialpadFragment extends dr implements dem {
    private final dgg a;
    private EditText b;
    private DialpadFragment c;
    private String d;

    public InCallDialpadFragment() {
        this.a = dgg.a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.gR, viewGroup, false);
        this.b = (EditText) inflate.findViewById(ba.cB);
        this.c = (DialpadFragment) getChildFragmentManager().a(ba.aH);
        this.c.a((dem) this);
        this.d = getActivity().getIntent().getStringExtra("extra_endpoint_jid");
        did s = this.a.s();
        if (s != null) {
            this.b.setText(s.M());
        }
        return inflate;
    }

    public void a(int i, boolean z) {
        char c = '\u0000';
        if (z) {
            switch (i) {
                case wi.q /*7*/:
                    c = '0';
                    break;
                case wi.m /*8*/:
                    c = '1';
                    break;
                case wi.n /*9*/:
                    c = '2';
                    break;
                case wi.dr /*10*/:
                    c = '3';
                    break;
                case wi.dB /*11*/:
                    c = '4';
                    break;
                case wi.dM /*12*/:
                    c = '5';
                    break;
                case wi.dD /*13*/:
                    c = '6';
                    break;
                case wi.g /*14*/:
                    c = '7';
                    break;
                case wi.dJ /*15*/:
                    c = '8';
                    break;
                case wi.dI /*16*/:
                    c = '9';
                    break;
                case wi.dK /*17*/:
                    c = '*';
                    break;
                case wi.dH /*18*/:
                    c = '#';
                    break;
                default:
                    glk.a("Babel", "keyCode is not a dtmf code: " + i, new Object[0]);
                    break;
            }
            if (c != '\u0000') {
                this.b.getText().append(c);
                did s = this.a.s();
                if (s == null) {
                    return;
                }
                if (this.d == null) {
                    s.a(c);
                } else {
                    s.a(this.d, c);
                }
            }
        }
    }

    public void a(int i) {
    }
}
