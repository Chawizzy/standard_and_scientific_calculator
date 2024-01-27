package com.example.calculator.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import com.example.calculator.R;
import com.google.android.material.materialswitch.MaterialSwitch;

public class SettingsFragment extends Fragment {
    public static final String PREF_THEME = "theme_pref";
    public static final String KEY_THEME = "theme_key";

    private static final String TAG = "SettingsFragment";

    private MaterialSwitch materialSwitch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        materialSwitch = view.findViewById(R.id.material_switch);

        materialSwitch.setChecked(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES);

        updateSwitchText(materialSwitch.isChecked());

        materialSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Dark Theme
                    saveTheme(AppCompatDelegate.MODE_NIGHT_YES);
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                    // Light Theme
                    saveTheme(AppCompatDelegate.MODE_NIGHT_NO);
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        return view;
    }

    private void saveTheme(int theme) {
        if (getActivity() != null) {
            SharedPreferences preferences = getActivity().getSharedPreferences(PREF_THEME, Context.MODE_PRIVATE);
            preferences.edit().putInt(KEY_THEME, theme).apply();
        } else {
            Log.e(TAG, "Fragment not attached to an activity");
        }
    }

    private void updateSwitchText(boolean isDarkMode) {
        if (isDarkMode) {
            materialSwitch.setText(R.string.dark_mode);
        } else {
            materialSwitch.setText(R.string.light_mode);
        }
    }
}