package com.example.michael.dialogs;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MultipleDialogFragment extends DialogFragment implements DialogInterface.OnMultiChoiceClickListener{
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        boolean[] checkeds = {true, false, true, false};

        return new AlertDialog.Builder(getActivity())
                .setTitle("Escolha uma banda")
                .setMultiChoiceItems(R.array.bandas, checkeds, this)
                .create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
        String[] bandas = getActivity().getResources().getStringArray(R.array.bandas);
        String banda = bandas[which];

        if(isChecked){
            Toast.makeText(getActivity(), getActivity().getString(R.string.chooseDialogSimple) + banda, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), getActivity().getString(R.string.choosemultiple) + banda, Toast.LENGTH_SHORT).show();
        }
    }
}
