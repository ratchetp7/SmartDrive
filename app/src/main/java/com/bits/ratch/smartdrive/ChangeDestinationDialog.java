package com.bits.ratch.smartdrive;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ChangeDestinationDialog.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ChangeDestinationDialog#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChangeDestinationDialog extends DialogFragment {
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    // Get the layout inflater
    LayoutInflater inflater = getActivity().getLayoutInflater();

}
