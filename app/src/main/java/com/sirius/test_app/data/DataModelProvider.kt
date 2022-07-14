package com.sirius.test_app.data

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.sirius.test_app.DataModel

class DataModelProvider : PreviewParameterProvider<DataModel> {
    override val values: Sequence<DataModel>
        get() = listOf(DataModel()).asSequence()
}