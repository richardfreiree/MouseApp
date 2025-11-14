package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPAdapterTeclado extends FragmentStateAdapter {

    public VPAdapterTeclado(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
         switch(position){
             case 0: return new TecladoFragment();
             case 1: return new MouseFragment();
         }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
