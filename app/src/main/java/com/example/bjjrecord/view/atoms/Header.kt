package com.example.bjjrecord.view.atoms

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.example.bjjrecord.R
import com.example.bjjrecord.databinding.ViewAtomsHeaderBinding

class Header @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {
    private var binding: ViewAtomsHeaderBinding? = null

    var actionMyPage: OnClickListener? = null
        set(value) {
            field = value
            binding?.actionMyPage = field
        }

    var actionTag: OnClickListener? = null
        set(value) {
            field = value
            binding?.actionTag = field
        }

    init {
        setBackgroundResource(R.color.white)
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.view_atoms_header,
            this, true
        )
    }
}