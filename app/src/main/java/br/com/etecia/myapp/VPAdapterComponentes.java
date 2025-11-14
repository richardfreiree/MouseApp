package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPAdapterComponentes extends FragmentStateAdapter {

    public VPAdapterComponentes(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
         switch(position){
             case 0: return new TecladoFragment();
             case 1: return new MouseFragment();
             default: return new TecladoFragment();
         }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
