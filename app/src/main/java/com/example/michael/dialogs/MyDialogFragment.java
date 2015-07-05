package com.example.michael.dialogs;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MyDialogFragment extends DialogFragment implements DialogInterface.OnClickListener{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Pergunta")
                .setMessage("Voce entendeu como funciona os dialogs?")
                .setPositiveButton(R.string.yes, this)
                .setNegativeButton(R.string.no, this);

        return builder.create();

    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        String msg = "";

        if(which == DialogInterface.BUTTON_POSITIVE){
            msg = "Voce escolheu SIM!";
        }else if (which == DialogInterface.BUTTON_NEGATIVE){
            msg = "Voce escolheu NAO";
        }

        Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
    }
}
