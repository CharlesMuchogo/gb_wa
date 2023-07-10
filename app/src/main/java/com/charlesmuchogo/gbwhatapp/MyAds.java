package com.charlesmuchogo.gbwhatapp;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MyAds {
    public Context context;
    private Activity activity;
    private InterstitialAd mInterstitialAd;

    public MyAds(Context context){
        this.context = context;
        this.activity = (Activity) context;
    }
    public void ShowInterestialAds(){
        MobileAds.initialize(context, initializationStatus -> {});
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(context,"ca-app-pub-7568606258610372/13305912", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {

                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.show(activity);

                        Log.i("Testing ads", "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d("Testing ads", loadAdError.toString());
                        mInterstitialAd = null;
                    }
                });
    }

    public void ShowBannerAds(AdView mAdView){
        MobileAds.initialize(context, initializationStatus -> {
        });
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
