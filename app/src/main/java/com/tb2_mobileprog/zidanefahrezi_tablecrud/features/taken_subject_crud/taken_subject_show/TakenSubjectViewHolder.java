package com.tb2_mobileprog.zidanefahrezi_tablecrud.features.taken_subject_crud.taken_subject_show;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tb2_mobileprog.zidanefahrezi_tablecrud.R;

class TakenSubjectViewHolder extends RecyclerView.ViewHolder {

    TextView subjectNameTextView;
    TextView courseCodeTextView;
    TextView creditTextView;
    ImageView deleteIcon;

    public TakenSubjectViewHolder(View itemView) {
        super(itemView);

        subjectNameTextView = itemView.findViewById(R.id.subjectNameTextView);
        courseCodeTextView = itemView.findViewById(R.id.courseCodeTextView);
        creditTextView = itemView.findViewById(R.id.creditTextView);
        deleteIcon = itemView.findViewById(R.id.deleteIcon);
    }
}
