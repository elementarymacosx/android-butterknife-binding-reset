package htin.linnzaw.butterknifebindingreset.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import butterknife.BindView;
import butterknife.ButterKnife;
import htin.linnzaw.butterknifebindingreset.R;

public class HomeFragment extends Fragment
{
    @BindView(R.id.text_home) TextView textView;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        HomeViewModel homeviewmodel;

        homeviewmodel = ViewModelProviders.of(this).get(HomeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeviewmodel.getText().observe(this, (s) -> textView.setText(s));

        ButterKnife.bind(this, root);
        return root;
    }
}